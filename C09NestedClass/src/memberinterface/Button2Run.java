package memberinterface;

public class Button2Run {

	public static void main(String[] args) {
		Button2 button2 = new Button2();
		button2.setOnTouchListener(new OnTouchListener() { // 익명 구현 객체
			@Override
			public void onTouch(String msg) {
				System.out.printf("button2: %s\n", msg);
			}
		});
		
		button2.touch();
	}

}