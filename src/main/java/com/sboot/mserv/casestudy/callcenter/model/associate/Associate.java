package com.sboot.mserv.casestudy.callcenter.model.associate;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface Associate {
	
	@JsonIgnore
	int getId();
	void setId(int id);
	
	String getIdVal();
	
	int getCallsAttended();
	void setCallsAttended(int callsAttended);
	
	int getRslvCalls();
	void setRslvCalls(int rslvCalls);
	
	int getEscCalls();
	void setEscCalls(int escCalls);
	
	int getTimeTaken();
	void setTimeTaken(int timeTaken);
	
	public int getCallThreshold();
	public void setCallThreshold(int callThreshold);
	
	public boolean canAcceptCall();
	
}
