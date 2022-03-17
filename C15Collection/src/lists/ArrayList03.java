package lists;

import java.util.ArrayList;
import java.util.List;


public class ArrayList03 {

	public static void main(String[] args) {
		List<TestClass> ts = new ArrayList<>();
		
		ts.add(new TestClass(1, 10));
		ts.add(new TestClass(2, 20));
		ts.add(new TestClass(3, 30));
		ts.add(new TestClass(4, 40));
		ts.add(new TestClass(5, 50));
		
		/*
		 * remove()에 의해서 리스트의 크기가 변경
		int len = ts.size();
		for(int index=0; index < len; index++) {
			TestClass test = ts.get(index);
			if(test.tid == 20 || test.tid == 50) {
				ts.remove(index);
			}
			System.out.printf("(%d/%d)\n", index, ts.size());
		}
		*/
		
		int total = 0;
		
		for(int index=0; index < ts.size(); index++) {
			TestClass test = ts.get(index);
			
			// 2번째 요소가 삭제되면 뒤에 요소가 앞으로 당겨지므로
			// 다음 요소를 건너 뛰어 계산하게 된다. (누락발생)
			if(test.tid == 3) {
				TestClass rd = ts.remove(index);
				System.out.printf("removed: tid(%d), val(%d)\n", rd.tid, rd.tval);
			}
			else {  
				total += test.tval;
				System.out.printf("val(%d)\n", test.tval);
			}
			System.out.printf("(%d/%d)\n", index, ts.size());
		}
		
		System.out.printf("total(%d)\n", total);
		
		for(TestClass test : ts) {
			System.out.printf("tid(%d), val(%d)\n", test.tid, test.tval);
		}
	}

}