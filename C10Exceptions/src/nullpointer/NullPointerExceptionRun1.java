package nullpointer;

public class NullPointerExceptionRun1 {

	public static void main(String[] args) {
		String data = "";
		
		System.out.println("data.length:" + data.length());
		System.out.println(data.toString());

		System.out.println("작업끝");
	}

}