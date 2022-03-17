/*
 * 반복문(for)에서 continue
 * 1. continue를 만나면 실행의 위치를 반복문의 시작(조건식) 점으로 이동
 * 2. continue의 아래에 있는 실행문을 처리되지 않는다.
 * ---------------------------------
 * for(;;) {
 * 		실행문1;
 * 		실행문2;
 * 
 *		if(조건식) {
 *			continue;
 *		}
 * 
 * 		실행문3;
 * 		실행문4;
 * } 
 * 
 */
public class ForContinue01 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int num = 0; num <= 10; num++) {
			if(num % 2 == 1) { // 홀수이면 계산하지 않음
				continue; // 다시 for문으로 이동하여 증감식 -> 조건식
			}
			
			sum += num;
			System.out.printf("num(%d), sum(%d)\n", num, sum);
		}
		

	}

}