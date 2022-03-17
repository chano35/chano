/*
 * 배열복사 :
 *  void arraycopy(Object src,  int srcPos,
                   Object dest, int destPos,
                   int length);
 */
package array;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] a = new int[] {1,3,5,7,9};
		int[] b = new int[5];
		int[] c = new int[5];
		
		// read only
		// b.length = 10;
		System.out.println("a.length=" + a.length);
		System.out.println("b.length=" + b.length);
		
		// a, b는 같은 배열 공간을 공유하므로
		// a, b는 같아지며, 한쪽에서 값을 변경하면
		// a, b 양쪽의 값이 변경된다.
		b = a;
		for(int cnt=0; cnt < a.length; cnt++) {
			b[cnt] = a[cnt] + 1;

			System.out.printf("a[%d]:[%d], ", cnt, a[cnt]);
			System.out.printf("b[%d]:[%d], ", cnt, b[cnt]);
			System.out.printf("c[%d]:[%d]\n", cnt, c[cnt]);
		}
	}

}