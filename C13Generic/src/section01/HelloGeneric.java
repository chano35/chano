package section01;

import java.util.ArrayList;
import java.util.List;

public class HelloGeneric {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("hello");
		list.add(100);
		
		String hello = (String)list.get(0);
		int one = (int)list.get(1);
		
		System.out.println("hello=" + hello);
		System.out.println("one=" + one);
		

	}

}