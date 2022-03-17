/*
 * 배열복사 :
 *  void arraycopy(Object src,  int srcPos,
                   Object dest, int destPos,
                   int length);
 */
package array;

public class ArrayCopy2 {

	public static void main(String[] args) {
		int[] a = new int[] {1,3,5,7,9};
		int[] b = new int[5];
		int[] c = new int[5];
		
		for(int cnt=0; cnt < a.length; cnt++) {
			b[cnt] = a[cnt];

			System.out.printf("a[%d]:[%d], ", cnt, a[cnt]);
			System.out.printf("b[%d]:[%d]\n", cnt, b[cnt]);
		}

		System.out.println("배열(b)를 짝수로 변경");
		for(int cnt=0; cnt < b.length; cnt++) {
			b[cnt] += 1;

			System.out.printf("a[%d]:[%d], ", cnt, a[cnt]);
			System.out.printf("b[%d]:[%d]\n", cnt, b[cnt]);
		}
		
		System.out.println("배열(b)를 배열(c)로 복사 후 c의 값을 1씩 더함");
		System.arraycopy(b, 0, c, 0, b.length);
		for(int cnt=0; cnt < b.length; cnt++) {
			c[cnt]++;
			System.out.printf("b[%d]:[%d], ", cnt, b[cnt]);
			System.out.printf("c[%d]:[%d]\n", cnt, c[cnt]);
		}

	}

}