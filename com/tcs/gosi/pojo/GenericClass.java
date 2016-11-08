package com.tcs.gosi.pojo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.GZIPInputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONException;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GenericClass<T> {
	
	protected final Log logger = LogFactory.getLog(getClass());
	Class<T> typeParameterClass;

	public GenericClass(Class<T> typeParameterClass) {
		this.typeParameterClass = typeParameterClass;
	}
	
	public HttpURLConnection doReq(HttpServletRequest request, HttpServletResponse response, String uri) throws IOException {
		HttpSession session = request.getSession();
		response.setContentType("text/html");
	    response.setCharacterEncoding("UTF-8");
	    Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxy.tcs.com", 8080));
		URL httpUrl = new URL("http://172.18.90.58:8888" + uri);
		HttpURLConnection.setFollowRedirects(false);
		HttpURLConnection httpCon = (HttpURLConnection) httpUrl.openConnection(proxy);
		
		//session.setAttribute("Context-Value", "MDT_ID=" + ((input)session.getAttribute("input")).getMdtId() + ",");
		
		Enumeration<?> e = session.getAttributeNames();
        while (e.hasMoreElements()) {
            String name = (String) e.nextElement();
            Object value = session.getAttribute(name);
            logger.info(name + ": " + value.toString());
            httpCon.setRequestProperty(name, value.toString());
        }
		
		Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            if(!headerName.equalsIgnoreCase("Cookie") && !headerName.equalsIgnoreCase("Host") && !headerName.equalsIgnoreCase("Accept-Encoding") && !headerName.equalsIgnoreCase("Connection") && !headerName.equalsIgnoreCase("User-Agent")) {
            	logger.info(headerName + ": " + request.getHeader(headerName).toString());
            	httpCon.setRequestProperty(headerName, request.getHeader(headerName).toString());
            	session.setAttribute(headerName, request.getHeader(headerName).toString());
            }
        }
        return httpCon;
	}
	
	public String doRes(HttpServletRequest request, HttpServletResponse response, HttpURLConnection httpCon, String jsonInString, String sessionName) throws IOException {
		
		HttpSession session = request.getSession();
		logger.info("Payload: " + jsonInString);
		
		httpCon.setUseCaches(false);
	    httpCon.setDoInput(true);
	    httpCon.setDoOutput(true);
	    
	    if(jsonInString != null) {
	    	httpCon.setRequestMethod("POST");
	    	httpCon.setRequestProperty( "Content-Length", Integer.toString(jsonInString.length()));
	    	OutputStream os = httpCon.getOutputStream();
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
			writer.write(jsonInString);
			writer.flush();
			writer.close();
			os.close();
	    }

		httpCon.connect();
	    
	    try {
	    	response.setStatus(httpCon.getResponseCode());
	    } catch(IOException ex) {
	    	response.setStatus(403);
	    }
		if(httpCon.getHeaderField("Set-Cookie") != null) {
			session.setAttribute("Cookie", httpCon.getHeaderField("Set-Cookie"));
			logger.info("Cookie: " + httpCon.getHeaderField("Set-Cookie"));
		}
		Map<String, List<String>> headers = new HashMap<>();
		headers = httpCon.getHeaderFields();
		for(Entry<String, List<String>> set : headers.entrySet()) {
			if(set.getKey() != null && !set.getKey().equalsIgnoreCase("Set-Cookie")) {
				logger.info(set.getKey() + ": " + set.getValue());
				String values = "";
				for(String value : set.getValue())
					values += value + ";";
				response.setHeader(set.getKey(), values.substring(0, values.length() - 1));
				if(set.getKey().equalsIgnoreCase("OUAF-Security-Token")) 
					session.setAttribute(set.getKey(), values.substring(0, values.length() - 1));
			}
		}
		if(httpCon.getResponseCode() == HttpURLConnection.HTTP_OK) {
			String ret = "";
			Reader reader = null;
		      if ("gzip".equals(httpCon.getContentEncoding())) {
		         reader = new InputStreamReader(new GZIPInputStream(httpCon.getInputStream()));
		      }
		      else {
		         reader = new InputStreamReader(httpCon.getInputStream());
		      }

		      while (true) {
		         int ch = reader.read();
		         if (ch==-1) {
		            break;
		         }
		         ret += (char)ch;
		      }
		      if(sessionName != null) {
		    	  if(sessionName.equals("deploymentDetails")) {
			    	  JSONObject json;
				      try {
				    	  json = new JSONObject(ret);
				    	  ((JSONObject)json.get("content")).remove("messages");
				    	  ((JSONObject)json.get("content")).remove("boMap");
				    	  ((JSONObject)json.get("content")).remove("moMap");
				    	  ret = json.toString();
				      } catch (JSONException e1) {
				    	  e1.printStackTrace();
				      }
			      }
		    	  ObjectMapper mapper4 = new ObjectMapper().enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY).enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
			      T clazz = mapper4.readValue(ret, typeParameterClass);
			      session.setAttribute(sessionName, clazz);
		      }
		      return ret;
		} else if(httpCon.getResponseCode() == HttpURLConnection.HTTP_BAD_REQUEST) {
			String ret = "";
			Reader reader = null;
		      if ("gzip".equals(httpCon.getContentEncoding())) {
		         reader = new InputStreamReader(new GZIPInputStream(httpCon.getErrorStream()));
		      }
		      else {
		         reader = new InputStreamReader(httpCon.getErrorStream());
		      }

		      while (true) {
		         int ch = reader.read();
		         if (ch==-1) {
		            break;
		         }
		         ret += (char)ch;
		      }
//		      try {
//		    	  JSONObject json = new JSONObject(ret);
//		    	  ret = ((JSONObject)json.get("problemDetailDocument")).get("title").toString() + ": Input: " + jsonInString;
//		      } catch (JSONException e1) {
//		    	  // TODO Auto-generated catch block
//		    	  e1.printStackTrace();
//		      }
		      return ret;
		} else {
			return "";
		}
	}
}
