package com.spstep.member.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spstep.member.vo.MemberVO;

@Repository("memverDAO")
public class MemberDAOImpl implements MemberDAO {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource datasource) {
		this.jdbcTemplate = new JdbcTemplate(datasource);
		System.out.println("datasource:" + datasource);
		System.out.println("jdbcTemplate:" + jdbcTemplate);
	}
	
	@Override
	public int insertMember(MemberVO memberVO) throws DataAccessException {
		String sql = String.format("INSERT INTO member(mid, mname, pwd, email) VALUES('%s', '%s', '%s', '%s')",
				memberVO.getMid(),
				memberVO.getMname(),
				memberVO.getPwd(),
				memberVO.getEmail());
		
		System.out.println("[insertMember] " + sql);
		
		int result = jdbcTemplate.update(sql);
		return result;
	}
	
	@Override
	public int deleteMember(String mid) throws DataAccessException {
		String sql = String.format("DELETE FROM member WHERE mid = '%s'", mid);
		
		System.out.println("[deleteMember] " + sql);
		
		int result = jdbcTemplate.update(sql);
		return result;
	}
	
	@Override
	public int updateMember(MemberVO memberVO) throws DataAccessException {
		String sql = String.format("UPDATE member set mname='%s', pwd='%s', email='%s' WHERE mid='%s'",
				memberVO.getMname(),
				memberVO.getPwd(),
				memberVO.getEmail(),
				memberVO.getMid());
		
		System.out.println("[updateMember] " + sql);
		
		int result = jdbcTemplate.update(sql);
		return result;
	}

	@Override
	public MemberVO selectMember(String mid) throws DataAccessException {
		String sql = String.format("SELECT mid, mname, pwd, email, regdate FROM member WHERE mid='%s'", mid);

		System.out.println("[selectMember] " + sql);

		MemberVO member = this.jdbcTemplate.queryForObject(sql, new RowMapper<MemberVO>() {
			@Override
			public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				MemberVO memberVO = new MemberVO();
				memberVO.setMid(rs.getString("mid"));
				memberVO.setMname(rs.getString("mname"));
				memberVO.setPwd(rs.getString("pwd"));
				memberVO.setEmail(rs.getString("email"));
				memberVO.setRegdate(rs.getDate("regdate"));
				return memberVO;
			}
		});
		
		return member;
	}

	@Override
	public List<MemberVO> listMember() throws DataAccessException {
		String sql = String.format("SELECT mid, mname, pwd, email, regdate FROM member ORDER BY mname");

		List<MemberVO> members = this.jdbcTemplate.query(sql, new RowMapper<MemberVO>() {
			@Override
			public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				MemberVO memberVO = new MemberVO();
				memberVO.setMid(rs.getString("mid"));
				memberVO.setMname(rs.getString("mname"));
				memberVO.setPwd(rs.getString("pwd"));
				memberVO.setEmail(rs.getString("email"));
				memberVO.setRegdate(rs.getDate("regdate"));
				return memberVO;
			}
		});
		
		return members;
	}
}
