/*
 * 삼항연산자:
 * 변수 = (조건식) ? 참의 식 : 거짓 식
 * 1. 조건식이 참이면 참의 식의 결과 값이 변수에 대입
 * 2. 조건식이 거짓이면 지짓의 식의 결과 값이 변수에 대입
 * -----------------------------------------------------------------
 * [문제] 삼항 연산자를 사용하여 주어진 값의 등급을 지정하라.
 * score(0부터 100까지의 임의 값)에 따라서 A등급부터 F등급까지 출력
 * A : 90점 이상
 * B : 80점 이상
 * C : 70점 이상
 * D : 60점 이상
 * E : 60점 미만
 */
public class ThreeOper2 {

	public static void main(String[] args) {
		// int score = 100;
		// int score = 80;
		// int score = 78;
		// int score = 65;
		// int score = 59;
		int score = 99;
		char grade;
		
		grade = (score < 60) ? 'E' : 
				(score < 70) ? 'D' :
				(score < 80) ? 'C' :
				(score < 90) ? 'B' : 'A'; 
		
		char grade2 = (score >= 90) ? 'A' : 
					  (score >= 80) ? 'B' : 
					  (score >= 70) ? 'C' : 
					  (score >= 60) ? 'D' :	'E';
		
		System.out.printf("score(%d), grade(%c)\n", score, grade);
		System.out.printf("score(%d), grade2(%c)\n", score, grade2);
		
	}

}