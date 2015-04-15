package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class SpringMVC {
	@RequestMapping("/index")
	  public ModelAndView helloWorld() {  
		ModelAndView model = new ModelAndView("index");
		model.addObject("message", "hello world");
		return model;
    }  

}