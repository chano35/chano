package lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01b {
	
	public static void main (String ar[]) {
		List<String> lists = new ArrayList<String>();
		
		lists.add("0. java");
		lists.add("1. javascript");
		lists.add("2. HTML");
		
		lists.add("2. HTML");
		
		for( String val : lists) {
			System.out.println(val);
		}
		
	}

}
