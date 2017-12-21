package com.sboot.mserv.casestudy.callcenter.model.associate;

public abstract class AssocAbsClass implements Associate {
	
	int callThreshold = 0;
	
	public int getCallThreshold() {
		return callThreshold;
	}

	public void setCallThreshold(int callThreshold) {
		this.callThreshold = callThreshold;
	}
}
