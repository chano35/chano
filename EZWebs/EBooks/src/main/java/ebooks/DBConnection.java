package ebooks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection getCon() throws SQLException {
		Connection con = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			con = DriverManager.getConnection(url, "soluser", "soluser");
			return con;
		} catch (ClassNotFoundException ce) {
			System.out.println(ce.getMessage());
		}
		return null;
	}

}
