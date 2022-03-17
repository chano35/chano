package nullpointer;

public class NullPointerExceptionRun3 {

	public static void main(String[] args) {
		String data = null;
		
		if(args.length > 0) {
			data = args[0];
		}

		if(data == null) {
			System.out.println("데이터가 할당되어 있지 않습니다.");
			System.out.println("작업끝");
			return;
		}

		System.out.println("data.length:" + data.length());
		System.out.println(data.toString());

		System.out.println("작업끝");
	}

}