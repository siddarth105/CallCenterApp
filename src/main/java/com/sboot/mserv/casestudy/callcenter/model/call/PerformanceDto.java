package com.sboot.mserv.casestudy.callcenter.model.call;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sboot.mserv.casestudy.callcenter.model.associate.Associate;
import com.sboot.mserv.casestudy.callcenter.model.associate.ManagerDto;

@JsonPropertyOrder({"managerDto","juniorExecutiveList","seniorExecutiveList"})
public class PerformanceDto {
	
	private List<Associate> juniorExecutiveList;
	private List<Associate> seniorExecutiveList;
	private ManagerDto managerDto;
	
	@JsonGetter("junior-executives")
	public List<Associate> getJuniorExecutiveList() {
		return juniorExecutiveList;
	}
	
	public void setJuniorExecutiveList(List<Associate> juniorExecutiveList) {
		this.juniorExecutiveList = juniorExecutiveList;
	}
	
	@JsonGetter("senior-executives")
	public List<Associate> getSeniorExecutiveList() {
		return seniorExecutiveList;
	}
	
	public void setSeniorExecutiveList(List<Associate> seniorExecutiveList) {
		this.seniorExecutiveList = seniorExecutiveList;
	}
	
	@JsonGetter("manager")
	public ManagerDto getManagerList() {
		return managerDto;
	}
	
	public void setManagerList(ManagerDto managerDto) {
		this.managerDto = managerDto;
	}
}
