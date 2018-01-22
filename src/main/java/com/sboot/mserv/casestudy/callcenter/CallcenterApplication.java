package com.sboot.mserv.casestudy.callcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.EmbeddedServletContainerAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(exclude = {EmbeddedServletContainerAutoConfiguration.class})
@ImportResource("classpath:/application-context.xml")  // application-context.xml is not required when ApplicationStartupListener is annotated with @Component
public class CallcenterApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(CallcenterApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder app) {
		return app.sources(CallcenterApplication.class);
	}
}
