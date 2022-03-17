package calcx;

import calc.Calc;
import calcdivide.CalcDivide;
import calcminus.CalcMinus;
import calcmultiple.CalcMultiple;

public class Calcx {
	private int sum;
	
	Calcx() {
	}
	
	Calcx(int sum) {
		this.sum = sum;
	}
	
	public int compute(String oper, int x) {
		/*
		Calc plus = null;
		CalcMinus minus = null;
		CalcMultiple multiple = null;
		CalcDivide divide = null;
		*/
		
		switch(oper) {
		case "+":
			Calc plus = new Calc(this.sum);
			this.sum = plus.compute(x);
			break;
		case "-":
			CalcMinus minus = new CalcMinus(this.sum);
			this.sum = minus.compute(x);
			break;
		case "*":
			CalcMultiple multiple = new CalcMultiple(this.sum); 
			this.sum = multiple.compute(x);
			break;
		case "/":
			CalcDivide divide = new CalcDivide(this.sum);
			this.sum = divide.compute(x);
			break;
		}

		return this.sum;
	}
	
	public int getSum() {
		return this.sum;
	}
	
	

}