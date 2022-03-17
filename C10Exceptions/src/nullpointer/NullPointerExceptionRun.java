package nullpointer;

public class NullPointerExceptionRun {

	public static void main(String[] args) {
		// String data = "작업처리";

		// 컴파일 오류: 초기값을 지정하지 않음
		// The local variable data may not have been initialized
		// String data;
		
		String data = null;

		// 실행오류로 인해서 비정상 종료
		System.out.println("data.length:" + data.length());
		System.out.println(data.toString());

		System.out.println("작업끝");
	}

}