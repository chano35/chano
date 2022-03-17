/*
 * 반복문(for)를 이용하여 아스터리스크(*) 삼각형 출력
 */

public class Exercise06 {

	public static void main(String[] args) {
		for(int x = 1; x <= 5; x++) {
			for(int y = 0; y < x; y++) { // y= [0], [0, 1], [0,1,2], [0,1,2,3] [0,1,2,3,4]
				System.out.print("*");
			}
			System.out.println();
		}
	}

}