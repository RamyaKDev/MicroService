package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.IGreetService;

@RestController
@RequestMapping("/greet")
public class GreetController {
	@Autowired
	//@Qualifier("webCourse")
	private IGreetService greetService;

	@GetMapping("/say-hello/{username}")
	public ResponseEntity<String> sayHello(@PathVariable String username) {
		String message = "Hello" + username;
		return ResponseEntity.ok(message);
	}

	@GetMapping("/show-courses")
	public ResponseEntity<List<String>> printCourses() {
		List<String> courses = greetService.showCources();
		return ResponseEntity.ok(courses);

	}
}
