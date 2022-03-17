package beep;

public class BeepThreadRun {

	public static void main(String[] args) {
		Thread beepThread = new BeepThread();
		beepThread.start();

		System.out.println("The end main task."); // 메인 쓰레드는 작업일 종료
	}

}