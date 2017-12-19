package com.sboot.mserv.casestudy.callcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.sboot.mserv.casestudy.callcenter.resource"})*/
@SpringBootApplication
public class CallcenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CallcenterApplication.class, args);
	}
}
