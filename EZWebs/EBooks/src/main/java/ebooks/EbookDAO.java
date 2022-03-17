package ebooks;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EbookDAO {
	public ArrayList<EbookVO> list() throws SQLException {
		ArrayList<EbookVO> list = new ArrayList<EbookVO>();
		DBConnection db = new DBConnection();
		Connection con = DBConnection.getCon();
		PreparedStatement pstmt = null;
		String query = "SELECT * FROM ebooks";
		ResultSet rs = null;
		
		try {
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EbookVO vo = new EbookVO();
				vo.setSerial(rs.getInt("serial"));
				vo.setTitle("title");
				vo.setAuthor("author");
				vo.setPrice(rs.getInt("price"));
				vo.setQty(rs.getInt("qty"));
				list.add(vo);

			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return list;
	}

}
