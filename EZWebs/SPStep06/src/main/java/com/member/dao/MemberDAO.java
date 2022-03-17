package com.member.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.member.vo.MemberVO;

public interface MemberDAO {
	public int insertMember(MemberVO memberVO) throws DataAccessException;
	public int deleteMember(String mid) throws DataAccessException;
	public int updateMember(MemberVO memberVO) throws DataAccessException;
	public MemberVO selectMember(String mid) throws DataAccessException;
	public List<MemberVO> listMember() throws DataAccessException;
}
