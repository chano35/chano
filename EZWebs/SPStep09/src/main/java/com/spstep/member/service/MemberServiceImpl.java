package com.spstep.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spstep.member.dao.MemberDAO;
import com.spstep.member.vo.MemberVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	private MemberDAO memberDAO;
	
	@Autowired
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	@Override
	public MemberVO login(String userid, String passwd) {
		MemberVO memberVO = new MemberVO();
		memberVO.setMid(userid);
		memberVO.setMname("게스트");
		return memberVO;
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
