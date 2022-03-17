/*
 * Model
 */
package com.spstep.login.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spstep.login.vo.LoginVO;

@Controller("loginController5")
public class LoginController5 {
	
	@RequestMapping(value="/login/loginform5.do", method=RequestMethod.GET)
	public ModelAndView loginForm(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("[loginController5] /loginform5.do");
		return new ModelAndView("loginform5.jsp");
	}

	/*
	@RequestMapping(value="/login/login5.do", method=RequestMethod.POST)
	public String login(Model model, @ModelAttribute("loginVO") LoginVO loginVO, 
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.printf("[loginController5] /login5.do\n");
		
		request.setCharacterEncoding("UTF-8");
		
		String msg = String.format("%s(%s)님 환영합니다.", loginVO.getUsername(), loginVO.getUserid());
		model.addAttribute("result", msg);
		return "login5.jsp";
	}
	*/

	@RequestMapping(value="/login/login5.do", method=RequestMethod.POST)
	public String login(Model model, @RequestParam Map<String, String> loginMap,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.printf("[loginController5] /login5.do\n");
		
		request.setCharacterEncoding("UTF-8");
		
		LoginVO loginVO = new LoginVO(loginMap.get("userid"), loginMap.get("username"), loginMap.get("email"));
		
		String msg = String.format("%s(%s)님 환영합니다.", loginVO.getUsername(), loginVO.getUserid());
		model.addAttribute("result", msg);
		model.addAttribute("loginVO", loginVO);
		return "login5.jsp";
	}

}
