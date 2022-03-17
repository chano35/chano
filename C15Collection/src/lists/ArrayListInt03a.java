/*
 * 기본 자료형은 레퍼 클래스를 사용해야 한다.(wrapper class)
 */
package lists;

import java.util.ArrayList;
import java.util.List;


public class ArrayListInt03a {

	public static void main(String[] args) {
		List<XClass> ts = new ArrayList<>();
		
		XClass t10 = new XClass(10, "십");
		
		ts.add(t10);
//		ts.add(new XClass(10, "십"));
		ts.add(new XClass(20, "이십"));
		ts.add(new XClass(30, "삼십"));
		ts.add(new XClass(40, "사십"));
		ts.add(new XClass(50, "오십"));
		
		
		
		for(int index=0; index < ts.size(); index++) {
			XClass test = ts.get(index);
			System.out.printf("tid(%d), tname(%s)\n", test.tid, test.tname);
			
			if(t10 == test) {
				boolean br = ts.remove(t10);
				System.out.printf(" > remove : tid(%d), tname(%s), result(%b)\n", test.tid, test.tname, br);
			}
			
			
			if(test.tid==20 || test.tname == "오십") {
				ts.remove(index);
			}
			System.out.printf("ts.index : %d / ts.size : %d\n", index, ts.size());
			
		}
		for(XClass test : ts) {
			System.out.printf("tid(%d), tname(%s)\n", test.tid, test.tname);
		}
		
		
		

	}

}