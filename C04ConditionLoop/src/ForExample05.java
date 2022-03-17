/*
 * [문제5] 임의의 수에서 임의의 배수를 구하라.
 * - 난수를 발생해서 배수와 임의의 수를 지정
 * - 최대값: 임의의 수는 10이상 100이하
 * - 배수: 2부터 5까지의 배수
 *   3의배수 : 3,6,9,12
 * -------------------------------------------
 * 예)
 *   최대값 : 15(난수)
 *   배  수 : 4(난수)
 *   결  과 : 4, 8, 12  
 * -------------------------------------------
 * 난수 : 0.0 <= x < 1.0
 * -------------------------------------------
 * 결과 = 난수 * 가지수 + 최소값
 */
public class ForExample05 {
	
	final static int MIN_NUMBER = 10;   // 임의의 수 최소값
	final static int MAX_NUMBER = 100;  // 임의의 수 최대값
	final static int MIN_MULTIPLE = 2;  // 배수 최소값
	final static int MAX_MULTIPLE = 5;  // 배수 최대값

	public static void main(String[] args) {
		int maxnum = (int)(Math.random() * (MAX_NUMBER - MIN_NUMBER + 1)) + MIN_NUMBER;
		int multiple = (int)(Math.random() * (MAX_MULTIPLE - MIN_MULTIPLE + 1)) + MIN_MULTIPLE;

		System.out.printf("최대값: (%d) <= [%d] <= (%d)\n", MIN_NUMBER, maxnum, MAX_NUMBER);
		System.out.printf("배수값: (%d) <= [%d] <= (%d)\n", MIN_MULTIPLE, multiple, MAX_MULTIPLE);
		
		System.out.printf("[ ");
		for(int num = multiple; num <= maxnum; num += multiple) {
			System.out.printf("%d ", num);
		}
		System.out.printf("]\n");
	}
	

}