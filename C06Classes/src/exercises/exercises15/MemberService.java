package exercises.exercises15;

public class MemberService {
	private static final String MEMBER_ID = "hong";
	private static final String MEMBER_PW = "1234";
	
	boolean logined = false;
	
	MemberService() {
	}
	
	boolean login(String id, String password) {
		if(id.equals(MEMBER_ID) && password.equals(MEMBER_PW)) {
			logined = true;
			return true;
		}
		
		return false;
	}
	
	void logout(String id) {
		if(logined && id.equals(MEMBER_ID)) {
			System.out.printf("id(%s)\n", id);
			logined = false;
			return;
		}

		System.out.printf("id(%s)\n", id);
	}
	
	public static void main(String[] args) {
		MemberService user = new MemberService();
		if(user.login("hong",  "1234")) {
			System.out.println("login success!!!");
		}
		else {
			System.out.println("login failure!!!");
		}
		
		user.logout("hong");
		user.logout("hong");
	}
}
