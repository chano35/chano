/*
 * 전자계산기: 실수(부동소숫점)
 * - 사칙연산 : 더하기, 빼기, 곱하기, 나누기, sum(가변인자)
 * - 계산이력 : 
 *   > 계산이력을 최대 100개까지 관리하라.
 * - 메소드 : 사칙연산, 총합출력, 이력출력, 이력을 사용한 재계산
 * --------------------------------------------------------------
 * [계산이력]
 *  이력출력: 1 + 10 - 4 * 3 / 2 = ?
 *  재계산  : 이력을 이용하여 재계산
 *  최종적으로 가지고 있는 값과 재계산 값을 비교 출력
 * --------------------------------------------------------------
 * [구현방안]
 * - 2차원 배열 사용(100 * 2) : 100개의 이력, 2열: 사칙연산, 값
 *   
 */
package calc;

public class Calcx {
	final static float PLUS = 0.0f;
	final static float MINUS = 1.0f;
	final static float MULTIPLE = 2.0f;
	final static float DIVIDE = 3.0f;
	
	final static int MAX_HISTORY = 100;
	
	double[][] histories = new double[MAX_HISTORY][];
	double total;
	int count;
	
	Calcx() {
	}
	
	Calcx(double total) {
		this.total = total;
	}
	
	void clear() {
		this.total = 0.0;
		this.count = 0;
	}
	
	double sum(double ... values) { // 배열, 가변인자
		createHistory(PLUS, values);
		
		for(int cnt=0; cnt < values.length; cnt++) {
			double val = values[cnt];
			this.total += val;
		}
		
		return this.total;
	}

	void createHistory(double oper, double val) {
		if(count >= MAX_HISTORY) {
			return;
		}
		
		histories[count] = new double[2];
		histories[count][0] = oper;
		histories[count][1] = val;
		count++;
	}
	
	void createHistory(double oper, double[] vals) {
		if(count >= MAX_HISTORY) {
			return;
		}

		histories[count] = new double[vals.length + 1];
		histories[count][0] = oper;
		System.arraycopy(vals, 0, histories[count], 1, vals.length); 
		count++;
	}
	
	double plus(double val) {
		createHistory(PLUS, val);
		this.total += val;
		return this.total;
	}

	double minus(double val) {
		createHistory(MINUS, val);
		this.total -= val;
		return this.total;
	}
	
	double multiple(double val) {
		createHistory(MULTIPLE, val);
		this.total *= val;
		return this.total;
	}
	
	double divide(double val) {
		createHistory(DIVIDE, val);
		this.total /= val;
		return this.total;
	}
	
	double total() {
		System.out.print("total() ");
		return this.total;
	}
	
	double recalc() {
		double totval = 0.0;
		
		for(int cnt=0; cnt < count; cnt++) {
			double oper = histories[cnt][0];
			for(int col=1; col < histories[cnt].length; col++) {
				double val = histories[cnt][col];
				
				if(oper == PLUS) {
					totval += val;
				}
				else if	(oper == MINUS) {
					totval -= val;
				}
				else if	(oper == MULTIPLE) {
					totval *= val;
				}
				else if	(oper == DIVIDE) {
					totval /= val;
				}
			}
		}		
	
		return totval;
	}
	
	void print() {
		System.out.printf("total=%.4f\n", this.total);
	}

	void print(String title) {
		System.out.printf("[%s] total=%.4f\n", title, this.total);
	}
	
	void history(String title) {
		System.out.printf("[%s]\n", title);
		
		System.out.printf("히스토리 갯수: %d\n", this.count);
		
		for(int cnt=0; cnt < count; cnt++) {
			double oper = histories[cnt][0];
			if(histories[cnt].length > 2) {
				System.out.printf("[ ");
			}
			for(int col=1; col < histories[cnt].length; col++) {
				
				double val = histories[cnt][col];
				System.out.printf("%s %.4f ",
						((oper == PLUS) ? "+" :
						(oper == MINUS) ? "-" :
						(oper == MULTIPLE) ? "*" :
						(oper == DIVIDE) ? "/" : " "), val);

			}
			if(histories[cnt].length > 2) {
				System.out.printf("]");
			}
		}
		
		System.out.println();
	}

}