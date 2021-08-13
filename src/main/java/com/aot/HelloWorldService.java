package com.aot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldService {

	@RequestMapping("/helloworld")
	public String helloWorld() {
		return "hello world";
	}
	
}
