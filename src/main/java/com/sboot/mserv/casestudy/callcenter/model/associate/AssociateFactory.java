package com.sboot.mserv.casestudy.callcenter.model.associate;

import com.sboot.mserv.casestudy.callcenter.util.CallCenterConstants;

public class AssociateFactory {

	public static Associate getAssociate(String assocType) {
		Associate assoc = null;
		switch (assocType) {
			case CallCenterConstants.JE: 
				assoc = new JuniorExecutiveDto(); 
				break;
			case CallCenterConstants.SE: 
				assoc = new SeniorExecutiveDto(); 
				break;
			default :
				System.out.println("Value Not Present"); //TODO 
				break;
		}
		return assoc;
	}
}
