//Arrays.asList(...)
//1. 고정된 객체를 리스트 배열로 처리
//2. 리스트에 데이터를 추가할 수 없다.

package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayAsList {
	
	public static void main (String ar[]) {
		List<TClass> ts = Arrays.asList(
				new TClass(10, "십"),
				new TClass(20, "이십"),
				new TClass(30, "삼십"),
				new TClass(40, "사십"),
				new TClass(50, "오십")
				);
		
		Iterator<TClass> it = ts.iterator();
		while(it.hasNext()) {
			TClass t = it.next();
			System.out.printf("tid(%d), tname(%s)\n", t.tid, t.tname);
		}
		
				
	}

}
