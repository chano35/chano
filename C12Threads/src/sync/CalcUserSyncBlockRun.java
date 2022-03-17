package sync;

public class CalcUserSyncBlockRun {

	public static void main(String[] args) {
		CalcSync calc = new CalcSync();
		
		CalcUserSyncBlock1 user1 = new CalcUserSyncBlock1();
		user1.setCalc(calc);
		user1.start();

		CalcUserSyncBlock2 user2 = new CalcUserSyncBlock2();
		user2.setCalc(calc);
		user2.start();

	}

}