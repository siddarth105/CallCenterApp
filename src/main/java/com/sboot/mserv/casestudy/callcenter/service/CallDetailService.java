package com.sboot.mserv.casestudy.callcenter.service;

import com.sboot.mserv.casestudy.callcenter.model.call.CallDetails;
import com.sboot.mserv.casestudy.callcenter.model.call.CallReport;

public interface CallDetailService {
	
	CallReport getReport(CallDetails callDetails);

}
