package com.sboot.mserv.casestudy.callcenter.model.associate;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sboot.mserv.casestudy.callcenter.util.CallCenterConstants;

@JsonPropertyOrder({"idVal","timeTaken","callsAttended","rslvCalls","unRslvCalls"})
public class ManagerDto {
	
	private int id;
	private String idVal;
	private int callsAttended;
	private int rslvCalls;
	private int unRslvCalls;
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
		this.idVal = CallCenterConstants.MGR.toLowerCase() + id;
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
	
	@JsonGetter("unresolved")
	public int getUnRslvCalls() {
		return unRslvCalls;
	}
	
	public void setUnRslvCalls(int unRslvCalls) {
		this.unRslvCalls = unRslvCalls;
	}
	
	public int getTimeTaken() {
		return timeTaken;
	}
	
	@JsonGetter("timeTakenInMinutes")
	public void setTimeTaken(int timeTaken) {
		this.timeTaken = timeTaken;
	}
}
