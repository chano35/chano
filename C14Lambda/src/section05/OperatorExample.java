/*
 * Operator 함수적 인터페이스
 * 
 * @FunctionalInterface
 * public interface IntBinaryOperator {
 *     int applyAsInt(int left, int right);
 * }
 */
package section05;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = { 70, 80, 90 };
	
	public static void main(String[] args) {
		int result = maxTest();
		System.out.println("maxTest:" + result);
		maxValue();
		minValue();
	}

	public static int maxTest() {
		int result = scores[0];
		for(int score : scores) {
			System.out.println(score);
			/*
			 * 람다식 코드
			 * result = operator.applyAsInt(result, score);
			 */
			if(result >= score) {
				result = result;
			}
			else {
				result = score;
			}

		}
		return result;
	}

	/*
	 * Binary Operation
	 * result = left + right;
	 */
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score :  scores) {
			System.out.println(score);
			result = operator.applyAsInt(result, score);
		}
		return result;
	}


	public static void maxValue() {
		int max = maxOrMin(
			(a,b) -> {
				if(a >= b) {
					return a;
				}
				else {
					return b;
				}
			}
		);	
		
		System.out.println("maxValue: " + max);
	}

	public static void minValue() {
		int min = maxOrMin((a,b) -> {
			if(a <= b) {
				return a;
			}
			else {
				return b;
			}
		});	
		
		System.out.println("minValue: " + min);
	}
}