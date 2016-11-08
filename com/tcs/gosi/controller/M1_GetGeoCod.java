package com.tcs.gosi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tcs.gosi.pojo.GenericClass;
import com.tcs.gosi.pojo.input;
import com.tcs.gosi.pojo.syncdata.Input;

import org.springframework.stereotype.Controller;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;
import java.net.HttpURLConnection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class M1_GetGeoCod {
	protected final Log logger = LogFactory.getLog(getClass());
	
	@RequestMapping("/ouaf/mobility/rest/ouaf/script/M1-GetGeoCod/")
	public
	@ResponseBody
	String getGeoCod(HttpServletRequest request, HttpServletResponse response) throws IOException {
		GenericClass<com.tcs.gosi.pojo.getgeocod.M1GetGeoCod> gc = new GenericClass<>(com.tcs.gosi.pojo.getgeocod.M1GetGeoCod.class);
		HttpURLConnection httpCon = gc.doReq(request, response, "/ouaf/mobility/rest/ouaf/script/M1-GetGeoCod/");
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
		String ret = gc.doRes(request, response, httpCon, jsonInString, "getGeoCod");
		return ret;
	}
}