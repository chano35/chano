package lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList04 {

	public static void main(String[] args) {
		List<XClass> ts = new ArrayList<>();
		
		XClass t10 = new XClass(10, "십");
		
		ts.add(t10);
		ts.add(new XClass(20, "이십"));
		ts.add(new XClass(30, "삼십"));
		ts.add(new XClass(40, "사십"));
		ts.add(new XClass(50, "오십"));

		System.out.printf("[원본 데이터] 총갯수: %d\n", ts.size());

		for(int index=0; index < ts.size(); index++) {
			XClass test = ts.get(index);
			System.out.printf("tid(%d), tname(%s)\n", test.tid, test.tname);

			if(t10 == test) {
				// 저장된 객체와 값을 같지만 다른 객체이므로 삭제되지 않는다.
				// boolean br = ts.remove(new XClass(10, "십"));

				// 아래와 같이 2가지 중 하나를 사용해서 지워야 한다.
				// 리턴값을 리스트에서 객체를 지웠는지 유무
				// boolean br = ts.remove(t10);
				boolean br = ts.remove(test);
				System.out.printf("> remove: tid(%d), tname(%s), result(%b)\n", test.tid, test.tname, br);
			}
			System.out.printf("(%d/%d)\n", index, ts.size());
		}
		
		System.out.printf("?> removed: tid(%d), tname(%s)\n", t10.tid, t10.tname);
		
		System.out.println("[남은 데이터] after remove");
		for(XClass test : ts) {
			System.out.printf("tid(%d), tname(%s)\n", test.tid, test.tname);
		}
		
		ts.clear();
		
		System.out.println("[남은 데이터] after clear");
		for(XClass test : ts) {
			System.out.printf("tid(%d), tname(%s)\n", test.tid, test.tname);
		}
	}

}