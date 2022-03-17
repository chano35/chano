/*
 * @RequestParam("parameter") 자료형 변수
 * - 기본값: required=true
 * - required=false를 하게되면 파라미터가 없어도 에러가 나지 않으며 null값 세팅
 * 
 */
package com.spstep.login.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller("loginController2")
public class LoginController2 {
	
	@RequestMapping(value="/login/loginform2.do", method=RequestMethod.GET)
	public ModelAndView loginForm(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("[loginController2] /loginform2.do");
		return new ModelAndView("loginform2.jsp");
	}
	
	// 매개변수가 전달되지 않으면 null 값
	@RequestMapping(value="/login/login2.do", method=RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response,
			@RequestParam("userid") String userid, 
			@RequestParam("username") String username,
			@RequestParam(value="email", required=false) String email) throws Exception {
		System.out.println("[loginController2] /login2.do");
		
		request.setCharacterEncoding("UTF-8");
		/*
		String userid = request.getParameter("userid");
		String username = request.getParameter("username");
		*/
		ModelAndView mav = new ModelAndView("login2.jsp");
		String msg = String.format("%s(%s)님 환영합니다.", username, userid);
		mav.addObject("result", msg);
		mav.addObject("email", email);
		return mav;
	}

}
