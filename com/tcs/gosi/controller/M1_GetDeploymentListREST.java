package com.tcs.gosi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.tcs.gosi.pojo.GenericClass;
import com.tcs.gosi.pojo.M1GetDeploymentListREST;
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
public class M1_GetDeploymentListREST {
	protected final Log logger = LogFactory.getLog(getClass());
	
	@RequestMapping("/ouaf/mobility/rest/ouaf/busSvc/M1-GetDeploymentListREST/")
	public
	@ResponseBody
	String getDeploymentListREST(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		session.setAttribute("Context-Value", "MDT_ID=" + ((input)session.getAttribute("input")).getMdtId() + ",");
		
		GenericClass<com.tcs.gosi.pojo.M1GetDeploymentListREST> gc = new GenericClass<>(com.tcs.gosi.pojo.M1GetDeploymentListREST.class);
		HttpURLConnection httpCon = gc.doReq(request, response, "/ouaf/mobility/rest/ouaf/busSvc/M1-GetDeploymentListREST/");
        Gson gson = new Gson();
		M1GetDeploymentListREST m1GetDeploymentListREST = new M1GetDeploymentListREST();
		logger.info("Input is: " + (input)session.getAttribute("input"));
		logger.info("Language is: " + session.getAttribute("x-mdtlanguage").toString());
		((input)session.getAttribute("input")).setLanguageCode(session.getAttribute("x-mdtlanguage").toString());
		m1GetDeploymentListREST.getM1_GetDeploymentListREST().setInput((input)session.getAttribute("input"));
		String jsonInString = gson.toJson(m1GetDeploymentListREST).replace("M1_GetDeploymentListREST", "M1-GetDeploymentListREST");
		String ret = gc.doRes(request, response, httpCon, jsonInString, null);
		return ret;
	}
}