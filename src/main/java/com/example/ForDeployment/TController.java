package com.example.ForDeployment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TController {

	@GetMapping("/hello")
	public String greeting()
	{
		return "index";
	}
	@GetMapping("/welcome")
	public String welcome()
	{
		return "hii";
	}
}
