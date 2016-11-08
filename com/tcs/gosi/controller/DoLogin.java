package com.tcs.gosi.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tcs.gosi.pojo.GenericClass;
import com.tcs.gosi.pojo.ims.DoLoginIMS;
import com.tcs.gosi.pojo.ims.ShiftInfo;
import com.tcs.gosi.pojo.ims.UserInfo;
import com.tcs.gosi.pojo.ims.UserLogInfo;
import com.tcs.gosi.pojo.ims.VehicleInfo;
import com.tcs.gosi.pojo.reqshift.M1ReqShift;

import org.springframework.stereotype.Controller;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.GZIPInputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@CrossOrigin
@RestController
public class DoLogin {
	protected final Log logger = LogFactory.getLog(getClass());
	
	@RequestMapping(value="/ouaf/mobility/dologin", method=RequestMethod.GET)
	public String doLogin(HttpServletRequest request, HttpServletResponse response) throws IOException, JSONException {
		ObjectMapper mapper4 = new ObjectMapper().enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY).enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
		DoLoginIMS dl = new DoLoginIMS();
		UserLogInfo uli = new UserLogInfo();
		ShiftInfo si = new ShiftInfo();
		List<UserInfo> uil = new ArrayList<>();
		List<VehicleInfo> vil = new ArrayList<>();
		String returnValue = "";
		HttpSession session = request.getSession(false);
		if(session != null) {
			new InvalidatePreviousSession().invalidatePreviousSession(request, response);
		}
		session = request.getSession();
		new Login().login(request, response);
		if(response.getStatus() == HttpServletResponse.SC_FORBIDDEN) {
			uli.setSucess("N");
			uli.setMessage("Wrong Username or Password!");
			dl.setUserLogInfo(uli);
			ObjectMapper mapper2 = new ObjectMapper();
			String jsonInString = mapper2.writeValueAsString(dl);
			return jsonInString;
		} else {
			uli.setSucess("Y");
			uli.setMessage("Login Sucessfull.");
			dl.setUserLogInfo(uli);
		}
		new RestSecurityToken().restSecurityToken(request, response);
		if(response.getStatus() != HttpServletResponse.SC_OK) {
			uli.setSucess("N1");
			uli.setMessage(response.getStatus() + "");
			ObjectMapper mapper2 = new ObjectMapper();
			String jsonInString = mapper2.writeValueAsString(dl);
			return jsonInString;
		} else {
			uli.setSucess("Y");
			uli.setMessage("Login Sucessfull.");
		}
		String registerDevice = new RegisterDevice().registerDevice(request, response);
		if(response.getStatus() != HttpServletResponse.SC_OK) {
			uli.setSucess("N2");
			uli.setMessage("Wrong Username or Password!");
			ObjectMapper mapper2 = new ObjectMapper();
			String jsonInString = mapper2.writeValueAsString(dl);
			return jsonInString;
		} else {
			uli.setSucess("Y");
			uli.setMessage("Login Sucessfull.");
		}
		System.out.println(registerDevice);
		String requestShift = new M1_ReqShift().getReqShift(request, response);
		System.out.println(requestShift);
		if(response.getStatus() == HttpServletResponse.SC_OK) {
			UserInfo ui = new UserInfo();
			VehicleInfo vi = new VehicleInfo();
		    M1ReqShift clazz = mapper4.readValue(requestShift, M1ReqShift.class);
		    si.setInspectorName(clazz.getM1ReqShift().getOutput().getBoData().getCrewName());
		    si.setStartDate(clazz.getM1ReqShift().getOutput().getBoData().getPlannedStartDateTime());
		    si.setEndDate(clazz.getM1ReqShift().getOutput().getBoData().getPlannedEndDateTime());
		    si.setStartAddress(clazz.getM1ReqShift().getOutput().getBoData().getLogonDetails().getLocation());
		    si.setEndAddress(clazz.getM1ReqShift().getOutput().getBoData().getLogoffDetails().getLocation());
		    si.setShiftStatus(clazz.getM1ReqShift().getOutput().getBoData().getBoStatus());
		    ui.setUserName(clazz.getM1ReqShift().getOutput().getBoData().getLogonUser());
		    uil.add(ui);
		    vil.add(vi);
		} else if(response.getStatus() == HttpServletResponse.SC_BAD_REQUEST) {
			JSONObject json = new JSONObject(requestShift);
			String ret = ((JSONObject)json.get("problemDetailDocument")).get("title").toString();
			uli.setSucess("N");
			uli.setMessage(ret);
		}
		dl.setShiftInfo(si);
		dl.setUserInfo(uil);
		dl.setVehicleInfo(vil);
		dl.setUserLogInfo(uli);
		ObjectMapper mapper2 = new ObjectMapper();
		String jsonInString = mapper2.writeValueAsString(dl);
		returnValue = jsonInString;
		response = null;
		return returnValue;
	}
}