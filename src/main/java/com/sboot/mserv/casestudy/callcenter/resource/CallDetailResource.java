package com.sboot.mserv.casestudy.callcenter.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sboot.mserv.casestudy.callcenter.model.call.CallDetails;
import com.sboot.mserv.casestudy.callcenter.model.call.CallReport;
import com.sboot.mserv.casestudy.callcenter.service.CallDetailServiceImpl;

@Service
@Path("/rest")
public class CallDetailResource {
	
	//TODO :: Set error code in the response and return, validation for Z/X+Y
	@Autowired
	private CallDetailServiceImpl callDetailService;
	
	private final Log log = LogFactory.getLog(getClass());
	
	@POST
	@Path("/getCallDetails")
	@Consumes("application/json")
	@Produces("application/json")
	public CallReport getCallDetails(CallDetails callDetails) {
		this.log.info("CallDetailResource :: getCallDetails");
		CallReport callReport = callDetailService.getReport(callDetails);
		return callReport;
	}

}
