package com.spstep.services.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.spstep.member.service.MemberService;
import com.spstep.member.vo.MemberVO;

@Controller("loginServiceController")
@RequestMapping("/user")
public class LoginServiceController {
	
	private MemberService memberService;
	
	@Autowired
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}
	

	@RequestMapping(value="/loginform.do", method=RequestMethod.GET)
	public ModelAndView loginform(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("[LoginServiceController] response(login.jsp)");
		// return new ModelAndView("loginform");	// "/user/loginform.jsp"
		return new ModelAndView("/user/loginform");	// tiles-member.xml(/user/loginform)
	}

	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public ModelAndView login(@RequestParam("userid") String uid, @RequestParam("passwd") String pwd,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("[LoginServiceController] response(login.jsp)");
		
		request.setCharacterEncoding("UTF-8");

		MemberVO memberVO = memberService.login(uid, pwd);
		if(memberVO != null) {
			HttpSession session = request.getSession();
			session.setAttribute("member", memberVO);
			session.setAttribute("isLogOn", true);
			String msg = String.format("%s(%s)님 환영합니다.", memberVO.getMname(), uid);
			ModelAndView mav = new ModelAndView("/user/login"); // tiles-member.xml(/user/login)
			mav.addObject("msg", msg);
			return mav;
		}
		else {
			return new ModelAndView("redirect:/user/loginform.do");
		}
	}
	
	@RequestMapping(value="/logout.do", method=RequestMethod.POST)
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("[LoginServiceController] /logout.do");
		
		HttpSession session = request.getSession();
		session.removeAttribute("member");
		session.removeAttribute("isLogOn");
		
		return new ModelAndView("/user/logout"); // tiles-member.xml(/user/logout)
	}

	
}
