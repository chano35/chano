package sync;

public class CalcUserSyncRun {

	public static void main(String[] args) {
		CalcSync calc = new CalcSync();
		
		CalcUserSync1 user1 = new CalcUserSync1();
		user1.setCalc(calc);
		user1.start();

		CalcUserSync2 user2 = new CalcUserSync2();
		user2.setCalc(calc);
		user2.start();

	}

}