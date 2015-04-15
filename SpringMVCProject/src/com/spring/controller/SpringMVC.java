package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class SpringMVC {

@RequestMapping(value="/asub" , method=RequestMethod.POST )
public ModelAndView getAform(@RequestParam("sname") String name, @RequestParam("shobby") String hobby)
{
	ModelAndView model = new ModelAndView("asub");
	model.addObject("name " , name );
	System.out.println(name);
	return model;
	
}
}