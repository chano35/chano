package com.spstep.member.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spstep.member.service.MemberService;
import com.spstep.member.vo.MemberVO;

@Controller("memberServiceController")
@RequestMapping("/user")
public class MemberServiceController implements MemberController {
	
	private MemberService memberService;
	
	@Autowired
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}

	@Override
	@RequestMapping(value="/memberinsert.do", method=RequestMethod.POST)
	public ModelAndView insertMember(@ModelAttribute("memberVO") MemberVO memberVO,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("[MemberServiceController] /user/memberinsert.do");
		
		/*
		request.setCharacterEncoding("UTF-8");
		String mid = request.getParameter("mid");
		String mname = request.getParameter("mname");
		String pwd = request.getParameter("pwd");
		String email = request.getParameter("email");
		MemberVO memberVO = new MemberVO(mid, mname, pwd, email);
		*/
		
		int result = memberService.insertMember(memberVO);
		if(result > 0) {
			ModelAndView mav = new ModelAndView("redirect:/user/memberlist.do");
			return mav;
		}
		
		ModelAndView mav = new ModelAndView("/user/memberform");
		return mav;
	}

	@Override
	@RequestMapping(value="/memberlist.do", method=RequestMethod.GET)
	public ModelAndView listMember(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("[MemberServiceController] /user/memberlist.do");

		List<MemberVO> memberList = memberService.listMember();
		
		// ModelAndView mav = new ModelAndView("memberList");
		ModelAndView mav = new ModelAndView("/user/memberlist");
		mav.addObject("memberlist", memberList);
		return mav;
	}

	@Override
	@RequestMapping(value="/memberdelete.do", method=RequestMethod.GET)
	public ModelAndView deleteMember(@RequestParam("mid") String mid,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("[MemberServiceController] /user/memberdelete.do");
		
		/*
		request.setCharacterEncoding("UTF-8");
		String mid = request.getParameter("mid");
		*/
		
		int result = memberService.deleteMember(mid);
		if(result > 0) {
			ModelAndView mav = new ModelAndView("redirect:/user/memberlist.do");
			return mav;
		}

		ModelAndView mav = new ModelAndView("redirect:/user/memberlist.do");
		return mav;
	}
	
	@Override
	@RequestMapping(value="/memberview.do", method=RequestMethod.GET)
	public ModelAndView viewMember(@RequestParam("mid") String mid,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("[MemberServiceController] /user/memberview.do");
		
		/*
		request.setCharacterEncoding("UTF-8");
		String mid = request.getParameter("mid");
		*/
		
		MemberVO memberVO = memberService.selectMember(mid);
		if(memberVO != null) {
			// ModelAndView mav = new ModelAndView("memberView");
			ModelAndView mav = new ModelAndView("/user/memberview");
			mav.addObject("member", memberVO);
			return mav;
		}
		
		ModelAndView mav = new ModelAndView("redirect:/user/memberlist.do");
		return mav;
	}
	
	@Override
	@RequestMapping(value="/memberedit.do", method=RequestMethod.GET)
	public ModelAndView editMember(@RequestParam("mid") String mid, HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("[MemberServiceController] /user/memberedit.do");
		
		/*
		request.setCharacterEncoding("UTF-8");
		String mid = request.getParameter("mid");
		*/
		
		MemberVO memberVO = memberService.selectMember(mid);
		if(memberVO != null) {
			// ModelAndView mav = new ModelAndView("memberEdit");
			ModelAndView mav = new ModelAndView("/user/memberedit");
			mav.addObject("member", memberVO);
			return mav;
		}
		
		ModelAndView mav = new ModelAndView("redirect:/user/memberlist.do");
		return mav;
	}
	

	@Override
	@RequestMapping(value="/memberupdate.do", method=RequestMethod.POST)
	public ModelAndView updateMember(@RequestParam Map<String, String> memMap,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("[MemberServiceController] /user/memberupdate.do");
		
		/*
		request.setCharacterEncoding("UTF-8");
		String mid = request.getParameter("mid");
		String mname = request.getParameter("mname");
		String pwd = request.getParameter("pwd");
		String email = request.getParameter("email");
		MemberVO memberVO = new MemberVO(mid, mname, pwd, email);
		*/
		MemberVO memberVO = new MemberVO();
		memberVO.setMid(memMap.get("mid"));
		memberVO.setMname(memMap.get("mname"));
		memberVO.setPwd(memMap.get("pwd"));
		memberVO.setEmail(memMap.get("email"));
		
		int result = memberService.updateMember(memberVO);
		if(result > 0) {
			ModelAndView mav = new ModelAndView("redirect:/user/memberlist.do");
			return mav;
		}
		
		ModelAndView mav = new ModelAndView("/user/memberform");
		return mav;
	}
	
	@Override
	@RequestMapping(value="/memberform.do", method=RequestMethod.GET)
	public ModelAndView formMember(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("[MemberServiceController] /user/memberform.do");
		return new ModelAndView("/user/memberform");
	}
	
}
