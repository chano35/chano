/*
 * 쓰레드를 생성 및 실행:
 * 1. Thread 객체를 만든다.
 * 2. Thread 생성자에 Runnable 인터페이스의 구현 클래스의 객체를 전달
 * 3. Thread.start();
 * -----------------------------------------------------------------
 * 1. 자바를 기본적으로 메인(main) 쓰레드가 생성
 * 2. 작업 쓰레드는 백그라운드로 실행
 * 3. 메인 쓰레드와 개별으로 실행
 * 4. 작업 쓰레드는 메인 쓰레드가 끝나도 독립적으로 실행
 */
package beep;

import java.awt.Toolkit;

public class BeepTaskRun2 {

	public static void main(String[] args) {
		Thread beepThread = new Thread(new Runnable() {
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
		});
		
		beepThread.start(); // 작업 쓰레드가 백그라운드로 실행
		
		System.out.println("The end main task."); // 메인 쓰레드는 작업일 종료
	}

}