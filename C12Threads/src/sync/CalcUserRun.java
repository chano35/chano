package sync;

public class CalcUserRun {

	public static void main(String[] args) {
		Calc calc = new Calc();
		
		CalcUser1 user1 = new CalcUser1();
		user1.setCalc(calc);
		user1.start();

		CalcUser2 user2 = new CalcUser2();
		user2.setCalc(calc);
		user2.start();

	}

}