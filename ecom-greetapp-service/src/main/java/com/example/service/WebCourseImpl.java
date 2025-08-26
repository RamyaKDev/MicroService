package com.example.service;

import java.util.Arrays;
import java.util.List;

public class WebCourseImpl implements IGreetService{

	@Override
	public List<String> showCources() {
		
		return Arrays.asList("HTML","CSS","JS");
	}

}
