package com.services.indexes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ServiceUrlController2 implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("[ServiceUrlController2] request(index2.do) -> response(index2.jsp)");
		
		ModelAndView mav = new ModelAndView("index2.jsp");
		mav.addObject("msg", "Hello, Spring!!!");
		return mav;
	}
}
