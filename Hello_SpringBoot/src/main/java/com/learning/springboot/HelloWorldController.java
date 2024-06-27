package com.learning.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/hello-world")
	public MyApp showHelloWorld() {
		MyApp app=new MyApp();
		app.setWord1("Hello World");
		app.setWord2("Welcome to my first Spring app");
		return app;
	}
}
