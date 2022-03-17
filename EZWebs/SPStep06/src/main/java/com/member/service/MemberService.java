package com.member.service;

import java.util.List;

import com.member.vo.MemberVO;

public interface MemberService {
	public int insertMember(MemberVO memberVO);
	public int updateMember(MemberVO memberVO);
	public int deleteMember(String mid);
	public MemberVO selectMember(String mid);
	public List<MemberVO> listMember();
}
