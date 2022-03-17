/*
 * MemberDAO: Data Access Object
 */
package members;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import soldb.OracleConnectorDBCP;

public class MemberDBCP {
	private OracleConnectorDBCP _datasource = null;
	
	public MemberDBCP() {
		_datasource = new OracleConnectorDBCP();
	}
	
	protected Connection getConnection() throws SQLException {
		System.out.println("[MemberDBCP] getConnection...");
		return _datasource.getConnection();
	}

	protected void closeConnection() {
		_datasource.closeConnection();
	}
	
	public void insertMember(MemberVO memberVO) {
		System.out.println("[MemberDBCP] insertMember...");
		
		String sql = "INSERT INTO member (mid, mname, pwd, email) VALUES (?, ?, ?, ?)";
		
		try {
			Connection conn = this.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setString(1, memberVO.getMid());;
			stmt.setString(2, memberVO.getMname());
			stmt.setString(3, memberVO.getPwd());
			stmt.setString(4, memberVO.getEmail());
			
			stmt.executeUpdate();

			stmt.close();
			closeConnection();
		}
		catch(SQLException e) {
			System.out.println("[insertMember] SQLException : " + e.toString());
		}
	}
	
	public void deleteMember(String mid) {
		System.out.println("[MemberDBCP] deleteMember...");

		String sql = "DELETE FROM member WHERE mid = ?";
		
		try {
			Connection conn = this.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setString(1, mid);
			stmt.executeUpdate();
			stmt.close();
			
			closeConnection();
		}
		catch(SQLException e) {
			System.out.println("[deleteMember] SQLException : " + e.toString());
		}
	}

	
	
	public List<MemberVO> getMembers() {
		System.out.println("[MemberDBCP] getMembers...");
		
		List<MemberVO> listMembers = new ArrayList<MemberVO>();
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			String sql = "SELECT * FROM member ORDER BY mid";
			
			conn = this.getConnection();
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				String mid = rs.getString("mid");
				String mname = rs.getString("mname");
				String pwd = rs.getString("pwd");
				String email = rs.getString("email");
				Date regdate = rs.getDate("regdate");
				
				MemberVO member = new MemberVO();
				member.setMid(mid);
				member.setMname(mname);
				member.setPwd(pwd);
				member.setEmail(email);
				member.setRegdate(regdate);
				
				listMembers.add(member);
			}
		}
		catch(SQLException e) {
			System.out.println("[getMembers] SQLException : " + e.toString());
		}
		finally {
			try {
				if(rs != null) {
					rs.close();
				}
				
				if(stmt != null) {
					stmt.close();
				}
			}
			catch(Exception e) {
				System.out.println("[getMembers] finally SQLException : " + e.toString());
			}
			
			closeConnection();
		}
		
		return listMembers;
	}
}