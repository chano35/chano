/*
 * 기본 자료형은 레퍼 클래스를 사용해야 한다.(wrapper class)
 */
package lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInt03 {

	public static void main(String[] args) {
		List<Integer> lists = new ArrayList<>();
		
		lists.add(10); // 0번째
		lists.add(20); // 1번째
		lists.add(777); // 2번째
		lists.add(0);  // 3번째
		lists.set(3, 111); //3번째 index를 111로 바꾸기
//		lists.clear(); // lists안에 저장된 모든 객체 삭제
		lists.remove(1); // 1번째 index를 삭제 -> (20) 삭제
		
		//-------------------------------------------------------
		boolean tf = lists.contains(10); // lists 안에 10이 있는지 확인해보기
		System.out.println(tf);
		boolean empt = lists.isEmpty(); // lists 안에 내용이 비어있는지 확인해보기
		System.out.println(empt);
		int sz = lists.size();			// lists 안에 저장된 객체의 갯수 확인
		System.out.println(sz); 
		lists.remove(Integer.valueOf(777));
//		System.out.println(remov);
		
		System.out.println("------------------------------");
		
		for(int x : lists) {
			System.out.println(x);
		}
		
		
		

	}

}