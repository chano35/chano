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

public class BeepTaskRun {

	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
		Thread beepThread = new Thread(beepTask);
		beepThread.start(); // 작업 쓰레드가 백그라운드로 실행
		
		System.out.println("The end main task."); // 메인 쓰레드는 작업일 종료
	}

}