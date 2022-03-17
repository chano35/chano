/*
 * @ModelAttribute("바인딩이름") 클래스 객체변수
 *  - 객체변수에 자동으로 값이 지정되고 전달된 값을 참조
 *  - 바인딩이름: JSP에서 바인딩이름으로 접근하여 사용
 *  - 송.수신 즉 양방향 객체 바인딩
 */
package com.spstep.login.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spstep.login.vo.LoginVO;

@Controller("loginController4")
public class LoginController4 {
	
	@RequestMapping(value="/login/loginform4.do", method=RequestMethod.GET)
	public ModelAndView loginForm(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("[loginController4] /loginform4.do");
		return new ModelAndView("loginform4.jsp");
	}
	
	// 파라메터를 맵을 통해 받음
	@RequestMapping(value="/login/login4.do", method=RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("loginVO") LoginVO loginVO) throws Exception {
		System.out.printf("[loginController4] /login4.do : username(%s), userid(%s), email(%s)\n", loginVO.getUsername(), loginVO.getUserid(), loginVO.getEmail());
		
		ModelAndView mav = new ModelAndView("login4.jsp");
		String msg = String.format("%s(%s)님 환영합니다.", loginVO.getUsername(), loginVO.getUserid());
		mav.addObject("result", msg);
		/*
		 * 생략가능 : loginr4.jsp에서 속성(loginVO)으로 접근 가능 
		 * mav.addObject("loginVO", loginVO);
		 */
		return mav;
	}

}
