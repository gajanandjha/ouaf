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
import javax.servlet.http.HttpSession;

@Controller
public class Login {
	protected final Log logger = LogFactory.getLog(getClass());
	
	@RequestMapping("/ouaf/mobility/login")
	public
	@ResponseBody
	String login(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		//session.setAttribute("Host", "172.18.90.58:8888");
        session.setAttribute("Accept", " application/json; charset=utf-8");
        session.setAttribute("X-Requested-With", "XMLHttpRequest");
        session.setAttribute("x-mcpplatform", "M1RS");
        session.setAttribute("Referer", "http://172.18.90.58:8888/ouaf/mobility/www/index.html");
        session.setAttribute("Accept-Language", "en-US,en;q=0.8");
        session.setAttribute("Accept-Encoding", "gzip, deflate");
        session.setAttribute("Connection", " keep-alive");
        
        GenericClass<RestSecurityToken> gc = new GenericClass<>(RestSecurityToken.class);
		HttpURLConnection httpCon = gc.doReq(request, response, "/ouaf/mobility/login");
		String ret = gc.doRes(request, response, httpCon, null, null);
		return ret;
	}
}