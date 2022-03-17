package calcminus;

import calc.Calc;

public class CalcMinus extends Calc {
	private int pprisum; 
	public CalcMinus() {
		// super.privsum = -9;
		this.pprisum = super.getPrivSum();
	}
	
	public CalcMinus(int sum) {
		super(sum);
	}
	
	@Override
	public int compute(int sum) { // 빼기
		// this.prevsum = this.sum; // default이기 때문에 자식에서 접근불가
		// setPrevSum();
		// this.setPrevSum();
		super.setPrevSum();
		
		this.sum -= sum;
		return this.sum;
	}

}