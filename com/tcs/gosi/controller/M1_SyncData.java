package com.tcs.gosi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tcs.gosi.pojo.GenericClass;
import com.tcs.gosi.pojo.SyncDataList;
import com.tcs.gosi.pojo.input;
import com.tcs.gosi.pojo.syncdata.Input;
import com.tcs.gosi.pojo.syncdata.M1SyncData;
import com.tcs.gosi.pojo.syncdata.Message;
import com.tcs.gosi.pojo.syncdata.Messages;
import com.tcs.gosi.pojo.syncdata.Output;

import org.springframework.stereotype.Controller;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class M1_SyncData {
	protected final Log logger = LogFactory.getLog(getClass());
	
	@RequestMapping("/ouaf/mobility/rest/ouaf/busSvc/M1-SyncData/")
	public
	@ResponseBody
	String syncData(HttpServletRequest request, HttpServletResponse response) throws IOException, JSONException {
		GenericClass<com.tcs.gosi.pojo.syncdata.M1SyncData> gc = new GenericClass<>(com.tcs.gosi.pojo.syncdata.M1SyncData.class);
		HttpURLConnection httpCon = gc.doReq(request, response, "/ouaf/mobility/rest/ouaf/busSvc/M1-SyncData/");
		HttpSession session = request.getSession();
        ObjectMapper mapper = new ObjectMapper();
        com.tcs.gosi.pojo.syncdata.M1SyncData m1SyncData = new com.tcs.gosi.pojo.syncdata.M1SyncData();
        com.tcs.gosi.pojo.syncdata.M1SyncData_ m1SyncData_ = new com.tcs.gosi.pojo.syncdata.M1SyncData_();
        Input inp = new Input();
        inp.setMdtId(((input)session.getAttribute("input")).getMdtId());
        inp.setMessages("");
        m1SyncData_.setInput(inp);
        m1SyncData.setM1SyncData(m1SyncData_);
		String jsonInString = mapper.writeValueAsString(m1SyncData);
		String ret = gc.doRes(request, response, httpCon, jsonInString, "syncData");
		if(session.getAttribute("syncDataList") == null) {
			Mapper mapper3 = new DozerBeanMapper();
			SyncDataList destObject = mapper3.map((M1SyncData)session.getAttribute("syncData"), SyncDataList.class);
			if(destObject.getM1SyncData().getOutput() == null) {
				destObject.getM1SyncData().setOutput(new Output());
				destObject.getM1SyncData().getOutput().setMessages(new Messages());
				destObject.getM1SyncData().getOutput().getMessages().setMessage(new ArrayList<Message>());
			} else if(destObject.getM1SyncData().getOutput().getMessages() == null) {
				destObject.getM1SyncData().getOutput().setMessages(new Messages());
				destObject.getM1SyncData().getOutput().getMessages().setMessage(new ArrayList<Message>());
			} else if(destObject.getM1SyncData().getOutput().getMessages().getMessage() == null) {
				destObject.getM1SyncData().getOutput().getMessages().setMessage(new ArrayList<Message>());
			}
			session.setAttribute("syncDataList", destObject);
		} else {
			ObjectMapper mapper1 = new ObjectMapper();
			String syncDataAsString = mapper1.writeValueAsString((M1SyncData)session.getAttribute("syncData"));
			String syncDataListAsString = mapper1.writeValueAsString((SyncDataList)session.getAttribute("syncDataList"));
			JSONObject sd = new JSONObject(syncDataAsString).getJSONObject("M1-SyncData");
			JSONObject sdl = new JSONObject(syncDataListAsString).getJSONObject("M1-SyncData");
			if(sd.get("output") != null && ((JSONObject)sd.get("output")).get("messages") != null && ((JSONObject)((JSONObject)sd.get("output")).get("messages")).get("message") != null) {
				for(int len1 = 0; len1 < ((JSONArray)((JSONObject)((JSONObject)sd.get("output")).get("messages")).get("message")).length(); len1++) {
					boolean exists = false;
					for(int len2 = 0; len2 < ((JSONArray)((JSONObject)((JSONObject)sdl.get("output")).get("messages")).get("message")).length(); len2++) {
						if(((JSONObject)((JSONArray)((JSONObject)((JSONObject)sd.get("output")).get("messages")).get("message")).get(len1)).get("msgId").equals(((JSONObject)((JSONArray)((JSONObject)((JSONObject)sdl.get("output")).get("messages")).get("message")).get(len2)).get("msgId"))) {
							exists = true;
							break;
						}
					}
					if(!exists) {
						ObjectMapper mapper4 = new ObjectMapper().enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY).enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
					    Message message = mapper4.readValue(((JSONObject)((JSONArray)((JSONObject)((JSONObject)sd.get("output")).get("messages")).get("message")).get(len1)).toString(), Message.class);
						((SyncDataList)session.getAttribute("syncDataList")).getM1SyncData().getOutput().getMessages().getMessage().add(message);
					}
				}
			}
		}
		String taskId = ((SyncDataList)session.getAttribute("syncDataList")).getM1SyncData().getOutput().getMessages().getMessage().get(0).getMsgData().getInput().getBoData().getTaskId();
		String taskType = ((SyncDataList)session.getAttribute("syncDataList")).getM1SyncData().getOutput().getMessages().getMessage().get(0).getMsgData().getInput().getBoData().getTaskType();
		String taskStatus = ((SyncDataList)session.getAttribute("syncDataList")).getM1SyncData().getOutput().getMessages().getMessage().get(0).getMsgData().getInput().getBoData().getBoStatus();
		//ObjectMapper mapper2 = new ObjectMapper();
		//String syncDataListAsString = mapper2.writeValueAsString((SyncDataList)session.getAttribute("syncDataList"));
		return "{\"taskId\":\"" + taskId + "\",\"taskType\":\"" + taskType + "\",\"taskStatus\":\"" + taskStatus + "\",\"taskETA\":\"\"}";
	}
}