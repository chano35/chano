package calcdivide;

import calc.Calc;

public class CalcDivide extends Calc {
	public CalcDivide() {
	}
	
	public CalcDivide(int sum) {
		super(sum);
	}
	
	@Override
	public int compute(int sum) { // 나누기
		super.setPrevSum();
		this.sum /= sum;
		return this.sum;
	}

}