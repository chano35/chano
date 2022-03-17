/*
 * Arrays.asList(...)
 * 1. 고정된 객체를 리스트 배열로 처리
 * 2. 리스트에 데이터를 추가할 수 없다.
 */
package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class ArrayAsList4 {

	public static void main(String[] args) {
		List<TClass> ts = Arrays.<TClass>asList(
				new TClass(10, "십"),
				new TClass(20, "이십"),
				new TClass(30, "삼십"),
				new TClass(40, "사십"),
				new TClass(50, "오십")
				);
		
		//객체를 추가할 수 없다.
		//Exception in thread "main" java.lang.UnsupportedOperationException
		//ts.add(new TClass(60, "육십"));
		//ts.remove(0);
		
		//데이터 변경 - 이 방법이 더 효율적이라고 하심
		TClass ten = ts.get(0);
		ten.tname = "열십";
		
		Iterator<TClass> it = ts.iterator();
		while(it.hasNext()) {
			TClass t = it.next();
			System.out.printf("tid(%d), tname(%S)\n", t.tid, t.tname);
		}
		
	}

}