package com.springmvcone;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingPageController {
	
	@RequestMapping(path = "/show.do/{name}", method = RequestMethod.GET)
	public String show(@PathVariable("name") String name, Model model) {
		
		model.addAttribute("name", name);
		return "showpage";
	}

	@RequestMapping(path = "/greet.do", method = RequestMethod.GET)
	public String greet(@RequestParam("name")String name, Model model) {
		String message = "In a galaxy far, far away... ";
		model.addAttribute("message", message);
		model.addAttribute("name", name);
		return "greetpage"; //returning name of the jsp file
	}
	
	@RequestMapping(path = "/psl.do", method = RequestMethod.GET)
	public String greeting(Model model) {
		
		return "sayhello"; //returning name of the jsp file
	}
	
	@RequestMapping(path = "/topics.do", method = RequestMethod.GET)
	public String topics(Model model) {
		
		String topics[]= {"Java", "Angular", "React"};
		model.addAttribute("topics", topics);
		return "topicsPage"; //returning name of the jsp file
	}
}
