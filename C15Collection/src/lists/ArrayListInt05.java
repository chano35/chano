/*
 * 기본 자료형은 레퍼 클래스를 사용해야 한다.(wrapper class)
 */
package lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListInt05 {

	public static void main(String[] args) {
		List<TClass> ts = new ArrayList<>();
		
		TClass t10 = new TClass(10, "십");
		
		ts.add(t10);
		ts.add(new TClass(20, "이십"));
		ts.add(new TClass(30, "삼십"));
		ts.add(new TClass(40, "사십"));
		ts.add(new TClass(50, "오십"));
		
		Iterator<TClass> it = ts.iterator();
		while(it.hasNext()) {
			TClass t = it.next();
			System.out.printf("tid(%d), tname(%S)\n", t.tid, t.tname);
		}
		
	}

}