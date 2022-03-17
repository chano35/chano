package soldb;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleSQL {

	public static void main(String[] args) {
		OracleSQL users = new OracleSQL();
		
		
		users.insert("admin", "1234", "관리자");
		
		users.update("admin", "12345", "관리자1");
		
		users.delete("admin");

		users.select();
	}
	
	public void delete(String uid) {
		String sql = String.format("DELETE FROM users WHERE uid = '%s'", uid);
		
		Connection conn = null;
		Statement  stmt = null;
		
		System.out.println("[users Table DELETE]");
		
		try {
			conn = OracleConnector.getConnection();
			stmt = conn.createStatement();
			
			int success = stmt.executeUpdate(sql);
			if(success > 0) { 
				System.out.printf("DELETE: succeed(%d)\n", success);
			}
			else {
				System.out.printf("DELETE: failed(%d)\n", success);
			}
		}
		catch(SQLException e) {
			System.out.println("DELETE: SQLException: " + e.toString());
		}
		finally {
			try {
				if(stmt != null) {
					stmt.close();
				}
				
			}
			catch(Exception e) {
				System.out.println("DELETE:finally:Exception: " + e.toString());
			}
			
			OracleConnector.closeConnection();
		}
	}
	
	public void update(String uid, String upw, String uname) {
		String sql = String.format("UPDATE users SET uname='%s', upw='%s' WHERE uid = '%s'", uname, upw, uid);
		
		Connection conn = null;
		Statement  stmt = null;
		
		System.out.println("[users Table UPDATE]");
		
		try {
			conn = OracleConnector.getConnection();
			stmt = conn.createStatement();
			int success = stmt.executeUpdate(sql);
			if(success > 0) { // 처리한 갯수를 리턴
				System.out.printf("UPDATE: succeed(%d)\n", success);
			}
			else {
				System.out.printf("UPDATE: failed(%d)\n", success);
			}
		}
		catch(SQLException e) {
			System.out.println("UPDATE: SQLException: " + e.toString());
		}
		finally {
			try {
				if(stmt != null) {
					stmt.close();
				}
				
			}
			catch(Exception e) {
				System.out.println("UPDATE:finally:Exception: " + e.toString());
			}
			
			OracleConnector.closeConnection();
		}
	}

	public void insert(String uid, String uname, String upw) {
		String sql = String.format("INSERT INTO users VALUES('%s', '%s', '%s')", uid, uname, upw);
		
		Connection conn = null;
		Statement  stmt = null;
		
		System.out.println("[Hello Table Insert]");
		
		try {
			conn = OracleConnector.getConnection();
			stmt = conn.createStatement();
			int success = stmt.executeUpdate(sql);
			if(success > 0) { // 처리한 갯수를 리턴
				System.out.printf("INSERT: succeed(%d)\n", success);
			}
			else {
				System.out.println("INSERT: failed!!!");
			}
		}
		catch(SQLException e) {
			System.out.println("INSERT: SQLException: " + e.toString());
		}
		finally {
			try {
				if(stmt != null) {
					stmt.close();
				}
				
			}
			catch(Exception e) {
				System.out.println("INSERT: " + e.toString());
			}
			
			OracleConnector.closeConnection();
		}
	}
	
	
	
	public void select() {
		final String sql = "SELECT * FROM users ORDER BY uid";

		Connection conn = null;
		Statement  stmt = null;
		ResultSet  rset = null;
		
		System.out.println("[users Table Select]");
		
		try {
			conn = OracleConnector.getConnection();
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);

			System.out.printf("[HID] [HNAME]     [HTEL]%n");
			System.out.printf("---------------------------%n");
			
			while(rset.next() ) {
				String uid   = rset.getString(1);
				String uname = rset.getString(2);
				String upw  = rset.getString(3);
				
				System.out.printf("%s  %s  %s %n", uid, uname, upw);
			}
		}
		catch(SQLException e) {
			System.out.println("select: SQLException: " + e.toString());
		}
		finally {
			try {
				if(rset != null) {
					rset.close();
				}
				
				if(stmt != null) {
					stmt.close();
				}
				
			}
			catch(Exception e) {
				System.out.println("select:finally:Exception: " + e.toString());
			}
			
			OracleConnector.closeConnection();
		}
	}
}