package com.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class UserServiceController extends MultiActionController {
	
	// /user/login.do
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("[UserServiceController] request(/user/login.do) -> response(login.jsp)");
		
		request.setCharacterEncoding("UTF-8");
		String uid = request.getParameter("userid");
		String pwd = request.getParameter("passwd");
		
		ModelAndView mav = new ModelAndView("login");	// login.jsp
		mav.addObject("userid", uid);
		mav.addObject("passwd", pwd);
		return mav;
	}
	

	// /user/login2.do
	public ModelAndView login2(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("[UserServiceController] request(/user/login2.do) -> response(login2.jsp)");
		
		request.setCharacterEncoding("UTF-8");
		String uid = request.getParameter("userid");
		String pwd = request.getParameter("passwd");
		
		ModelAndView mav = new ModelAndView("login2");	// login2.jsp
		mav.addObject("userid", uid);
		mav.addObject("passwd", pwd);
		return mav;
	}

}
