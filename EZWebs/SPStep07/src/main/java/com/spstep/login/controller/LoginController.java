package com.spstep.login.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller("loginController")
public class LoginController {
	
	@RequestMapping(value="/login/loginform.do", method=RequestMethod.GET)
	public ModelAndView loginForm(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("loginform.jsp");
	}
	
	@RequestMapping(value="/login/login.do", method=RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("[loginController] /login.do");
		
		request.setCharacterEncoding("UTF-8");
		String userid = request.getParameter("userid");
		String username = request.getParameter("username");
		ModelAndView mav = new ModelAndView("login.jsp");
		String msg = String.format("%s(%s)님 환영합니다.", userid, username);
		mav.addObject("result", msg);
		return mav;
	}

}
