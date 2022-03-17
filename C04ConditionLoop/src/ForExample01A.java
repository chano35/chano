/*
 * n은 1부터 10까지 1씩 증가하는 수이다.
 * n의 총합을 구하라. 
 */
public class ForExample01A {

	public static void main(String[] args) {
		double dsum = 0.0;
		
		for(int n=1, sum=0; n <= 10; n++) {
			sum += n;
			dsum += n;
			System.out.printf("n(%d), sum(%d)\n", n, sum);
		}
		
		System.out.println("총합은? " + dsum);
	}

}