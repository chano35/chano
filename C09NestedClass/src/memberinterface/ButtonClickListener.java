package memberinterface;

public class ButtonClickListener implements Button.OnClickListener {
	
	@Override
	public void onClick() {
		System.out.println("버튼이 클릭되었습니다.");
	}

}