package main;
/*
 * 단정도 정수(short)
 * - 2바이트 (16비트)
 * - 범위 : -32768 ~ +32767
 */
public class ShortType {

	public static void main(String[] args) {
		short minshort = -32768;
		short maxshort = 32767;
		short abc = 12345;
		
		System.out.println("minshort : " + minshort);
		System.out.println("maxshort : " + maxshort);
		System.out.println("abc : " + abc);
		
		short maxone = (short)(maxshort + 1);
		System.out.println("maxshort + 1 : " + (short)(maxshort + 1));
		System.out.println("       maxont : " + maxone);
		
		
		
	}

}
