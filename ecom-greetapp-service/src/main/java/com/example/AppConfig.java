package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.service.CloudCourseImpl;
import com.example.service.WebCourseImpl;

@Configuration
public class AppConfig {
	
	@Bean
	@Profile("dev")
	CloudCourseImpl cloudCourse() {
		return new CloudCourseImpl();
	}
	
	@Bean
	//@Primary
	@Profile("prod")
	WebCourseImpl webCourse() {
		return new WebCourseImpl();
	}
}
