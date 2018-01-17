package com.sboot.mserv.casestudy.callcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.EmbeddedServletContainerAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


/*@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.sboot.mserv.casestudy.callcenter.resource"})*/
@SpringBootApplication(exclude = {EmbeddedServletContainerAutoConfiguration.class})
public class CallcenterApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(CallcenterApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder app) {
		return app.sources(CallcenterApplication.class);
	}
}
