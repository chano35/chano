package main;
/*
 * 바이트 타입(byte type)
 * 1바이트 단위 : -128~127 값을 저장할 수 있는 공간
 */
public class ByteType {

	public static void main(String[] args) {
		byte zero = 0;
		byte minus = -128;
		byte plus = 127;
		byte abc = 123;
		byte b1, b2, b3;
		
		b1 = 11;
		b2 = zero;
		b3 = abc;
		
		System.out.println("zero:" + zero);
		System.out.println(minus);
		System.out.println(plus);
		System.out.println(abc);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
	}

}
