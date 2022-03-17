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
public class IfStatement04b {

	public static void main(String[] args) {
		  int score = -1;
		  
	      if (score >= 90 && score <= 100) {
	         System.out.println("A");
	      }
	      else if (score >= 80 && score < 90) {
	         System.out.println("B");
	      }
	      else if (score >= 70 && score < 80) {
	         System.out.println("C");
	      }
	      else if (score >= 60 && score < 70) {
	         System.out.println("D");
	      }
	      else if (score >= 0 && score < 60) {
	         System.out.println("E");
	      }
	      else {
	         System.out.println("범위가 잘못되었습니다.");
	      }		
	}

}