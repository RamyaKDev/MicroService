package com.productinfo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
	
	//spring will create object of RestTemplate
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
