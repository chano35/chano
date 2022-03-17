package memberinterface;

public class ButtonRun {

	public static void main(String[] args) {
		Button button = new Button();
		button.setOnClickListener(new ButtonClickListener());
		button.touch();
	}

}