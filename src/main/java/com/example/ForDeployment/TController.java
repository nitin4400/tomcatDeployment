package com.example.ForDeployment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TController {

	@GetMapping("/")
	public String hello()
	{
		return "hello";
	}
}
