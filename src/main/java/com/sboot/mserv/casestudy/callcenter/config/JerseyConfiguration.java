package com.sboot.mserv.casestudy.callcenter.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfiguration {
	
	@Bean
	ResourceConfig config() {
		ResourceConfig resCon = new ResourceConfig();
		resCon.packages("com.sboot.mserv.casestudy.callcenter.resource");
		return resCon;
	}

}
