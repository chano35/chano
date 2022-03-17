/*
 * 
 */
package sync;

public class CalcUserSync1 extends Thread {
	private CalcSync calc;
	
	public void setCalc(CalcSync calc) {
		this.setName("CalcUserSync1");
		this.calc = calc;
	}
	
	@Override
	public void run() {
		this.calc.setMemory(100);

		System.out.printf("[CalcUser1] tname(%s), memory(%d)%n", getName(), calc.getMemory());
		
	}


}