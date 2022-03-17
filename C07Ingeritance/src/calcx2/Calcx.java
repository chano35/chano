/*
 * final class: 
 * - 상속을 허용하지 않음
 * - calcz.Calcz에서 상속을 못함
 *
 * final method:
 * - 상속한 클래스에서 메소드 오버라이딩을 할 수 없다. 
 */
package calcx2;

import calc.Calc;
import calcdivide.CalcDivide;
import calcminus.CalcMinus;
import calcmultiple.CalcMultiple;

//public final class Calcx {
public class Calcx {
	protected Calc plus = new Calc();
	protected CalcMinus minus = new CalcMinus();
	protected CalcMultiple multiple = new CalcMultiple();
	protected CalcDivide divide = new CalcDivide();

	protected int sum;
	
	public Calcx() {
	}
	
	public Calcx(int sum) {
		this.sum = sum;
	}
	
	public int compute(String oper, int x) {
		switch(oper) {
		case "+":
			plus.setSum(this.sum);
			this.sum = plus.compute(x);
			break;
		case "-":
			minus.setSum(this.sum);
			this.sum = minus.compute(x);
			break;
		case "*":
			multiple.setSum(this.sum);
			this.sum = multiple.compute(x);
			break;
		case "/":
			divide.setSum(this.sum);
			this.sum = divide.compute(x);
			break;
		}

		return this.sum;
	}
	
	/*
	 * 메소드에 final을 하게되면 상속한 클래스에서 오버라이딩을 할 수 없다. 
	 */
	/*
	public final int getSum() {
		return this.sum;
	}
	*/
	public int getSum() {
		return this.sum;
	}
}