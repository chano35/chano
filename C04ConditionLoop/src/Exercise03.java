/*
 * [문제3] for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합
 */
public class Exercise03 {

	public static void main(String[] args) {
		int sum1 = 0;
		
		for(int cnt=1; cnt<=100; cnt++) {
			if(cnt % 3 == 0) {
				sum1 += cnt;
			}
		}

		int sum2 = 0;
		
		for(int cnt=0; cnt<=100; cnt += 3) {
			sum2 += cnt;
		}

		System.out.printf("3의 배수의 합(%d)\n", sum1);
		System.out.printf("3의 배수의 합(%d)\n", sum2);
	}

}