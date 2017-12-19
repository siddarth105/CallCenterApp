package com.sboot.mserv.casestudy.callcenter.model.call;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sboot.mserv.casestudy.callcenter.util.CallCenterConstants;

@SuppressWarnings("unused")
public class CallDetails {
	
	private final Log log = LogFactory.getLog(getClass());
	
	private int callDetailId;
	private int numberOfCalls;
	private List<Object> jeObjLst;
	private List<Object> seObjLst;
	private String mgr;
	private List<List<Integer>> jeLst = new ArrayList<List<Integer>>();
	private List<List<Integer>> seLst = new ArrayList<List<Integer>>();;
	private List<Integer> mgrLst;
	
	public int getCallDetailId() {
		return callDetailId;
	}
	
	public void setCallDetailId(int callDetailId) {
		this.callDetailId = callDetailId;
	}
	
	public int getNumberOfCalls() {
		return numberOfCalls;
	}
	
	public void setNumberOfCalls(int numberOfCalls) {
		this.numberOfCalls = numberOfCalls;
	}
	
	public void setJe(List<Object> jeObjLst) {
		this.jeObjLst = jeObjLst;
		jeObjLst.forEach(callData -> validateAssocTime(callData, jeLst));
	}

	public void setSe(List<Object> seObjLst) {
		this.seObjLst = seObjLst;
		seObjLst.forEach(callData -> validateAssocTime(callData, seLst));
	}
	
	public void setMgr(String mgr) {
		this.mgr = mgr;
		validateManagerTime();
	}
	
	public List<List<Integer>> getJeLst() {
		return jeLst;
	}

	public void setJeLst(List<List<Integer>> jeLst) {
		this.jeLst = jeLst;
	}

	public List<List<Integer>> getSeLst() {
		return seLst;
	}

	public void setSeLst(List<List<Integer>> seLst) {
		this.seLst = seLst;
	}

	public List<Integer> getMgrLst() {
		return mgrLst;
	}

	public void setMgrLst(List<Integer> mgrLst) {
		this.mgrLst = mgrLst;
	}

	private void validateAssocTime (Object callData, List<List<Integer>> assoList) {
		
		if(null != callData){
			List<String> assocStringLst = new ArrayList<String>();
			List<Integer> timeIntegerLst = new ArrayList<Integer>();
			if(callData.toString().contains(",")) {
				assocStringLst = Arrays.asList(callData.toString().split(","));
			} else {
				assocStringLst.add(callData.toString());
			}
			for (String time : assocStringLst) {
				timeIntegerLst.add(Integer.parseInt(time));
			}
			assoList.add(timeIntegerLst);
		} 
	}
	
	private void validateManagerTime () {
		
		if (null != mgr) {
			mgrLst = new ArrayList<Integer>();
			List<String> indAssocLst = new ArrayList<String>();
			if (mgr.contains(",")) {
				indAssocLst = Arrays.asList(mgr.split(","));
			} else {
				indAssocLst.add(mgr);
			}
			
			for (String time:indAssocLst) {
				mgrLst.add(Integer.parseInt(time));
			}
		}
	}
}
