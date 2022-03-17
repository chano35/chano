package com.spstep.hello.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller("helloController")
@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping(value="/hello.do", method=RequestMethod.GET)
	public ModelAndView hello(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("[HelloController] /hello.do");
		ModelAndView mav = new ModelAndView("hello.jsp");
		mav.addObject("hello", "Hello, Spring!!!!");
		return mav;
	}

	@RequestMapping(value="/index.do", method=RequestMethod.GET)
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("[HelloController] /index.do");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index.jsp");
		mav.addObject("msg", "시작 페이지입니다. 환영합니다.");
		return mav;
	}

}
