/*
 * 비교연산자: ==, !=, >, >=, <, <=
 * 처리결과는 boolean
 * - EQ : 같다(==)
 * - NE : 같지안다(!=)
 * - GT : 크다(>)
 * - GE : 크거나 같다(>=) 
 * - LT : 작다(<)
 * - LE : 작거나 같다(<=)
 * ----------------------------------------------------
 * 문자열 : 참조타입(class)
 * - 참조타입 : 주소를 가리킨다.
 */
public class CompareOper3 {

	public static void main(String[] args) {
		String hello1 = "hello";
		String hello2 = "hello";
		String hellox = new String("hello");
		String helloy = hellox;
		String helloz = new String("hello");
		
		// 참조되는 주소를 비교
		boolean sb1 = (hello1 == hello2); // true
		boolean sb2 = (hello1 == hellox); // false
		boolean sb3 = (hello2 == hellox); // false
		boolean sb4 = (helloy == hellox); // true
		boolean sb5 = (hello1 == helloy); // false
		boolean sb6 = (hellox == helloz); // false
		
		System.out.printf("문자열 비교: sb1(%b) = hello1(%s) == hello2(%s)\n", sb1, hello1, hello2);
		System.out.printf("문자열 비교: sb2(%b) = hello1(%s) == hellox(%s)\n", sb2, hello1, hellox);
		System.out.printf("문자열 비교: sb3(%b) = hello2(%s) == hellox(%s)\n", sb3, hello2, hellox);
		System.out.printf("문자열 비교: sb4(%b) = helloy(%s) == hellox(%s)\n", sb4, helloy, hellox);
		System.out.printf("문자열 비교: sb5(%b) = hello1(%s) == helloy(%s)\n", sb5, hello1, helloy);
		System.out.printf("문자열 비교: sb6(%b) = hellox(%s) == helloz(%s)\n", sb6, hellox, helloz);
		
		// 참조되는 주소가 가리키고 있는 위치의 값을 비교
		boolean vb1 = hello1.equals(hellox);
		boolean vb2 = hello1.equals(helloy);
		boolean vb3 = hellox.equals(helloz);
		boolean vb4 = helloz.equals(hellox);
		boolean vb5 = helloz.equals("hello");
		System.out.println("참조되는 주소가 가리키고 있는 위치의 값을 비교");
		System.out.printf("문자열 비교(값): vb1(%b) = hello1(%s) == hellox(%s)\n", vb1, hello1, hellox);
		System.out.printf("문자열 비교(값): vb2(%b) = hello1(%s) == helloy(%s)\n", vb2, hello1, helloy);
		System.out.printf("문자열 비교(값): vb3(%b) = hellox(%s) == helloz(%s)\n", vb3, hellox, helloz);
		System.out.printf("문자열 비교(값): vb4(%b) = helloz(%s) == hellox(%s)\n", vb4, helloz, hellox);
		System.out.printf("문자열 비교(값): vb5(%b) = helloz(%s) == \"hello\"\n", vb5, helloz);
	}

}