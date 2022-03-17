/*
 * 반복문(while)
 */
public class WhileStatement02A {

	public static void main(String[] args) {
		int cnt = 0;
		int sum = 0;
		
		while(cnt < 10) {
			cnt++;
			sum += cnt;
			System.out.printf("cnt(%d), 합계(%d)\n", cnt, sum);
		}
		
		System.out.printf("합계: %d\n", sum);
	}

}
