package members;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {

	private Connection conn; // 자바와 데이터베이스를 연결
	private PreparedStatement pstmt; // 쿼리문 대기 및 설정
	private ResultSet rs; // 결과값 받아오기

	// 기본 생성자
	// UserDAO가 실행되면 자동으로 생성되는 부분
	// 메소드마다 반복되는 코드를 이곳에 넣으면 코드가 간소회된다

	public UserDAO() {
		try {
			String dbURL = "jdbc:mysql://localhost:3306/bbs?serverTimezone=UTC"; // mysql과 연결시켜주는 주소
			String dbId = "root"; // mysql 계정"root"
			String dbPassword = "2468"; // mysql 비밀번호 "2468"
			Class.forName("com.mysql.jdbc.Driver"); // jdbc연결 클래스를 'String'타입으로 ㅜㄹ러온다
			conn = DriverManager.getConnection(dbURL, dbId, dbPassword); // 드라이버 매니저에 미리 저장했던 연결 URL과 DB계정 정보를 담아 연결 설정을
																			// 한다.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 로그인 영역
	public int login(String userId, String userPassword) {
		String sql = "select userPassword from user where userId = ?"; // 실제로 DB에서 입력할 쿼리문을 'sql'변수에 미리 담아둡니다
		try {
			pstmt = conn.prepareStatement(sql); // sql쿼리문을 대기 시킨다 , 미리 설정한 'sql'을 셋팅하는 코드
			pstmt.setString(1, userId); // 첫번째 '?'에 매개변수를 받아온 'userId'를 대입
			rs = pstmt.executeQuery(); // 쿼리를 실행한 결과를 rs에 저장

			if (rs.next()) {
				if (rs.getString(1).equals(userPassword)) {
					return 1; // 로그인 성공
				} else
					return 0; // 비밀번호 틀림
			}
			return -1; // 아이디 없음

		} catch (Exception e) {
			e.printStackTrace();
		}
		return -2; // 오류

	}
	
	public int join(User user) {
		String sql = "insert into user values(?, ?, ?, ?, ?)";		//'user' 테이블에 데이터를 입력하는 쿼리문
		try {
			pstmt = conn.prepareStatement(sql);			//'sql' 쿼리문을 대기시킨다
			pstmt.setString(1, user.getUserId());
		    pstmt.setString(2, user.getUserPassword());
		    pstmt.setString(3, user.getUserName());
		    pstmt.setString(4, user.getUserGender());
		    pstmt.setString(5, user.getUserEmail());
		    
		    return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	

}







