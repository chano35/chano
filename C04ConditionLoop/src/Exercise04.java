/*
 * while문과 Math.random()을 이용하여 두 개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고,
 * 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈춤
 */
public class Exercise04 {

	public static void main(String[] args) {
		int cnt = 0;
		
		while(true) {
			int x = (int)(Math.random() * 6) + 1;  // 눈1
			int y = (int)(Math.random() * 6) + 1;  // 눈2
			
			if((x + y) == 5) {
				System.out.printf("cnt[%d] (%d, %d) -> (%d) STOP!!!\n", ++cnt, x, y, x + y);
				break;
			}
			System.out.printf("cnt[%d] (%d, %d)\n", ++cnt, x, y);
		}
	}

}