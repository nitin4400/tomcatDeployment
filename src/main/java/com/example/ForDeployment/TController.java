package com.example.ForDeployment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TController {

	@RequestMapping("/hello")
	public String hello()
	{
		return "hello";
	}
}
