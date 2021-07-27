package com.example.apigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
	
	@GetMapping("/userServiceFallBack")
	public String userServiceFallBackMethod() {
		return "Issue with USer Service.Please try again.";
	}
	
	@GetMapping("/departmentServiceFallBack")
	public String departmentServiceFallBackMethod() {
		return "Issue with department service.Please try again.";
	}

}
