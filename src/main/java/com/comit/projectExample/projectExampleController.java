package com.comit.projectExample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class projectExampleController {

	
	@GetMapping("/sayHello")
	public String sayHelloWorld() {
		return "Hello World";
	}
	

}
