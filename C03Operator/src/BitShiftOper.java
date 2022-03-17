/*
 * 비트 이동 연산자: <<, >>, >>>
 * - 왼쪽으로 이동(<<)    : a << b, a를 b만큼 왼쪽으로 이동(빈자리 오른쪽은 0으로 채워진다)
 * - 오른쪽으로 이동(>>)  : a >> b, a를 b만큼 오른쪽으 이동(MSB가 채워진다, 부호비트가 채워진다)
 * - 오른쪽으로 이동(>>>) : a >> b, a를 b만큼 오른쪽으 이동(ZERO가 채워진다)
 * - a << b : a를 b비트 만큼 왼쪽으로 이동
 */
public class BitShiftOper {

	public static void main(String[] args) {
		byte a = 0x01; // 0x01: 0000 0001
		byte b = 0x03;
		
		// a(1)을 3비트 왼쪽으로 이동하고 오른쪽의 빈값은 0으로 채워짐
		byte ls3 = (byte)(a << b); // (0x01)0000 0001 -> (0x08)0000 1000
		System.out.printf("ls3(0x%x)(%d)(%s): a(0x%x) << b(%d)\n", ls3, ls3, Integer.toBinaryString(ls3), a, b);
				
		byte t = 0x03; // 0x03: 0011
		byte lst = (byte)(t << b); // 0x18: 0001 1000
		System.out.printf("lst(0x%x)(%d)(%s): t(0x%x) << b(%d)\n", lst, lst, Integer.toBinaryString(lst), t, b);

	}

}