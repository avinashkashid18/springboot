package com.student.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class StudentController {

	@RequestMapping("/welcome")
	public ModelAndView getWelcomePage(){
		return new ModelAndView("welcome");
	}
}
