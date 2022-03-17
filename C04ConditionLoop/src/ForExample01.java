/*
 * n은 1부터 10까지 1씩 증가하는 수이다.
 * n의 총합을 구하라. 
 */
public class ForExample01 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int n=1; n <= 10; n++) {
			sum += n;
			// sum = sum + n;
		}
		
		System.out.println("총합은? " + sum);
	}

}