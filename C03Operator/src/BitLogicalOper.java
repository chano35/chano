/*
 * 비트논리 연산자
 * - AND : &, 논리곱, a & b, 양쪽 모두 1이면 1, 아니면 0
 * - OR  : |, 논리합, a | b, 양쪽 모두 0이면 0, 아니면 1
 * - XOR : ^, 배타적 논리합, a ^ b, 양쪽 모두 같으면 0, 아니면 1
 * - NOT : ~, 논리부정
 * -------------------------------------------------
 * 
 * (and)
 * 0f : 0000 1111
 * 0a : 0000 1010
 * ---------------
 * 0a : 0000 1010
 * (or)
 * 0f : 0000 1111
 * 0a : 0000 1010
 * ---------------
 * 0f : 0000 1111
 * (xor)
 * 0f : 0000 1111
 * 0a : 0000 1010
---------------
 * 05 : 0000 0101(5)
 * (not)
 * 0a : 0000 1010
---------------
 * f5 : 1111 0101
 * 0f : 0000 1111
 * ---------------
 * f0 : 1111 0000
 */
public class BitLogicalOper {

	public static void main(String[] args) {
		byte a = 0x0f; // 0000 1111
		byte b = 0x0a; // 0000 1010
		
		byte and = (byte)(a & b);
		byte or  = (byte)(a | b);
		byte xor = (byte)(a ^ b);
		byte nota = (byte)~a;
		byte notb = (byte)~b;
		
		System.out.printf("and  : (%d)(%x)\n", and, and);
		System.out.printf("or   : (%d)(%x)\n", or, or);
		System.out.printf("xor  : (%d)(%x)\n", xor, xor);
		System.out.printf("nota : (%d)(%x)\n", nota, nota);
		System.out.printf("notb : (%d)(%x)\n", notb, notb);

	}

}