/*
 * 연습문제
 */
public class Example2 {

	public static void main(String[] args) {
		short kor = 100;
		short eng = 95;
		short math = 85;
		
		short tot = (short)(kor + eng + math);
		float avg = tot / 3;
		float avx = tot / 3.0f;
		
		System.out.printf("국어: (%6d)\n", kor);
		System.out.printf("영어: (%6d)\n", eng);
		System.out.printf("수학: (%6d)\n", math);
		System.out.printf("총점: (%06d)\n", tot);
		System.out.printf("평균: (%6.2f)\n", avg);
		System.out.printf("평균: (%6.2f)\n", avx);

	}

}