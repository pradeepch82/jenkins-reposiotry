package com.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;



@RequestMapping("/welcome")
@Controller
public class WelcomeController {

public WelcomeController() {
System.out.println("WelcomeController created....");
}



@RequestMapping(method=RequestMethod.GET)
public String welcome(){
	return "welcome";
}


@RequestMapping("/hello")
public  @ResponseBody  String hello(){
	System.out.println("In welcome hello...");

	return "Hello World!!!";
}

@RequestMapping("/today")
public @ResponseBody String  today(){
	System.out.println("In welcome today...");
	return  "Today is : "+new Date();
}



	
}
