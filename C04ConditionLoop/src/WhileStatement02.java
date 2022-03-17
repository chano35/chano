/*
 * 반복문(while)
 */
public class WhileStatement02 {

	public static void main(String[] args) {
		int cnt = 0;
		int sum = 0;
		
		while(++cnt <= 10) { // cnt가 10보다 작거나 같은 때까지 반복 실행
			sum += cnt;
			System.out.printf("cnt(%d), 합계(%d)\n", cnt, sum);
		}
		
		System.out.printf("합계: %d\n", sum);
	}

}