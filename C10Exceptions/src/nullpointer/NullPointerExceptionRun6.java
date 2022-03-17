package nullpointer;

public class NullPointerExceptionRun6 {

	public static void main(String[] args) {
		String step1 = "step1";
		String step2 = null;
		
		try {
			System.out.println("step1");
			System.out.printf("step1: length(%d), %s\n", step1.length(), step1.toString());

			System.out.println("step2");
			System.out.printf("step2: length(%d), %s\n", step2.length(), step2.toString());
		}
		catch(RuntimeException e) {
			System.out.println("[catch] RuntimeException: data에 값이 할당되어 있지 않습니다.");
			System.out.println("e: " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("작업끝");
	}

}