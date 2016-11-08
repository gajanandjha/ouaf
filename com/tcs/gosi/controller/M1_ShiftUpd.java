package com.tcs.gosi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tcs.gosi.pojo.GenericClass;
import com.tcs.gosi.pojo.input;
import com.tcs.gosi.pojo.gtprvtsks.M1GtPrvTsks;
import com.tcs.gosi.pojo.reqshift.M1ReqShift;
import com.tcs.gosi.pojo.shflogon.M1ShfLogon;
import com.tcs.gosi.pojo.shiftupd.BoData;
import com.tcs.gosi.pojo.shiftupd.M1ShiftUpd;
import com.tcs.gosi.pojo.shiftupd.M1ShiftUpd_;
import com.tcs.gosi.pojo.shiftupd.ResourceAllocationList;

import org.springframework.stereotype.Controller;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

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
public class M1_ShiftUpd {
	protected final Log logger = LogFactory.getLog(getClass());
	
	@RequestMapping("/ouaf/mobility/rest/ouaf/script/M1-ShiftUpd/")
	public
	@ResponseBody
	String shiftUpd(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		session.setAttribute("Context-Value", "MDT_ID=" + ((input)session.getAttribute("input")).getMdtId() + ",M1SH=" + ((M1ReqShift)session.getAttribute("reqShift")).getM1ReqShift().getOutput().getBoData().getShiftId() + ",");
		GenericClass<com.tcs.gosi.pojo.shiftupd.M1ShiftUpd> gc = new GenericClass<>(com.tcs.gosi.pojo.shiftupd.M1ShiftUpd.class);
		HttpURLConnection httpCon = gc.doReq(request, response, "/ouaf/mobility/rest/ouaf/script/M1-ShiftUpd/");
        ObjectMapper mapper = new ObjectMapper();
        Mapper mapper1 = new DozerBeanMapper();
        com.tcs.gosi.pojo.shiftupd.M1ShiftUpd m1ShiftUpd = new M1ShiftUpd();
        com.tcs.gosi.pojo.shiftupd.M1ShiftUpd_ m1ShiftUpd_ = new M1ShiftUpd_();
        com.tcs.gosi.pojo.shiftupd.Input in = new com.tcs.gosi.pojo.shiftupd.Input();
        in.setSentFromMDT(((input)session.getAttribute("input")).getMdtId());
        in.setShiftId(((M1ReqShift)session.getAttribute("reqShift")).getM1ReqShift().getOutput().getBoData().getShiftId());
        in.setBoName(((M1ReqShift)session.getAttribute("reqShift")).getM1ReqShift().getOutput().getBoName());
        in.setUpdateAction(true);
        BoData destObject = mapper1.map(((M1ShfLogon)session.getAttribute("shfLogon")).getM1ShfLogon().getInputOutput().getBodata(), BoData.class);
        in.setBoData(destObject);
        DateFormat df = new SimpleDateFormat("YYYY-MM-dd-HH.mm.ss");
		Date dateobj = new Date();
        in.getBoData().setBoStatusDateTime(df.format(dateobj).toString());
        in.getBoData().setBusinessStatusDateTime(df.format(dateobj).toString());
        List<ResourceAllocationList> ral = in.getBoData().getResourceAllocation().getResourceAllocationList();
        for(ResourceAllocationList rs : ral)
			rs.setEffectiveDateTime(df.format(dateobj).toString());
        m1ShiftUpd_.setInput(in);
        m1ShiftUpd.setM1ShiftUpd(m1ShiftUpd_);
		String jsonInString = mapper.writeValueAsString(m1ShiftUpd);
		String ret = gc.doRes(request, response, httpCon, jsonInString, null);
		return ret;
	}
}