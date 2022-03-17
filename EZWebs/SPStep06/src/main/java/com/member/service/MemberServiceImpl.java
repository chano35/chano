package com.member.service;

import java.util.List;

import com.member.dao.MemberDAO;
import com.member.vo.MemberVO;

public class MemberServiceImpl implements MemberService {
	private MemberDAO memberDAO;
	
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	@Override
	public int insertMember(MemberVO memberVO) {
		return memberDAO.insertMember(memberVO);
	}

	@Override
	public List<MemberVO> listMember() {
		return memberDAO.listMember();
	}

	@Override
	public int updateMember(MemberVO memberVO) {
		return memberDAO.updateMember(memberVO);
	}

	@Override
	public int deleteMember(String mid) {
		return memberDAO.deleteMember(mid);
	}

	@Override
	public MemberVO selectMember(String mid) {
		return memberDAO.selectMember(mid);
	}

}
