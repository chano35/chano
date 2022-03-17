/*
 * Arrays.asList(...)
 * 1. 고정된 객체를 리스트 배열로 처리
 * 2. 리스트에 데이터를 추가할 수 없다.
 */
package lists;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArraysAsList03 {

	public static void main(String[] args) {
		List<TClass> ts = Arrays.<TClass>asList(
			new TClass(10, "십"),
			new TClass(20, "이십"),
			new TClass(30, "삼십"),
			new TClass(40, "사십"),
			new TClass(50, "오십"));
		
		// 객체를 추가, 삭제할 수 없다.
		// Exception in thread "main" java.lang.UnsupportedOperationException
		// ts.add(new TClass(60, "육십"));
		// ts.remove(0);
		
		// 교체 가능
		ts.set(0, new TClass(10, "열"));
		
		Iterator<TClass> it = ts.iterator();
		while(it.hasNext()) {
			TClass t = it.next();
			System.out.printf("tid(%d), tname(%s)\n", t.tid, t.tname);
		}
	}
}