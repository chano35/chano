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

public class ArrayExample01A {

	public static void main(String[] args) {
		String[] title = { "국어", "영어", "수학", "과학", "역사" };
		float[] subjects = { 70.0f, 80.0f, 90.0f, 100.0f, 99.0f };
		float total = 0.0f, avg;
		
		System.out.println(">>> 성적처리 <<<");
		
		for(int cnt=0; cnt < subjects.length; cnt++) {
			total += subjects[cnt]; 
			System.out.printf("[%s]: [%6.2f]\n", title[cnt], subjects[cnt]);
		}

		System.out.println("--------------------------");
		// avg = total / 5.0f;
		avg = total / subjects.length;
		
		System.out.printf("총점 : %.2f\n", total);
		System.out.printf("평균 : %.2f\n", avg);
	}

}