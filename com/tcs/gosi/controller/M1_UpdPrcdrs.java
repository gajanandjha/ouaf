package com.tcs.gosi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tcs.gosi.pojo.GenericClass;
import com.tcs.gosi.pojo.input;
import com.tcs.gosi.pojo.reqshift.M1ReqShift;
import com.tcs.gosi.pojo.shflogon.M1ShfLogon;
import com.tcs.gosi.pojo.updprcdrs.M1UpdPrcdrs;
import com.tcs.gosi.pojo.updprcdrs.M1UpdPrcdrs_;
import com.tcs.gosi.pojo.updprcdrs.ProcedureBoData;
import com.tcs.gosi.pojo.updprcdrs.ProcedureSteps;

import org.springframework.stereotype.Controller;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import java.io.IOException;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class M1_UpdPrcdrs {
	protected final Log logger = LogFactory.getLog(getClass());
	
	@RequestMapping("/ouaf/mobility/rest/ouaf/script/M1-UpdPrcdrs/")
	public
	@ResponseBody
	String updPrcdrs(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		session.setAttribute("Context-Value", "MDT_ID=" + ((input)session.getAttribute("input")).getMdtId() + ",M1SH=" + ((M1ReqShift)session.getAttribute("reqShift")).getM1ReqShift().getOutput().getBoData().getShiftId());
		GenericClass<com.tcs.gosi.pojo.updprcdrs.M1UpdPrcdrs> gc = new GenericClass<>(com.tcs.gosi.pojo.updprcdrs.M1UpdPrcdrs.class);
		HttpURLConnection httpCon = gc.doReq(request, response, "/ouaf/mobility/rest/ouaf/script/M1-UpdPrcdrs/");
		String req = "";
		Reader reader = request.getReader();
		while (true) {
			int ch = reader.read();
			if (ch==-1) {
				break;
			}
			req += (char)ch;
		}
		ObjectMapper mapper4 = new ObjectMapper().enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY).enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
		ProcedureSteps reqMessages = mapper4.readValue(req, ProcedureSteps.class);
		ObjectMapper mapper = new ObjectMapper();
		M1UpdPrcdrs m1UpdPrcdrs = new M1UpdPrcdrs();
        M1UpdPrcdrs_ m1UpdPrcdrs_ = new M1UpdPrcdrs_();
        com.tcs.gosi.pojo.updprcdrs.Input in = new com.tcs.gosi.pojo.updprcdrs.Input();
        in.setSentFromMDT(((input)session.getAttribute("input")).getMdtId());
        in.setUpdateAction(true);
        boolean found = false;
        for(int len1 = 0; len1 < ((M1ShfLogon)session.getAttribute("shfLogon")).getM1ShfLogon().getInputOutput().getRelatedEntities().getRelatedEntityList().size(); len1++) {
        	if(((M1ShfLogon)session.getAttribute("shfLogon")).getM1ShfLogon().getInputOutput().getRelatedEntities().getRelatedEntityList().get(len1).getMoName().equals("M1-PROCEDURE")) {
        		Mapper mapper1 = new DozerBeanMapper();
        		ProcedureBoData pbd = mapper1.map(((M1ShfLogon)session.getAttribute("shfLogon")).getM1ShfLogon().getInputOutput().getRelatedEntities().getRelatedEntityList().get(len1).getEntityBoData(), ProcedureBoData.class);
        		pbd.getCompletionInformation().getProcedureStepCompletionDtls().setProcedureSteps(reqMessages);
        		pbd.setProcedureState("M1PS");
        		pbd.setBoStatus("COMPLETE");
        		DateFormat df = new SimpleDateFormat("YYYY-MM-dd-HH.mm.ss");
        		Date dateobj = new Date();
        		pbd.setBoStatusDateTime(df.format(dateobj).toString());
        		in.setProcedureBoName(((M1ShfLogon)session.getAttribute("shfLogon")).getM1ShfLogon().getInputOutput().getRelatedEntities().getRelatedEntityList().get(len1).getEntityBoName());
        		in.setProcedureBoData(pbd);
        		found = true;
        		break;
        	}
        }
        m1UpdPrcdrs_.setInput(in);
        m1UpdPrcdrs.setM1UpdPrcdrs(m1UpdPrcdrs_);
        String ret = "";
        if(found) {
        	String jsonInString = mapper.writeValueAsString(m1UpdPrcdrs);
    		ret = gc.doRes(request, response, httpCon, jsonInString, null);
        } else {
        	ret = "IMS0002: No Procedure found for the Shift!";
        }
		return ret;
	}
}