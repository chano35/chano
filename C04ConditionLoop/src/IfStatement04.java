/*
 * 조건문: if ~ else if ~ else
 * - if, else는 하나만 기술할 수 있다.
 * - else if 다중으로 기술 할 수 있다.
 * --------------------------------
 * if(조건식) {
 * 	실행문
 * }
 * else if(조건식) {
 * 	실행문
 * }
 * else if(조건식) {
 * 	실행문
 * }
 * else {
 * 	실행문
 * }
 * 
 * -----------------------------------------------------------------
 * [문제] if문 사용하여 주어진 값의 등급을 지정하라.
 * score(0부터 100까지의 임의 값)에 따라서 A등급부터 E등급까지 출력
 * A : 90점 이상
 * B : 80점 이상
 * C : 70점 이상
 * D : 60점 이상
 * E : 60점 미만
 */
public class IfStatement04 {

	public static void main(String[] args) {
		int score = 59;
		
		if(score >= 90) {
			System.out.printf("점수(%d)의 등급은 A입니다.", score);
		}
		else if(score >= 80) {
			System.out.printf("점수(%d)의 등급은 B입니다.", score);
		}
		else if(score >= 70) {
			System.out.printf("점수(%d)의 등급은 C입니다.", score);
		}
		else if(score >= 60) {
			System.out.printf("점수(%d)의 등급은 D입니다.", score);
		}
		else if(score < 60 ){
			System.out.printf("점수(%d)의 등급은 E입니다.", score);
		}
		else { // 이 처리는 실행되지 않음, 그러나 위 score < 60을 지우면 처리 됨
			System.out.printf("점수(%d)의 등급은 E입니다.", score);
		}

	}

}