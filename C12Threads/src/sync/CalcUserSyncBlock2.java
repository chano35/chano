package sync;

public class CalcUserSyncBlock2 extends Thread {
	private CalcSync calc;
	
	public void setCalc(CalcSync calc) {
		this.setName("CalcUserSync2");
		this.calc = calc;
	}
	
	@Override
	public void run() {
		this.calc.setMemoryBlock(200);

		System.out.printf("[CalcUser2] tname(%s), memory(%d)%n", getName(), calc.getMemory());
		
	}


}