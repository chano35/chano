package array;

public class IntArray {

	public static void main(String[] args) {
		int[] odd = { 1, 3, 5, 7, 9 }; // 5개의 배열(0~4)
		int[] even = { 2, 4, 6, 8 };   // 4개의 배열(0~3)
		
		System.out.println("홀수 : " + odd.length);
		System.out.println("짝수 : " + even.length);

		System.out.printf("홀수 : [%d][%d][%d][%d][%d]\n", odd[0], odd[1], odd[2], odd[3], odd[4]);
		
		// java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
		// System.out.printf("짝수 : [%d]\n", even[4]);
		// System.out.printf("짝수 : [%d]\n", even[-1]);
		
		for(int index=0; index < 5; index++) {
			System.out.printf("index[%d] = [%d]\n", index, odd[index]);
		}

		for(int index=0; index < odd.length; index++) {
			System.out.printf("index[%d] = [%d]\n", index, odd[index]);
		}
	}

}