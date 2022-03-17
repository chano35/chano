package calcz;

import calcx2.Calcx;

public class Calcz extends Calcx {
	public Calcz() {
	}
	
	public Calcz(int sum) {
		super(sum);
	}
	
	@Override
	public int compute(String oper, int x) {
		System.out.printf("Calcz:compute(%s,%d)\n", oper, x);
		return super.compute(oper, x);
	}

	@Override
	public int getSum() {
		System.out.printf("Calcz:getSum() : %d\n", super.sum);
		return super.sum;
	}

}