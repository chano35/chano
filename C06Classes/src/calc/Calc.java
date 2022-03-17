/*
 * 전자계산기: 정수 계산기
 * - 사칙연산 : 덧셈, 뺄셈, 곱셈, 나눗셈
 * - 나머지
 * - 출력
 */
package calc;

public class Calc {
	private int total;
	
	public static int getTotalStatic(Calc calc) {
		// int tot = this.total;
		int tot = calc.total;
		return tot;
	}
	
	public Calc() {
		System.out.println("3. Calc()");
	}
	
	Calc(int total) {
		this.total = total;
	}
	
	public void clear() {
		this.total = 0;
	}
	
	public int sum(int[] values) { // 배열
		for(int val : values) {
			this.total += val;
		}
		return this.total;
	}

	public int sums(int ... values) { // 배열, 가변인자
		/*
		for(int val : values) {
			this.total += val;
		}
		*/
		
		for(int cnt=0; cnt < values.length; cnt++) {
			int val = values[cnt];
			this.total += val;
		}
		
		return this.total;
	}

	public int plus(int val) {
		this.total += val;
		return this.total;
	}

	public int minus(int val) {
		this.total -= val;
		return this.total;
	}
	
	public int multiple(int val) {
		this.total *= val;
		return this.total;
	}
	
	public int divide(int val) {
		this.total /= val;
		return this.total;
	}
	
	public int mod(int val) {
		this.total %= val;
		return this.total;
	}
	
	public int total() {
		System.out.print("total() ");
		return this.total;
	}
	
	public void print() {
		System.out.println("total=" + this.total);
	}

	public void print(String title) {
		System.out.printf("[%s] total=%d\n", title, this.total);
	}

}