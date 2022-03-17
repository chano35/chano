/*
 * [동기화]
 * 1. 동기화 메소드
 *    - 지정된 메소드에 대한 접근을 동기화
 *    - 여러 쓰레드가 메소드를 호출하면 먼저 처리하고 있는 쓰레드가 처리를 할 때가지
 *      다른 쓰레드는 대기하여 순차적으로 처리할 수 있도록 잠금 처리
 * 2. 동기화 블럭
 *    - 지정된 객체에 대한 접근을 동기화
 *    - 여러 쓰레드가 지정된 블록에 접근하면 지정된 객체에 대해서
 *      먼저 들어온 쓰레드가 처리할 때까지 다른 쓰레드는 대기(잠금처리)
 *----------------------------------------------------------------
 */
package sync;

public class CalcSync {
	private int memory;
	
	public int getMemory() {
		return this.memory;
	}
	
	// 동기화 메소드
	// 메소드 앞에 synchronized 기술
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		System.out.printf("[Calc] setMemory(시작): tname(%s), memory(%d)%n", 
				Thread.currentThread().getName(), this.memory);
		
		try { // 처리
		
			Thread.sleep(2000); // 2초 정지
		}
		catch(InterruptedException e) {
		}
		
		System.out.printf("[Calc] setMemory(종료): tname(%s), memory(%d)%n",
				Thread.currentThread().getName(), this.memory);
	}
	
	// 동기화 블럭
	// synchronized(object)
	public void setMemoryBlock(int memory) {
		System.out.printf("[Calc] setMemoryBlock(시작): tname(%s), memory(%d)%n", 
				Thread.currentThread().getName(), memory);

		synchronized(this) {
			this.memory = memory;
			
			try { // 처리
				Thread.sleep(2000); // 2초 정지
			}
			catch(InterruptedException e) {
			}
			
			System.out.printf("[Calc] setMemoryBlock(종료): tname(%s), memory(%d)%n",
					Thread.currentThread().getName(), this.memory);
		}
	}

}