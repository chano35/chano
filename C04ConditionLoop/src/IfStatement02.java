/*
 * 조건문 : if
 * 중괄호({})로 감싸지 않으면 바로 아래에 나오는 하나의 문장만 실행
 */
public class IfStatement02 {

	public static void main(String[] args) {
		boolean t = true;
		boolean f = false;

		if(t != f) // 아래 문자 하나만 실행
			System.out.printf("IF1: t(%b), f(%b)\n", t, f);

		if(t != f) { // 위의 if문과 동일
			System.out.printf("IF2: t(%b), f(%b)\n", t, f);
		}

		if(t != f) {
			System.out.printf("IF3: t(%b), f(%b)\n", t, f);
			System.out.printf("IF3: 위의 값은 서로 같지 않다.\n");
		}

		/*
		if(t > f) {
			System.out.printf("boolean 자료형은 크기 비교가 안된다.\n");
		}
		*/
		
		/*
		 * boolean은 다른 자료형으로 캐스팅 할 수 없다.
		 * int tnum = (int)t;
		 * int fnum = (int)f;
		*/
	
		int tnum = (t) ? 1 : 0;
		int fnum = (f) ? 1 : 0;
		if(tnum == fnum) { // 정수를 비교 같으면 참, 다르면 거짓
			System.out.printf("IF4: tnum(%d) == fnum(%d)\n", tnum, fnum);
		}
		else {
			System.out.printf("IF4: tnum(%d) != fnum(%d)\n", tnum, fnum);
		}
		
		boolean btf = (tnum == fnum);
		if(btf) {
			System.out.printf("IF5: tnum(%d) == fnum(%d) : btf(%b)\n", tnum, fnum, btf);
		}
		else {
			System.out.printf("IF5: tnum(%d) != fnum(%d) : btf(%b)\n", tnum, fnum, btf);
		}
		
		System.out.printf("종료");
	}

}