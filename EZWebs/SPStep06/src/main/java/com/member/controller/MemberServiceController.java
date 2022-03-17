package com.member.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.member.service.MemberService;
import com.member.vo.MemberVO;

public class MemberServiceController extends MultiActionController implements MemberController {
	private MemberService memberService;
	
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}

	@Override
	public ModelAndView insertMember(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("[MemberServiceController] /user/memberinsert.do");
		
		request.setCharacterEncoding("UTF-8");
		String mid = request.getParameter("mid");
		String mname = request.getParameter("mname");
		String pwd = request.getParameter("pwd");
		String email = request.getParameter("email");
		
		MemberVO memberVO = new MemberVO(mid, mname, pwd, email);
		int result = memberService.insertMember(memberVO);
		if(result > 0) {
			ModelAndView mav = new ModelAndView("redirect:/user/memberlist.do");
			return mav;
		}
		
		ModelAndView mav = new ModelAndView("/user/userForm.jsp");
		return mav;
	}

	@Override
	public ModelAndView listMember(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("[MemberServiceController] /user/memberlist.do");

		List<MemberVO> memberList = memberService.listMember();
		
		ModelAndView mav = new ModelAndView("/user/memberList.jsp");
		mav.addObject("memberlist", memberList);
		return mav;
	}

	@Override
	public ModelAndView deleteMember(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("[MemberServiceController] /user/deletemember.do");
		
		request.setCharacterEncoding("UTF-8");
		String mid = request.getParameter("mid");
		
		int result = memberService.deleteMember(mid);
		if(result > 0) {
			ModelAndView mav = new ModelAndView("redirect:/user/memberlist.do");
			return mav;
		}

		ModelAndView mav = new ModelAndView("redirect:/user/memberlist.do");
		return mav;
	}
	
	@Override
	public ModelAndView viewMember(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("[MemberServiceController] /user/viewmember.do");
		
		request.setCharacterEncoding("UTF-8");
		String mid = request.getParameter("mid");
		
		MemberVO memberVO = memberService.selectMember(mid);
		if(memberVO != null) {
			ModelAndView mav = new ModelAndView("/user/memberView.jsp");
			mav.addObject("member", memberVO);
			return mav;
		}
		
		ModelAndView mav = new ModelAndView("redirect:/user/memberlist.do");
		return mav;
	}
	
	@Override
	public ModelAndView editMember(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("[MemberServiceController] /user/editmember.do");
		
		request.setCharacterEncoding("UTF-8");
		String mid = request.getParameter("mid");
		
		MemberVO memberVO = memberService.selectMember(mid);
		if(memberVO != null) {
			ModelAndView mav = new ModelAndView("/user/memberEdit.jsp");
			mav.addObject("member", memberVO);
			return mav;
		}
		
		ModelAndView mav = new ModelAndView("redirect:/user/memberlist.do");
		return mav;
	}
	

	@Override
	public ModelAndView updateMember(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("[MemberServiceController] /user/updatemember.do");
		
		request.setCharacterEncoding("UTF-8");
		String mid = request.getParameter("mid");
		String mname = request.getParameter("mname");
		String pwd = request.getParameter("pwd");
		String email = request.getParameter("email");
		
		MemberVO memberVO = new MemberVO(mid, mname, pwd, email);
		int result = memberService.updateMember(memberVO);
		if(result > 0) {
			ModelAndView mav = new ModelAndView("redirect:/user/memberlist.do");
			return mav;
		}
		
		ModelAndView mav = new ModelAndView("/user/userForm.jsp");
		return mav;
		
	}

	
}
