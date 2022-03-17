/*
 * CalcUser1과 CalcUser2가 Calc를 공유
 */
package sync;

public class CalcUser2 extends Thread {
	private Calc calc;
	
	public void setCalc(Calc calc) {
		this.setName("CalcUser2");
		this.calc = calc;
	}
	
	@Override
	public void run() {
		this.calc.setMemory(200);

		System.out.printf("[CalcUser2] tname(%s), memory(%d)%n", getName(), calc.getMemory());
		
	}


}