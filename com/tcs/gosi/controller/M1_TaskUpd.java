package com.tcs.gosi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tcs.gosi.pojo.GenericClass;
import com.tcs.gosi.pojo.M1Assignment;
import com.tcs.gosi.pojo.SyncDataList;
import com.tcs.gosi.pojo.input;
import com.tcs.gosi.pojo.gtprvtsks.M1GtPrvTsks;
import com.tcs.gosi.pojo.reqshift.M1ReqShift;
import com.tcs.gosi.pojo.syncdata.BoData;
import com.tcs.gosi.pojo.taskupd.M1TaskUpd;
import com.tcs.gosi.pojo.taskupd.M1TaskUpd_;

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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class M1_TaskUpd {
	protected final Log logger = LogFactory.getLog(getClass());
	
	@RequestMapping("/ouaf/mobility/rest/ouaf/script/M1-TaskUpd/")
	public
	@ResponseBody
	String taskUpd(HttpServletRequest request, HttpServletResponse response) throws IOException, JSONException {
		HttpSession session = request.getSession();
		session.setAttribute("Context-Value", "MDT_ID=" + ((input)session.getAttribute("input")).getMdtId() + ",M1SH=" + ((M1ReqShift)session.getAttribute("reqShift")).getM1ReqShift().getOutput().getBoData().getShiftId() + ",M1TA=" + request.getParameter("taskId").toString());
		GenericClass<com.tcs.gosi.pojo.taskupd.M1TaskUpd> gc = new GenericClass<>(com.tcs.gosi.pojo.taskupd.M1TaskUpd.class);
		HttpURLConnection httpCon = gc.doReq(request, response, "/ouaf/mobility/rest/ouaf/script/M1-TaskUpd/");
        ObjectMapper mapper = new ObjectMapper();
        String taskId = request.getParameter("taskId");
        String action = request.getParameter("action");
        String reason = request.getParameter("reason");
        ObjectMapper mapper1 = new ObjectMapper();
		String syncDataListAsString = mapper1.writeValueAsString((SyncDataList)session.getAttribute("syncDataList"));
		JSONObject sdl = new JSONObject(syncDataListAsString).getJSONObject("M1-SyncData");
		boolean found = false;
		com.tcs.gosi.pojo.taskupd.BoData destObject = null;
		if(sdl.get("output") != null && ((JSONObject)sdl.get("output")).get("messages") != null && ((JSONObject)((JSONObject)sdl.get("output")).get("messages")).get("message") != null) {
			for(int len1 = 0; len1 < ((JSONArray)((JSONObject)((JSONObject)sdl.get("output")).get("messages")).get("message")).length(); len1++) {
				if(((JSONObject)((JSONObject)((JSONObject)((JSONArray)((JSONObject)((JSONObject)sdl.get("output")).get("messages")).get("message")).get(len1)).get("msgData")).get("input")).get("boName").toString().equals("M1-Assignment")) {
					if(((JSONObject)((JSONObject)((JSONObject)((JSONObject)((JSONArray)((JSONObject)((JSONObject)sdl.get("output")).get("messages")).get("message")).get(len1)).get("msgData")).get("input")).get("boData")).get("taskId").toString().equals(taskId)) {
						ObjectMapper mapper4 = new ObjectMapper().enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY).enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
						BoData boData = mapper4.readValue(((JSONObject)((JSONObject)((JSONObject)((JSONObject)((JSONArray)((JSONObject)((JSONObject)sdl.get("output")).get("messages")).get("message")).get(len1)).get("msgData")).get("input")).get("boData")).toString(), BoData.class);
						Mapper mapper5 = new DozerBeanMapper();
						M1Assignment m1Assignment = mapper5.map(boData, M1Assignment.class);
						Mapper mapper6 = new DozerBeanMapper();
						destObject = mapper6.map(m1Assignment, com.tcs.gosi.pojo.taskupd.BoData.class);
						destObject.setBoStatus(action);
						destObject.setStatusReason(reason);
						DateFormat df = new SimpleDateFormat("YYYY-MM-dd-HH.mm.ss");
						Date dateobj = new Date();
						destObject.setBusinessStatusDateTime(df.format(dateobj).toString());
						found = true;
						break;
					}
				}
			}
		}
		String ret = "";
		if(found) {
			M1TaskUpd m1TaskUpd = new M1TaskUpd();
			M1TaskUpd_ m1TaskUpd_ = new M1TaskUpd_();
			com.tcs.gosi.pojo.taskupd.Input in = new com.tcs.gosi.pojo.taskupd.Input();
			in.setBoData(destObject);
			in.setUpdateAction(true);
			in.setSentFromMDT(((input)session.getAttribute("input")).getMdtId());
			in.setBoName("M1-Assignment");
			m1TaskUpd_.setInput(in);
			m1TaskUpd.setM1TaskUpd(m1TaskUpd_);
			String jsonInString = mapper.writeValueAsString(m1TaskUpd);
			ret = gc.doRes(request, response, httpCon, jsonInString, null);
		} else {
			ret = "IMS0001: No Task found for the corresponding taskId";
		}
		return ret;
	}
}