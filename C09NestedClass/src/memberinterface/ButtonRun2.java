package memberinterface;

public class ButtonRun2 {

	public static void main(String[] args) {
		Button b1 = new Button();
		b1.setOnClickListener(new ButtonClickListener());
		b1.touch();
		
		Button b2 = new Button();
		b2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("환영합니다.");
			}
		});
		b2.touch();
		
	}

}