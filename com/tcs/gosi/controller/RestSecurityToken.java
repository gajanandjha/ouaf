package com.tcs.gosi.controller;

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
public class RestSecurityToken {
	protected final Log logger = LogFactory.getLog(getClass());
	
	@RequestMapping("/ouaf/mobility/restSecurityToken")
	public
	@ResponseBody
	String restSecurityToken(HttpServletRequest request, HttpServletResponse response) throws IOException {
		GenericClass<RestSecurityToken> gc = new GenericClass<>(RestSecurityToken.class);
		HttpURLConnection httpCon = gc.doReq(request, response, "/ouaf/mobility/restSecurityToken");
		String ret = gc.doRes(request, response, httpCon, null, null);
		return ret;
	}
}