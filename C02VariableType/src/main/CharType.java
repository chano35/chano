package main;
/*
 * ���� Ÿ��(char) : character
 * - �ϳ��� ���� ó�� ����
 * - ũ�� : 2byte
 * - ���� : 0 ~ 65535, 0x0000 ~ 0xFFFF
 * - �����ڵ�(unicode) ó��, ASCII(0~127), Ȯ�� ASCII(0~255)
 * - ��������ǥ(') ������ ���Ѵ�
 */
public class CharType {

	public static void main(String[] args) {
		char chA = 'A';
		char cha = 'a';
		char han = '��';
		
		System.out.println("chA : " + chA);
		System.out.println("cha : " + cha);
		System.out.println("han : " + han);

		char chA1 = 65;
		char chA2 = 0x41;
		char chA3 = 0x0041;
		
		System.out.println("chA1 : " + chA1);
		System.out.println("chA2 : " + chA2);
		System.out.println("chA3 : " + chA3);
		
		//�����ڵ� : ��
		char hanuincode = '\uac00';
		System.out.println("hanuincode : " + hanuincode);
		
		// 16���� : ��
		char hanuincode2 = 0xac00;
		System.out.println("hanuincode2 : " + hanuincode2);
		
		//10���� : ��
		char hanuincode3 = 44032;
		System.out.println("hanuincode3 : " + hanuincode3);
		
		
	}

}
