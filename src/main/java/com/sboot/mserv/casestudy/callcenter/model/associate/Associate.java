package com.sboot.mserv.casestudy.callcenter.model.associate;

public interface Associate {
	
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
	
}
