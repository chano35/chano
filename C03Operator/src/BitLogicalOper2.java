/*
 * 비트논리 연산자
 * - AND : &, 논리곱, a & b, 양쪽 모두 1이면 1, 아니면 0
 * - OR  : |, 논리합, a | b, 양쪽 모두 0이면 0, 아니면 1
 * - XOR : ^, 배타적 논리합, a ^ b, 양쪽 모두 같으면 0, 아니면 1
 * - NOT : ~, 논리부정
 * ---------------------------------------------
 * +10: 1010 -> 0101(-11)
 * +5 : 0100
 * +3 : 0011
 * +2 : 0010
 * +1 : 0001 -> 1110(-2) + 1 -> 1111(-1)
 * 0  : 0000
 * -1 : 1111
 * -2 : 1110
 * -3 : 1101
 * -4 : 1100
 * -5 : 1011
 * -6 : 1010
 * -7 : 1001
 * -8 : 1000
 * -9 : 0111
 * -10: 0110
 * -11: 0101
 * -12: 0100
 *  */
public class BitLogicalOper2 {

	public static void main(String[] args) {
		byte ten = 10; 	                 // 0000 1010
		byte tenot = (byte)~ten;         // 1111 0101(1의 보수)
		byte tenpl = (byte)(tenot + 1);  // 1111 0101 + 1 -> 1111 0110(2의 보수) : -10
		byte tenmi = (byte)(~tenpl + 1); // 0000 1001 + 1 -> 0000 1010(2의 보수) : 10
		
		System.out.printf("ten(%d) : (0x%x)\n", ten, ten);
		System.out.printf("tenot(%d) : (0x%x)\n", tenot, tenot);
		System.out.printf("tenpl(%d) : (0x%x)\n", tenpl, tenpl);
		System.out.printf("tenmi(%d) : (0x%x)\n", tenmi, tenmi);
	}

}