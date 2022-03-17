package lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
	
	public static void main (String ar[]) {
		List<String> lists = new ArrayList<String>();
		
		lists.add("0. java");
		lists.add("1. javascript");
		lists.add("2. HTML");
		
		for( int index=0; index < lists.size(); index++) {
			String val = lists.get(index);
			System.out.println(val);
		}
		
	}

}
