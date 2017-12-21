package com.sboot.mserv.casestudy.callcenter.model.associate;

import com.sboot.mserv.casestudy.callcenter.util.CallCenterConstants;

public class AssociateFactory {

	public static Associate getAssociate(String assocType, int threshold) {
		Associate assoc = null;
		switch (assocType) {
			case CallCenterConstants.JE: 
				assoc = new JuniorExecutiveDto(); 
				assoc.setCallThreshold(threshold);
				break;
			case CallCenterConstants.SE: 
				assoc = new SeniorExecutiveDto();
				assoc.setCallThreshold(threshold);
				break;
			default :
				System.out.println("Value Not Present"); //TODO 
				break;
		}
		return assoc;
	}
}
