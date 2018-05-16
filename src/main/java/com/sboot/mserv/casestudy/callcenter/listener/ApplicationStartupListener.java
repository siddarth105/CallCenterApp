package com.sboot.mserv.casestudy.callcenter.listener;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStartupListener implements ApplicationListener<ContextRefreshedEvent> {

	private final Log log = LogFactory.getLog(getClass());
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		this.log.info("ApplicationStartupListener :: callcenter application started");
		try {
			// TODO :: Add any pre-processing to be done on application startup like health checks
			this.log.info("Callcenter application started on machine :: " + InetAddress.getLocalHost().getHostName());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
