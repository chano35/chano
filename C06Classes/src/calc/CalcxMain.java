package calc;

public class CalcxMain {

	public static void main(String[] args) {
		Calcx calc = new Calcx();

		calc.plus(10.0);
		calc.minus(5.0);
		calc.multiple(4.0);
		calc.divide(3.0);
		calc.sum(1,2,3,4,5);
		
		calc.print();
		calc.history("이력");
		
		double recalc = calc.recalc();
		System.out.printf("recalc : total=%.4f\n", recalc);
	}

}