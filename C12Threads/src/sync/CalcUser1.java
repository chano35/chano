/*
 * CalcUser1과 CalcUser2가 Calc를 공유
 */
package sync;

public class CalcUser1 extends Thread {
	private Calc calc;
	
	public void setCalc(Calc calc) {
		this.setName("CalcUser1");
		this.calc = calc;
	}
	
	@Override
	public void run() {
		this.calc.setMemory(100);

		System.out.printf("[CalcUser1] tname(%s), memory(%d)%n", getName(), calc.getMemory());
		
	}


}