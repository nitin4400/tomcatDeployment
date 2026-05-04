package com.example.ForDeployment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TController {

	@GetMapping("/hello")
	public String greeting()
	{
		return "<body bgcolor=red>index</body>";
	}
	@GetMapping("/welcome")
	public String welcome()
	{
		return "<h1> hii</h1>";
	}
}
