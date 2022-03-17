package section01;

import java.util.ArrayList;
import java.util.List;

public class HelloGeneric3 {

	/*
	 * 문자열 자료형만 저장할 수 있는 ArrayList 객체를 생성
	 * 다양한 타입으로 자료를 처리할 수 없다.
	 */
	public static void main(String[] args) {
		// 기본 자료형은 제니릭으로 사용할 수 없다.
		// List<int> list = new ArrayList<int>();
		
		// 참조형만 가능
		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		
		int x1 = list.get(0);
		int x2 = list.get(1);
		
		System.out.println("x1=" + x1);
		System.out.println("x2=" + x2);
		

	}

}