package com.sbs.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserHomeController {
	@RequestMapping ("usr/home/main")
	@ResponseBody
	public String Main(){
		
		return "hi";
	}

}
