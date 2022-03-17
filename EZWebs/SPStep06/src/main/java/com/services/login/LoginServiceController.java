package com.services.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class LoginServiceController extends MultiActionController {
	
	// /user/login.do
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("[LoginServiceController] request(/user/login.do) -> response(login.jsp)");
		
		request.setCharacterEncoding("UTF-8");
		String uid = request.getParameter("userid");
		String pwd = request.getParameter("passwd");
		
		// ModelAndView mav = new ModelAndView("login");	// login.jsp
		ModelAndView mav = new ModelAndView("/user/login.jsp");
		mav.addObject("userid", uid);
		mav.addObject("passwd", pwd);
		return mav;
	}
	
}
