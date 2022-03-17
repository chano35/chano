/*
 * 연습문제
 */
public class Example {

	public static void main(String[] args) {
		float kor = 100.0f;
		float eng = 90.2f;
		float math = 80.3f;
		
		float tot = kor + eng + math;
		float avg = tot / 3.0f;
		
		System.out.printf("국어: (%6.2f)\n", kor);
		System.out.printf("영어: (%6.2f)\n", eng);
		System.out.printf("수학: (%6.2f)\n", math);
		System.out.printf("총점: (%6.2f)\n", tot);
		System.out.printf("평균: (%6.2f)\n", avg);

	}

}