/*
 * 기본 자료형은 레퍼 클래스를 사용해야 한다.(wrapper class)
 */
package lists;

import java.util.ArrayList;
import java.util.List;


public class ArrayListInt03b {

	public static void main(String[] args) {
		List<TestClass> ts = new ArrayList<>();
		
//		ts.add(t10);
		ts.add(new TestClass(1, 10));
		ts.add(new TestClass(2, 20));
		ts.add(new TestClass(3, 30));
		ts.add(new TestClass(4, 40));
		ts.add(new TestClass(5, 50));
		
		
		int total = 0;
		for(int index=0; index < ts.size(); index++) {
			TestClass test = ts.get(index);
			
			// 2번째 요소가 삭제되면 뒤에 있는 요소가 앞으로 당겨지게되므로 
			// 다음 요소를 건너뛰어 계산하게 된다. (누락발생)
			
			
			if(test.tid==3) {
				TestClass rd = ts.remove(index);
				System.out.printf("removed: tid(%d), val(%d)\n", rd.tid, rd.tval);
			}
			else { 
				total += test.tval;
				System.out.printf("val(%d)\n", test.tval);
			}
			System.out.printf("(%d / %d)\n", index, ts.size());
			
		}
		System.out.printf("total(%d)\n", total);
		
		for(TestClass test : ts) {
			System.out.printf("tid(%d), tname(%s)\n", test.tid, test.tval);
		}

	}

}