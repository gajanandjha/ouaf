package com.tcs.gosi.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tcs.gosi.pojo.GenericClass;

import org.springframework.stereotype.Controller;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;
import java.net.HttpURLConnection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class DeploymentDetails {
	protected final Log logger = LogFactory.getLog(getClass());
	
	@RequestMapping("/ouaf/mobility/rest/mobile/api/deployment/{reqDepId}")
	public
	@ResponseBody
	String getDeploymentDetails(@PathVariable String reqDepId, HttpServletRequest request, HttpServletResponse response) throws IOException {
		GenericClass<com.tcs.gosi.pojo.deployment.DeploymentDetails> gc = new GenericClass<>(com.tcs.gosi.pojo.deployment.DeploymentDetails.class);
		HttpURLConnection httpCon = gc.doReq(request, response, "/ouaf/mobility/rest/mobile/api/deployment/" + reqDepId);
		String ret = gc.doRes(request, response, httpCon, null, "deploymentDetails");
		return ret;
	}
}