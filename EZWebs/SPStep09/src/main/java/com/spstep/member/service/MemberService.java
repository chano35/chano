package com.spstep.member.service;

import java.util.List;

import com.spstep.member.vo.MemberVO;

public interface MemberService {
	public MemberVO login(String userid, String passwd);
	public int insertMember(MemberVO memberVO);
	public int updateMember(MemberVO memberVO);
	public int deleteMember(String mid);
	public MemberVO selectMember(String mid);
	public List<MemberVO> listMember();
}
