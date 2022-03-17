/*
 * [문제4] 1부터 100까지 수에서 홀수의 합과 짝수의 합을 각각 구하라.
 * - 각각의 홀수의 합과 짝수의 값이 맞는지 검증 : MAX_SUM(1부터 100까지의 합)
 */
public class ForExample04C {
	
	final static int MAX_NUMBER = 100; // 상수: 변하는 않는 수, 변경시킬 수 없다.
	final static int MAX_SUM = MAX_NUMBER * (MAX_NUMBER + 1) / 2; 

	public static void main(String[] args) {
		int esum = 0; // 짝수의 합
		int osum = 0; // 홀수의 합

		// 홀수의 합
		for(int num = 1; num <= 100; num += 2) { // 1,3,5,7,9, ...
			osum += num; 
		}
		
		// 짝수의 합
		for(int num = 2; num <= 100; num += 2) { // 2,4,6,8,10, ...
			esum += num; 
		}
		
		System.out.printf("1부터 %d까지의 전체의 합(공식)? %d\n", MAX_NUMBER, MAX_SUM);
		System.out.printf("1부터 %d까지의 짝수의 합? %d\n", MAX_NUMBER, esum);
		System.out.printf("1부터 %d까지의 홀수의 합? %d\n", MAX_NUMBER, osum);
		
		int checkodd = MAX_SUM - esum; // 홀수의 합
		int checkevn = MAX_SUM - osum; // 짝수의 합

		System.out.printf("홀수의 합 검증: checkodd(%d), osum(%d) : (%b)\n", 
				checkodd, osum, (checkodd == osum));
		
		System.out.printf("짝수의 합 검증: checkevn(%d), esum(%d) : (%b)\n", 
				checkevn, esum,	(checkevn == esum));
	}

}