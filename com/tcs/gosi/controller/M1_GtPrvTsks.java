package com.tcs.gosi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tcs.gosi.pojo.GenericClass;
import com.tcs.gosi.pojo.input;
import com.tcs.gosi.pojo.gtprvtsks.Input;
import com.tcs.gosi.pojo.reqshift.M1ReqShift;

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
public class M1_GtPrvTsks {
	protected final Log logger = LogFactory.getLog(getClass());
	
	@RequestMapping("/ouaf/mobility/rest/ouaf/script/M1-GtPrvTsks/")
	public
	@ResponseBody
	String gtPrvTsks(HttpServletRequest request, HttpServletResponse response) throws IOException {
		GenericClass<com.tcs.gosi.pojo.gtprvtsks.M1GtPrvTsks> gc = new GenericClass<>(com.tcs.gosi.pojo.gtprvtsks.M1GtPrvTsks.class);
		HttpURLConnection httpCon = gc.doReq(request, response, "/ouaf/mobility/rest/ouaf/script/M1-GtPrvTsks/");
		HttpSession session = request.getSession();
        ObjectMapper mapper2 = new ObjectMapper();
		com.tcs.gosi.pojo.gtprvtsks.M1GtPrvTsks m1GtPrvTsks = new com.tcs.gosi.pojo.gtprvtsks.M1GtPrvTsks();
		com.tcs.gosi.pojo.gtprvtsks.M1GtPrvTsks_ m1GtPrvTsks_ = new com.tcs.gosi.pojo.gtprvtsks.M1GtPrvTsks_();
		Mapper mapper = new DozerBeanMapper();
		Input destObject = mapper.map((input)session.getAttribute("input"), Input.class);
		m1GtPrvTsks.setM1GtPrvTsks(m1GtPrvTsks_);
		m1GtPrvTsks.getM1GtPrvTsks().setInput(destObject);
		m1GtPrvTsks.getM1GtPrvTsks().getInput().setShiftId(((M1ReqShift)session.getAttribute("reqShift")).getM1ReqShift().getOutput().getBoData().getShiftId());
		String jsonInString = mapper2.writeValueAsString(m1GtPrvTsks);
		String ret = gc.doRes(request, response, httpCon, jsonInString, "gtPrvTsks");
		return ret;
	}
}