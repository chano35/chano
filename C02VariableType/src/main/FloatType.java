package main;
/*
 * �Ǽ���(float)
 * 4����Ʈ : ��ȣ(1bit) + ����(8bit) + ����(23bit) = 32bit
 * ���� : 1.4E-45 ~ 3.4028235E38
 * �ִ� �Ҽ��� 8�ڸ�����(0.12345678F)
 */
public class FloatType {

	public static void main(String[] args) {
		float pi = 3.141592f;
		float PI = 3.141592F;
		
		System.out.println("pi : " + pi);
		System.out.println("PI : " + PI);
		
		float f8 = 0.12345678f;
		float f9 = 0.123456789f;
		float f9a = 0.123456784f;
		float f9b = 0.123456785f;
		float f9c = 0.123456786f;
		
		System.out.println(" f8 : " +f8);
		System.out.println(" f9 : " +f9);
		System.out.println(" f9a : " +f9a);
		System.out.println(" f9b : " +f9b);
		System.out.println(" f9c : " +f9c);
		
		
		
		

	}

}
