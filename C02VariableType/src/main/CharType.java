package main;
/*
 * 문자 타입(char) : character
 * - 하나의 문자 처리 단위
 * - 크기 : 2byte
 * - 범위 : 0 ~ 65535, 0x0000 ~ 0xFFFF
 * - 유니코드(unicode) 처리, ASCII(0~127), 확장 ASCII(0~255)
 * - 작은따옴표(') 양쪽을 감싼다
 */
public class CharType {

	public static void main(String[] args) {
		char chA = 'A';
		char cha = 'a';
		char han = '한';
		
		System.out.println("chA : " + chA);
		System.out.println("cha : " + cha);
		System.out.println("han : " + han);

		char chA1 = 65;
		char chA2 = 0x41;
		char chA3 = 0x0041;
		
		System.out.println("chA1 : " + chA1);
		System.out.println("chA2 : " + chA2);
		System.out.println("chA3 : " + chA3);
		
		//유니코드 : 가
		char hanuincode = '\uac00';
		System.out.println("hanuincode : " + hanuincode);
		
		// 16진수 : 가
		char hanuincode2 = 0xac00;
		System.out.println("hanuincode2 : " + hanuincode2);
		
		//10진수 : 가
		char hanuincode3 = 44032;
		System.out.println("hanuincode3 : " + hanuincode3);
		
		
	}

}
