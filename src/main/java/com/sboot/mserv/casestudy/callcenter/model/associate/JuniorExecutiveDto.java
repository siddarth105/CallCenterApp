package com.sboot.mserv.casestudy.callcenter.model.associate;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sboot.mserv.casestudy.callcenter.util.CallCenterConstants;

@JsonPropertyOrder({"idVal","timeTaken","callsAttended","rslvCalls","escCalls"})
public class JuniorExecutiveDto implements Associate {
	
	private int id;
	private String idVal;
	private int callsAttended;
	private int rslvCalls;
	private int escCalls;
	private int timeTaken;
	
	@JsonIgnore
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
		setIdVal();
	}
	
	@JsonGetter("id")
	public String getIdVal() {
		return idVal;
	}
	
	public void setIdVal() {
		this.idVal = CallCenterConstants.JE.toLowerCase() + id;
	}
	
	public int getCallsAttended() {
		return callsAttended;
	}
	
	public void setCallsAttended(int callsAttended) {
		this.callsAttended = callsAttended;
	}
	
	@JsonGetter("resolved")
	public int getRslvCalls() {
		return rslvCalls;
	}
	
	public void setRslvCalls(int rslvCalls) {
		this.rslvCalls = rslvCalls;
	}
	
	@JsonGetter("escalated")
	public int getEscCalls() {
		return escCalls;
	}
	
	public void setEscCalls(int escCalls) {
		this.escCalls = escCalls;
	}
	
	@JsonGetter("timeTakenInMinutes")
	public int getTimeTaken() {
		return timeTaken;
	}
	
	public void setTimeTaken(int timeTaken) {
		this.timeTaken = timeTaken;
	}
}
