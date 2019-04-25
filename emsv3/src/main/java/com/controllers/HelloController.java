package com.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

public HelloController() {
System.out.println("HelloController created....");
}
	
@RequestMapping(value="/hello",method=RequestMethod.GET)
public String hello(){
	System.out.println("In HelloController hello...");
	return "hello";
}

@RequestMapping("/today")
public ModelAndView  today(){
	System.out.println("In hello today...");

	return  new ModelAndView("today","message", new Date());
}



	
}
