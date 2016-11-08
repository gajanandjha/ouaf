package com.tcs.gosi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.tcs.gosi.pojo.GenericClass;
import com.tcs.gosi.pojo.input;

import org.springframework.stereotype.Controller;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;
import java.net.HttpURLConnection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class RegisterDevice {
	protected final Log logger = LogFactory.getLog(getClass());
	
	@RequestMapping("/ouaf/mobility/rest/mobile/api/registerDevice")
	public
	@ResponseBody
	String registerDevice(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		session.setAttribute("x-clientversion", "230000.0");
        session.setAttribute("x-releaseversion", "2.3.0.0");
        session.setAttribute("Access-Control-Allow-Methods", "GET, PUT, POST, DELETE, OPTIONS");
        session.setAttribute("Content-Type", "application/json");
        session.setAttribute("x-mdtlanguage", "ENG");
        session.setAttribute("contentType", "application/json; charset=utf-8");
        session.setAttribute("Context-Value", "MDT_ID=null,");
        
        GenericClass<RegisterDevice> gc = new GenericClass<>(RegisterDevice.class);
		HttpURLConnection httpCon = gc.doReq(request, response, "/ouaf/mobility/rest/mobile/api/registerDevice?Unique_ID=" + request.getParameter("Unique_ID").toString() + "&Port_No=" + request.getParameter("Port_No").toString() + "&MDT_Tag=" + request.getParameter("MDT_Tag").toString());
		String ret = gc.doRes(request, response, httpCon, null, null);
		input input = new Gson().fromJson(ret, input.class);
		session.setAttribute("input", input);
		return ret;
	}
}