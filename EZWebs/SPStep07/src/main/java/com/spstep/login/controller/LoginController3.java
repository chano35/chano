/*
 * @RequestParam Map<String, String> 변수
 *  - 파라메터가 많은 경우 Map을 통해 간결하게 처리
 * 
 */
package com.spstep.login.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller("loginController3")
public class LoginController3 {
	
	@RequestMapping(value="/login/loginform3.do", method=RequestMethod.GET)
	public ModelAndView loginForm(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("[loginController3] /loginform3.do");
		return new ModelAndView("loginform3.jsp");
	}
	
	// 파라메터를 맵을 통해 받음
	@RequestMapping(value="/login/login3.do", method=RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response,
			@RequestParam Map<String, String> params) throws Exception {
		System.out.println("[loginController3] /login3.do");
		
		ModelAndView mav = new ModelAndView("login3.jsp");
		String msg = String.format("%s(%s)님 환영합니다.", params.get("username"), params.get("userid"));
		mav.addObject("result", msg);
		mav.addObject("email", params.get("email"));
		return mav;
	}

}
