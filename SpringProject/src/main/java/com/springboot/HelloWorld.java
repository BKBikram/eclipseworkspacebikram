package com.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {
	@RequestMapping
	@ResponseBody
	public String HellowrldView()
	{
		return "Hello World this is first program ";
	}

}
