package com.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface MemberController {
	
	public ModelAndView insertMember(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView deleteMember(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView viewMember(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView editMember(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView updateMember(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView listMember(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
