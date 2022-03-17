package exercises.exercise07;

public class LoginRun2 {

	public static void main(String[] args) {
		try {
			login("white", "12345");
		}
		catch(NotExistIDException e) {
			System.out.println("[ID] " + e.getMessage());
		}
		catch(WrongPasswordException e) {
			System.out.println("[PASSWORD] " + e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}		
		
		try {
			login("blue", "54321");
		}
		catch(NotExistIDException |  WrongPasswordException e) {
			System.out.println(e.getMessage());
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
		/*
 		// Unreachable catch block for NotExistIDException. It is already handled by the catch block for Exception
		catch(NotExistIDException e) { 
			System.out.println("[ID] " + e.getMessage());
		}
		// Unreachable catch block for WrongPasswordException. It is already handled by the catch block for Exception
		catch(WrongPasswordException e) {
			System.out.println("[PASSWORD] " + e.getMessage());
		}
		*/		
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