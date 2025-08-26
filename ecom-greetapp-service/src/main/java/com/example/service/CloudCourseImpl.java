package com.example.service;

import java.util.Arrays;
import java.util.List;

public class CloudCourseImpl implements IGreetService{

	@Override
	public List<String> showCources() {
		
		return Arrays.asList("AWS","GCP","AZURE");
	}

}
