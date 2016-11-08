package com.tcs.gosi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tcs.gosi.pojo.GenericClass;
import com.tcs.gosi.pojo.input;
import com.tcs.gosi.pojo.reqshift.Input;
import com.tcs.gosi.pojo.reqshift.M1ReqShift;
import com.tcs.gosi.pojo.reqshift.M1ReqShift_;

import org.springframework.stereotype.Controller;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import java.io.IOException;
import java.net.HttpURLConnection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class M1_ReqShift {
	protected final Log logger = LogFactory.getLog(getClass());
	
	@RequestMapping("/ouaf/mobility/rest/ouaf/script/M1-ReqShift/")
	public
	@ResponseBody
	String getReqShift(HttpServletRequest request, HttpServletResponse response) throws IOException {
		GenericClass<com.tcs.gosi.pojo.reqshift.M1ReqShift> gc = new GenericClass<>(com.tcs.gosi.pojo.reqshift.M1ReqShift.class);
		HttpURLConnection httpCon = gc.doReq(request, response, "/ouaf/mobility/rest/ouaf/script/M1-ReqShift/");
		HttpSession session = request.getSession();
        ObjectMapper mapper1 = new ObjectMapper();
		M1ReqShift m1ReqShift = new M1ReqShift();
		M1ReqShift_ m1ReqShift_ = new M1ReqShift_();
		Mapper mapper = new DozerBeanMapper();
		Input destObject = mapper.map((input)session.getAttribute("input"), Input.class);
		m1ReqShift.setM1ReqShift(m1ReqShift_);
		m1ReqShift.getM1ReqShift().setInput(destObject);
		m1ReqShift.getM1ReqShift().getInput().setCurrentShiftId("");
		String jsonInString = mapper1.writeValueAsString(m1ReqShift);
		String ret = gc.doRes(request, response, httpCon, jsonInString, "reqShift");
		return ret;
	}
}