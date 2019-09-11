package com.springmvcone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginPageController {
	
	@Autowired
	private LoginService loginservice;

	@RequestMapping(path = "/login.do", method = RequestMethod.GET)
	public String login() {

		return "loginpage";
	}

	@RequestMapping(path = "/login.do", method = RequestMethod.POST)
	public String check(@RequestParam("user") String userName, @RequestParam("password") String password, Model model) {
		
		if(loginservice.check(userName, password)) {
			
			model.addAttribute("username", userName);
			return "loginsuccess";
		}
		else {
			
			model.addAttribute("error", "Invalid username/password");
			return "loginpage";
		}
			
		
	}
}
