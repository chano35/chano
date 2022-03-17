/*
 * 쓰레드가 처리해야 할 작업(task)을 정의
 * 인터페이스 Runnable의 구현 클래스를 정의
 */
package beep;

import java.awt.Toolkit;

public class BeepTask implements Runnable {
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
}