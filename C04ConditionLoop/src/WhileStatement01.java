/*
 * 반복문(while)
 * 
 * while(조건식) {
 * 		실행문
 * }
 * -------------------------------------------
 * - 조건식이 참이면 블럭(실행문) 계속 수행
 * - if문은 블럭이 한 번 실행되지만 while은 반복실행
 * - 조건식이 거짓이 되면 블럭을 탈출한다.
 */
public class WhileStatement01 {

	public static void main(String[] args) {
		int cnt = 0;
		boolean tf = false;
		
		while(tf) { // 거짓이면 실행되지 않는다.
			System.out.println("cnt=" + (++cnt));
		}

		System.out.println("END WHILE BLOCK 1");
		
		while(true) { // true이면 무한루프
			System.out.println("cnt=" + (++cnt));
		}
		
		// Unreachable code 
		// 위의 while문이 무한루프이기 때문에 여기는 실행되지 않는다.
		// System.out.println("END WHILE BLOCK 2");
	}

}