package com.sboot.mserv.casestudy.callcenter.model.call;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"numberOfCalls","resolvedCalls","unresolvedCalls","totalTimeTaken","performance"})
public class CallReport {
	
	private int reportId;
	private int numberOfCalls;
	private int resolvedCalls;
	private int unresolvedCalls;
	private int totalTimeTaken;
	private PerformanceDto performance;
	
	@JsonIgnore
	public int getReportId() {
		return reportId;
	}
	
	public void setReportId(int reportId) {
		this.reportId = reportId;
	}
	
	public int getNumberOfCalls() {
		return numberOfCalls;
	}
	
	public void setNumberOfCalls(int numberOfCalls) {
		this.numberOfCalls = numberOfCalls;
	}
	
	public int getResolvedCalls() {
		return resolvedCalls;
	}
	
	public void setResolvedCalls(int resolvedCalls) {
		this.resolvedCalls = resolvedCalls;
	}
	
	public int getUnresolvedCalls() {
		return unresolvedCalls;
	}
	
	public void setUnresolvedCalls(int unresolvedCalls) {
		this.unresolvedCalls = unresolvedCalls;
	}
	
	@JsonGetter("totalTimeTakenInMinutes")
	public int getTotalTimeTaken() {
		return totalTimeTaken;
	}
	
	public void setTotalTimeTaken(int totalTimeTaken) {
		this.totalTimeTaken = totalTimeTaken;
	}
	
	public PerformanceDto getPerformance() {
		return performance;
	}
	
	public void setPerformance(PerformanceDto performance) {
		this.performance = performance;
	}
}
