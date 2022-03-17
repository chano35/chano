/*
 * 비트 이동 연산자: <<, >>, >>>
 * - 왼쪽으로 이동(<<)    : a << b, a를 b만큼 왼쪽으로 이동(빈자리 오른쪽은 0으로 채워진다)
 * - 오른쪽으로 이동(>>)  : a >> b, a를 b만큼 오른쪽으 이동(MSB가 채워진다, 부호비트가 채워진다)
 * - 오른쪽으로 이동(>>>) : a >>> b, a를 b만큼 오른쪽으 이동(ZERO가 채워진다)
 * - a << b : a를 b비트 만큼 왼쪽으로 이동
 * - 비트 연산도 int(32bit) 단위로 처리
 */
public class BitShiftOper2 {

	public static void main(String[] args) {
		byte a = 0x01; // 0x01: 0000 0001
		byte b = 0x03;
		byte c = 0x01;
		
		// a(1)을 3비트 오른쪽으로 이동
		byte ls3 = (byte)(a >> b); // (0x01)0000 0001 -> 
		System.out.printf("ls3(0x%x)(%d)(%s): a(0x%x) >> b(%d)\n", ls3, ls3, Integer.toBinaryString(ls3), a, b);
				
		byte t = 0x03; // 0x03: 0000 0011
		byte lst = (byte)(t >> c); // 0x03: 0000 0011 -> 0001
		System.out.printf("lst(0x%x)(%d)(%s): t(0x%x) >> c(%d)\n", lst, lst, Integer.toBinaryString(lst), t, c);
		
		byte m = (byte)0x88; // 1000 1000
		byte rst = (byte)(m >> b); // 0xf1: 1111 0001
		System.out.printf("rst(0x%x)(%d)(%s): m(0x%x)(%d) >> b(%d)\n", rst, rst, Integer.toBinaryString(rst), m, m, b);
		
		byte m1 = (byte)0x88; // 1000 1000
		byte rst1 = (byte)((byte)m1 >>> b); // 0xf1: 1111 0001
		System.out.printf("rst(0x%x)(%d)(%s): m1(0x%x)(%d) >>> b(%d)\n", rst1, rst1, Integer.toBinaryString(rst1), m1, m1, b);

		int m2 = 0xffffff88;
		int rst2 = m2 >>> b;
		System.out.printf("rst2(0x%x)(%d)(%s): m2(0x%x)(%d) >>> b(%d)\n", rst2, rst2, Integer.toBinaryString(rst2), m2, m2, b);

		int eight = -8;        // 0xfffffff8;
		int result = -8 >>> 3; // 0x1fffffff
		System.out.printf("eight : (%s)(%d)\n", Integer.toBinaryString(eight), eight);
		System.out.printf("result(0x%x)(%d)(%s)\n", result, result, Integer.toBinaryString(result));
	}

}