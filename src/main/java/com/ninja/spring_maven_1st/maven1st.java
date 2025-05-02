package com.ninja.spring_maven_1st;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class maven1st 
{
	@RequestMapping("/test")
	public String test()
	{
		return "hii i am test page";
	}
	
	
	
	@RequestMapping("/jenkins")
	public String jenkins()
	{
		return "hii i am jenkins page";
	}

}
