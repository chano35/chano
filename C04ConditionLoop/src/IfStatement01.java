/*
 * 조건문: if
 * -----------------------------
 * if(조건식) {
 *   참인 경우 실행문
 * }
 * else {
 *   거짓인 경우 실행
 * }
 * -----------------------------
 * 조건식: boolean(true/false) 참인 경우
 * - 논리연산
 * - 비교연산
 */
public class IfStatement01 {

	public static void main(String[] args) {
		if(true) {
			System.out.println("참이다.");
		}

		if(false) { // Dead code(죽은 코드), 실행되지 않는 코드
			System.out.println("거짓이다.");
		}
		
		// boolean tf = true;
		boolean tf = false;
		System.out.println(">>> tf=" + tf);
		if(tf) {
			System.out.println("tf 값은 참이다.");
		}
		else {
			System.out.println("tf 값은 거짓이다.");
		}
		
		if(tf == true) {
			System.out.println("tf 값은 참이다.");
		}
		else {
			System.out.println("tf 값은 거짓이다.");
		}
		
		tf = true;
		System.out.println(">>> tf=" + tf);
		
		if(tf != false) { // tf가 true
			System.out.println("tf 값은 참이다.");
		}
		else {
			System.out.println("tf 값은 거짓이다.");
		}

		if(!tf) { // tf가 참이 아니면(거짓이면)
			System.out.println("tf 값은 거짓이다.");
		}
		else { // tf가 참이면
			System.out.println("tf 값은 참이다.");
		}
		
		if(tf != true) { // tf가 참이 아니면(거짓이면)
			System.out.println("tf 값은 거짓이다.");
		}
		else { // tf가 참이면
			System.out.println("tf 값은 참이다.");
		}

	}

}