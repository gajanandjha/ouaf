package com.tcs.gosi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tcs.gosi.pojo.GenericClass;
import com.tcs.gosi.pojo.input;
import com.tcs.gosi.pojo.reqshift.M1ReqShift;
import com.tcs.gosi.pojo.shflogon.Bodata;
import com.tcs.gosi.pojo.shflogon.Input;
import com.tcs.gosi.pojo.shflogon.InputOutput;
import com.tcs.gosi.pojo.shflogon.ResourceAllocationList;

import org.springframework.stereotype.Controller;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class M1_ShfLogon {
	protected final Log logger = LogFactory.getLog(getClass());
	
	@RequestMapping("/ouaf/mobility/rest/ouaf/script/M1-ShfLogon/")
	public
	@ResponseBody
	String shfLogon(HttpServletRequest request, HttpServletResponse response) throws IOException, JSONException {
		GenericClass<com.tcs.gosi.pojo.shflogon.M1ShfLogon> gc = new GenericClass<>(com.tcs.gosi.pojo.shflogon.M1ShfLogon.class);
		HttpURLConnection httpCon = gc.doReq(request, response, "/ouaf/mobility/rest/ouaf/script/M1-ShfLogon/");
		HttpSession session = request.getSession();
        ObjectMapper mapper2 = new ObjectMapper();
		com.tcs.gosi.pojo.shflogon.M1ShfLogon m1ShfLogon = new com.tcs.gosi.pojo.shflogon.M1ShfLogon();
		com.tcs.gosi.pojo.shflogon.M1ShfLogon_ m1ShfLogon_ = new com.tcs.gosi.pojo.shflogon.M1ShfLogon_();
		Mapper mapper = new DozerBeanMapper();
		Input destObject = mapper.map((input)session.getAttribute("input"), Input.class);
		m1ShfLogon.setM1ShfLogon(m1ShfLogon_);
		m1ShfLogon.getM1ShfLogon().setInput(destObject);
		m1ShfLogon.getM1ShfLogon().getInput().setShiftId(((M1ReqShift)session.getAttribute("reqShift")).getM1ReqShift().getOutput().getBoData().getShiftId());
		m1ShfLogon.getM1ShfLogon().getInput().setBoName(((M1ReqShift)session.getAttribute("reqShift")).getM1ReqShift().getOutput().getBoData().getBo());
		Mapper mapper3 = new DozerBeanMapper();
		Bodata boData = mapper3.map(((M1ReqShift)session.getAttribute("reqShift")).getM1ReqShift().getOutput().getBoData(), Bodata.class);
		InputOutput io = new InputOutput();
		io.setBodata(boData);
		m1ShfLogon.getM1ShfLogon().setInputOutput(io);
		m1ShfLogon.getM1ShfLogon().getInputOutput().getBodata().setLogonUser(m1ShfLogon.getM1ShfLogon().getInput().getUserId());
		DateFormat df = new SimpleDateFormat("YYYY-MM-dd-HH.mm.ss");
		Date dateobj = new Date();
		m1ShfLogon.getM1ShfLogon().getInputOutput().getBodata().setBoStatusDateTime(df.format(dateobj).toString());
		List<ResourceAllocationList> ral = m1ShfLogon.getM1ShfLogon().getInputOutput().getBodata().getResourceAllocation().getResourceAllocationList();
		for(ResourceAllocationList rs : ral)
			rs.setEffectiveDateTime(df.format(dateobj).toString());
		String jsonInString = mapper2.writeValueAsString(m1ShfLogon);
		String ret = gc.doRes(request, response, httpCon, jsonInString, "shfLogon");
		System.out.println(ret);
		String ret1 = "";
		try {
			JSONObject jo = new JSONObject(ret).getJSONObject("M1-ShfLogon").getJSONObject("inputOutput");
			if(jo.get("relatedEntities") != null) {
				ret1 = ((JSONObject)jo.getJSONObject("relatedEntities").getJSONArray("relatedEntityList").get(0)).getJSONObject("entityBoData").getJSONObject("completionInformation").getJSONObject("procedureStepCompletionDtls").getJSONObject("procedureSteps").toString();
			} else {
				ret1 = "";
			}
		} catch(JSONException ex) {
			;
		}
		return ret1;
	}
}