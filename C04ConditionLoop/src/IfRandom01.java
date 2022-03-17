/*
 * 난수: 임의수 수를 컴퓨터가 발생
 * double x = Math.random()
 * 범위: 0.0 <= x < 1.0
 */
public class IfRandom01 {

	public static void main(String[] args) {
		double x1 = Math.random();
		double x2 = Math.random();
		double x3 = Math.random();
		double x4 = Math.random();
		double x5 = Math.random();
		
		System.out.println("x1=" + x1);
		System.out.println("x2=" + x2);
		System.out.println("x3=" + x3);
		System.out.println("x4=" + x4);
		System.out.println("x5=" + x5);
		
		// 주사위 : 1부터 6까지의 수(6가지의 경우의 수)
		double x = Math.random();
		double y = x * 6.0;
		int z = (int)y;
		int dice = z + 1;
		int last = (int)(x * 6.0) + 1; 
		System.out.printf("주사위값: x(%f), y(%f), z(%d) -> dice(%d), last(%d)\n", x, y, z, dice, last);
		
		/*
		 * 주사위값
		 * x(0.071606), y(0.429638), z(0) -> dice(1)
		 * x(0.264575), y(1.587449), z(1) -> dice(2)
		 * x(0.358479), y(2.150874), z(2) -> dice(3)
		 * x(0.512766), y(3.076596), z(3) -> dice(4)
		 * x(0.695941), y(4.175648), z(4) -> dice(5)
		 * x(0.953090), y(5.718543), z(5) -> dice(6) 
		 */
		

	}

}