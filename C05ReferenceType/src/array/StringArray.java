/*
 * 배열 : 문자열
 */
package array;

public class StringArray {

	public static void main(String[] args) {
		String[] s1 = {"홍길동", "이순신", "강감찬", "권율"};
		
		System.out.println("s1.length: " + s1.length);
		
		for(int cnt=0; cnt < s1.length; cnt++) {
			System.out.printf("[%d][%s]\n", cnt, s1[cnt]);
		}
		
		for(String str : s1) {
			System.out.printf("[%s]\n", str);
		}

		// 배열(s1)에 있는 요소를 맨 끝부터 꺼내서 출력
		System.out.println("s1.length: " + s1.length);

		System.out.printf("배열(s1)에 있는 요소를 맨 끝부터 꺼내서 출력\n");
		System.out.printf("[%d][%s]\n", 3, s1[s1.length - 1]);
		System.out.printf("[%d][%s]\n", 2, s1[s1.length - 2]);
		System.out.printf("[%d][%s]\n", 1, s1[s1.length - 3]);
		System.out.printf("[%d][%s]\n", 0, s1[s1.length - 4]);
		
		System.out.printf("배열(s1)에 있는 요소를 맨 끝부터 꺼내서 출력(for문 사용)\n");
		for(int cnt=s1.length - 1; cnt >= 0; cnt--) { // 내림차순: 3, 2, 1, 0
			System.out.printf("[%d][%s]\n", cnt, s1[cnt]);
		}
	}

}
