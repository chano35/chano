/*
 * [문제1] 아래와 같은 5가지 과목의 성적을 처리하라. 
 * - 국어, 영어, 수학, 과학, 역사 과목은 0부터 100점 사이의 점수
 * - 총점과 평균을 구하라
 * - 배열을 이용하라.
 * - 평균은 실수(float)로 처리하라.
 * - 모든 과목의 점수와 총점 그리고 평균을 출력하라.
 * - 과목명을 점수와 함께 출력하라.(?)
 */
package array;

public class ArrayExample01B {
	
	final static int MAX_SUBJECTS = 5; // 총과목수
	final static int SUB_TOTAL = 5;    // 총점의 위치
	final static int SUB_AVERAGE = 6;  // 평균값의 위치

	public static void main(String[] args) {
		String[] title = { "국어", "영어", "수학", "과학", "역사", "총점", "평균" };
		float[] subjects = { 70.0f, 80.0f, 90.0f, 100.0f, 99.0f, 0.0f, 0.0f };
		
		System.out.println(">>> 성적처리 <<<");
		
		for(int cnt=0; cnt < MAX_SUBJECTS; cnt++) {
			subjects[SUB_TOTAL] += subjects[cnt]; 
			System.out.printf("[%s]: [%6.2f]\n", title[cnt], subjects[cnt]);
		}

		System.out.println("--------------------------");
		subjects[SUB_AVERAGE] = subjects[SUB_TOTAL] / MAX_SUBJECTS;
		System.out.printf("[%s]: [%6.2f]\n", title[SUB_TOTAL], subjects[SUB_TOTAL]);
		System.out.printf("[%s]: [%6.2f]\n", title[SUB_AVERAGE], subjects[SUB_AVERAGE]);
	}

}