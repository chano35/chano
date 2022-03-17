package calcmultiple;

import calc.Calc;

public class CalcMultiple extends Calc {
	public CalcMultiple() {
	}
	
	public CalcMultiple(int sum) {
		super(sum);
	}
	
	@Override
	public int compute(int sum) { // 곱하기
		super.setPrevSum();
		this.sum *= sum;
		return this.sum;
	}

}