package com._520it.takeout.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping("/main")
	public String login(){
		return "main";
	}


}
