/*
 * 중첩(for)를 사용하여 방정식 4x + 5y = 60의 모든 해를 구해서 (x, y) 형태로 출력
 * 조건: x와 y는 10이하의 자연수
 */

public class Exercise05 {

	final static int MAX_NUMBER = 10;
	final static int XY_CORRECT = 60;
	
	public static void main(String[] args) {
		for(int x = 1; x <= MAX_NUMBER; x++) {
			for(int y = 1; y <= MAX_NUMBER; y++) {
				int z = (4 * x) + (5 * y);
				if(z == XY_CORRECT) {
					System.out.printf("(%d, %d)\n", x, y);
				}
			}
		}
	}

}