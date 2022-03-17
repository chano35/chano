package com.spstep.services.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

@Controller("loginServiceController")
@RequestMapping("/user")
public class LoginServiceController {

	@RequestMapping(value="/loginform.do", method=RequestMethod.GET)
	public ModelAndView loginform(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("[LoginServiceController] response(login.jsp)");
		return new ModelAndView("loginform");	// "/user/loginform.jsp"
	}

	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public ModelAndView login(@RequestParam("userid") String uid, @RequestParam("passwd") String pwd,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("[LoginServiceController] response(login.jsp)");
		
		request.setCharacterEncoding("UTF-8");
		
		ModelAndView mav = new ModelAndView("login");	// "/user/login.jsp"
		String result = String.format("%s님 환영합니다.", uid);
		mav.addObject("result", result);
		return mav;
	}
	
}
