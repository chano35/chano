package beep;

import java.awt.Toolkit;

public class BeepThreadRun2 {

	public static void main(String[] args) {
		Thread beepThread = new Thread() {
			@Override
			public void run() { // 백그라운드로 처리를 해야할 작업을 기술
				System.out.println("BeepTask: start...");
				
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int cnt=0; cnt < 10; cnt++) {
					toolkit.beep();
					System.out.printf("BeepTask: beep(%d)!!!\n", cnt);
					
					try {
						Thread.sleep(500); // milli-second(1000분의 1초), 0.5초
						
					}
					catch(Exception e) {
						System.out.println("BeepTask: exception ->" + e.getMessage());
					}
				}
			}
		};
				
		beepThread.start();

		System.out.println("The end main task."); // 메인 쓰레드는 작업일 종료
	}

}