/*
 * 동기화 처리가 되지 않아서
 * 처리도중에 값이 바뀔 수 있다.
 */
package sync;

public class Calc {
	private int memory;
	
	public int getMemory() {
		return this.memory;
	}
	
	public void setMemory(int memory) {
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

}