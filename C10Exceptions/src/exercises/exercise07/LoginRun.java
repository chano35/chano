package exercises.exercise07;

public class LoginRun {

	public static void main(String[] args) {
		try {
			login("white", "12345");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue", "54321");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue", "12345");
			System.out.println("$$$ 로그인 성공 $$$$");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	/*
	 * id(bule), password(12345)
	 */
	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
		if(id.equals("blue") != true) {
			throw new NotExistIDException("존재하지 않는 아이디");
		}
		
		if(password.equals("12345") != true) {
			throw new WrongPasswordException("패스워드 오류");
		}
		
	}

}