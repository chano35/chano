/*
 * 반복문(while):
 * 1. break : 블럭을 탈출
 * 2. break label : 블럭을 레이블 영역까지 탈출
 * ------------------------------------------------
 * [문제] 구구단
 *  - 구구단을 출력
 *  - 처음 만나는 계산된 결과 값이 30보다 크면 전체 반복문을 탈출
 *    구구단을 종료
 */
public class WhileBreak01 {
	
	final static int MIN_MULTIPLE = 2;
	final static int MAX_MULTIPLE = 9;
	final static int BREAK_VALUE = 30; 

	public static void main(String[] args) {
		int m = MIN_MULTIPLE; // 단
		boolean stop = false; // true이면 멈춤
		
		while(m <= MAX_MULTIPLE && stop != true) {
			System.out.printf("[%d] 단\n", m);
			
			int n = 1;
			while(n <= MAX_MULTIPLE) {
				int mn = m * n;
				if(mn > BREAK_VALUE) {
					stop = true;
					break;
				}
				System.out.printf("[%d] * [%d] = [%d]\n", m, n, mn);
				n++;
			}
			
			m++;
			System.out.println("-------------------------------");
		}
		
		System.out.println("THE END");
	}

}