package com.tcs.gosi.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tcs.gosi.pojo.GenericClass;
import com.tcs.gosi.pojo.input;

import org.springframework.stereotype.Controller;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;
import java.net.HttpURLConnection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class DeploymentSettings {
	protected final Log logger = LogFactory.getLog(getClass());
	
	@RequestMapping("/ouaf/mobility/rest/mobile/api/settings/{reqDepId}")
	public
	@ResponseBody
	String getDeploymentSettings(@PathVariable String reqDepId, HttpServletRequest request, HttpServletResponse response) throws IOException {
		GenericClass<com.tcs.gosi.pojo.settings.DeploymentSettings> gc = new GenericClass<>(com.tcs.gosi.pojo.settings.DeploymentSettings.class);
		HttpURLConnection httpCon = gc.doReq(request, response, "/ouaf/mobility/rest/mobile/api/settings/" + ((input)request.getSession().getAttribute("input")).getMdtId() + "/M1IN/" + reqDepId + "/false");
		String ret = gc.doRes(request, response, httpCon, null, "deploymentSettings");
		return ret;
	}
}