/*
 * 반복문(for)를 이용한 구구단
 */
public class ForExample02 {

	public static void main(String[] args) {
		for(int x = 2; x < 10; x++) { // x(단): 2,3,4,5,6,7,8,9
			System.out.printf("[%d]단\n", x);
			
			for(int y = 1; y < 10; y++) { // y: 1~9
				System.out.printf("[%d] X [%d] = [%d]\n", x, y, x * y);
			}
			System.out.printf("-------------------------------\n");
		}

	}

}