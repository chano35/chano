/*
 * 반복문(while)
 * - break : 루프 블럭을 탈출
 */
public class WhileStatement02C {

	public static void main(String[] args) {
		int cnt = 0;
		int sum = 0;
		
		while(true) { // 무한루프, break를 통해서 루프를 탈출
			if(cnt >= 10) {
				break;
			}
			cnt++;
			sum += cnt;
			System.out.printf("cnt(%d), 합계(%d)\n", cnt, sum);
		}
		
		System.out.printf("합계: %d\n", sum);
	}

}