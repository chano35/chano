package main;
/*
 * ����(long) : ������ ����
 *  - 8����Ʈ (64��Ʈ)
 *   - ���� : -9,223,373,036,854,775,808 ~ 9,223,373,036,854,775,807
 *    - ���� ������ ��
 *     > int �����ȿ� ������ ���ڸ� ������ �� �ִ�.
 *     > int ������ �Ѿ�� ���� ���� l,L �� �ٿ��� �Ѵ�
 *     > �빮�� L�� �Ϲ������� ���δ�. 
 */
public class LongType {

	public static void main(String[] args) {
		long intmax = 2147483647;
		long intmaxplus = 2147483648l;
		long intmaxplus2 = 2147483648L;
		
		System.out.println("intmax : " + intmax);
		System.out.println("intmaxplus : " + intmaxplus);
		System.out.println("intmaxplus2 : " + intmaxplus2);
		
		long longval = (long)(intmax + 1);
		long longval2 = intmax + 1;
		System.out.println("longval : " + longval);
		System.out.println("longval2 : " + longval2);

		long longval3 = intmaxplus + intmaxplus2;
		System.out.println("longval3 : " + longval3);
		
	}

}
