package com.spstep.member.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spstep.member.vo.MemberVO;

public interface MemberController {
	
	public ModelAndView insertMember(@ModelAttribute("memberVO") MemberVO memberVO, HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView deleteMember(@RequestParam("mid") String mid, HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView viewMember(@RequestParam("mid") String mid, HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView editMember(@RequestParam("mid") String mid, HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView updateMember(@RequestParam Map<String, String> memMap, HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView listMember(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView formMember(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
