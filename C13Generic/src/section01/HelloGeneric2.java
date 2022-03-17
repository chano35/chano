package section01;

import java.util.ArrayList;
import java.util.List;

public class HelloGeneric2 {

	/*
	 * 문자열 자료형만 저장할 수 있는 ArrayList 객체를 생성
	 * 다양한 타입으로 자료를 처리할 수 없다.
	 */
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("100");
		
		// String hello = (String)list.get(0);
		// int one = (int)list.get(1);
		
		// 타입 캐스팅이 필요 없다.
		String hello = list.get(0);
		String one = list.get(1);
		
		System.out.println("hello=" + hello);
		System.out.println("one=" + one);
	}

}