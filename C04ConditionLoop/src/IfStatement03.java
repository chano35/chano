/*
 * 조건문: if
 * - 조건식: 정수의 크기 비교
 */
public class IfStatement03 {

	public static void main(String[] args) {
		int n = 9;
		
		if(n >= 9) {
			System.out.printf("n(%d)은 9보다 크거나 같다.\n", n);
		}
		else {
			System.out.printf("n(%d)은 9보다 작다.\n", n);
			System.out.printf("n(%d)은 9보다 크지 않다.\n", n);
		}
		
		boolean bn = (n >= 9);
		if(bn) {
			System.out.printf("n(%d)은 9보다 크거나 같다.\n", n);
		}
		else {
			System.out.printf("n(%d)은 9보다 작다.\n", n);
			System.out.printf("n(%d)은 9보다 크지 않다.\n", n);
		}

	}

}