/*
 * 배열복사 :
 *  void arraycopy(Object src,  int srcPos,
                   Object dest, int destPos,
                   int length);
 */
package array;

public class ArrayCopy3 {

	public static void main(String[] args) {
		int[] a = new int[] {1,3,5,7,9};
		int[] b = new int[5];
		int[] c = new int[5];
		
		for(int cola : a) {
			System.out.printf("a[%d], ", cola);
		}
		
		System.out.println();

		System.out.println("배열(a)를 배열(c)로 복사");
		System.arraycopy(a, 0, c, 0, a.length);
		for(int colc : c) {
			System.out.printf("c[%d], ", colc);
		}
		System.out.println();
	}

}