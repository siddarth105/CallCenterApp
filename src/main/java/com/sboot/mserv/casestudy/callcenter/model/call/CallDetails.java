package com.sboot.mserv.casestudy.callcenter.model.call;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sboot.mserv.casestudy.callcenter.util.CallCenterConstants;

@SuppressWarnings("unused")
public class CallDetails {
	
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
		
		if(null != callData && callData.toString().contains(",")) {
			List<String> indAssocLst = Arrays.asList(callData.toString().split(","));
			List<Integer> indLst = new ArrayList<Integer>();
			for (String time : indAssocLst) {
				if (time.length() > 0 && time.matches(CallCenterConstants.NumberPattern)) {
					indLst.add(Integer.parseInt(time));
				} else {
					System.out.println("Invalid Time Exception"); //TODO :: Throw an exception
				}
			}
			assoList.add(indLst);
		}
	}
	
	private void validateManagerTime () {
		
		mgrLst = new ArrayList<Integer>();
		List<String> indAssocLst = Arrays.asList(mgr.split(","));
		for (String time:indAssocLst) {
			if (time.length() > 0 && time.matches(CallCenterConstants.NumberPattern)) {
				mgrLst.add(Integer.parseInt(time));
			}  else {
				System.out.println("Invalid Time Exception"); //TODO :: Throw an exception
			}
		}
	}
}
