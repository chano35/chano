package com.spstep.home.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("homeController")
public class HomeController {
	
	@RequestMapping(value="/home.do", method=RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("/home.do");
		return "main";
	}

}
