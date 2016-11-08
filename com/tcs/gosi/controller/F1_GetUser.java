package com.tcs.gosi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.tcs.gosi.pojo.F1GetUser;
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
public class F1_GetUser {
	protected final Log logger = LogFactory.getLog(getClass());
	
	@RequestMapping("/ouaf/mobility/rest/ouaf/script/F1-GetUser/")
	public
	@ResponseBody
	String getUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		session.setAttribute("Context-Value", "MDT_ID=" + ((input)session.getAttribute("input")).getMdtId() + ",");
		session.setAttribute("Origin", "http://172.18.90.58:8888");
		
		GenericClass<com.tcs.gosi.pojo.F1_GetUser> gc = new GenericClass<>(com.tcs.gosi.pojo.F1_GetUser.class);
		HttpURLConnection httpCon = gc.doReq(request, response, "/ouaf/mobility/rest/ouaf/script/F1-GetUser/");
        Gson gson = new Gson();
		F1GetUser getUser = new F1GetUser();
		String jsonInString = gson.toJson(getUser).replace("F1_GetUser", "F1-GetUser");
		String ret = gc.doRes(request, response, httpCon, jsonInString, null);
		return ret;
	}
}