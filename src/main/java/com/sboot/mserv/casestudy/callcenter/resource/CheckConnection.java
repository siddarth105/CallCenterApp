package com.sboot.mserv.casestudy.callcenter.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

@Service
@Path("/rest/checkEndPoint")
public class CheckConnection {
	
private final Log log = LogFactory.getLog(getClass());
	
	@POST
	@Path("/getServerResponse")
	@Consumes("application/json")
	@Produces("application/json")
	public String getServerResponse() {
		this.log.info("CheckConnection :: getServerResponse");
		return "SERVER IS UP";
	}

}
