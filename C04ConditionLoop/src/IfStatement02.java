/*
 * ���ǹ� : if
 * �߰�ȣ({})�� ������ ������ �ٷ� �Ʒ��� ������ �ϳ��� ���常 ����
 */
public class IfStatement02 {

	public static void main(String[] args) {
		boolean t = true;
		boolean f = false;

		if(t != f) // �Ʒ� ���� �ϳ��� ����
			System.out.printf("IF1: t(%b), f(%b)\n", t, f);

		if(t != f) { // ���� if���� ����
			System.out.printf("IF2: t(%b), f(%b)\n", t, f);
		}

		if(t != f) {
			System.out.printf("IF3: t(%b), f(%b)\n", t, f);
			System.out.printf("IF3: ���� ���� ���� ���� �ʴ�.\n");
		}

		/*
		if(t > f) {
			System.out.printf("boolean �ڷ����� ũ�� �񱳰� �ȵȴ�.\n");
		}
		*/
		
		/*
		 * boolean�� �ٸ� �ڷ������� ĳ���� �� �� ����.
		 * int tnum = (int)t;
		 * int fnum = (int)f;
		*/
	
		int tnum = (t) ? 1 : 0;
		int fnum = (f) ? 1 : 0;
		if(tnum == fnum) { // ������ �� ������ ��, �ٸ��� ����
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
		
		System.out.printf("����");
	}

}