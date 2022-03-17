/*
 * 반복문(while)
 */
public class WhileStatement02B {

	public static void main(String[] args) {
		int cnt = 1;
		int sum = 0;
		
		while(cnt <= 10) {
			sum += cnt;
			System.out.printf("cnt(%d), 합계(%d)\n", cnt, sum);
			cnt++;
		}
		
		System.out.printf("합계: %d\n", sum);
	}

}