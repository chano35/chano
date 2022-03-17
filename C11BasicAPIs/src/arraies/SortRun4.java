/*
 * 정렬(Sort)
 * 1. 오름차순(ascending): 작은 값에서 큰 값으로 정렬(기본), 1,2,3,4, .... 
 * 2. 내림차순(descending): 큰 값에서 작은 값으로 정렬, 10, 9, 8, 7, 6, ...
 * ----------------------------------------------------------------
 * Arrays.sort(배열)
 * - 기존의 선언된 배열 변수의 내용의 위치를 변경
 * - 기본적으로 오름차순으로 정렬
 * - 배열의 크기의 변화는 없다.
 * - 배열의 위치가 오름차순으로 변경된다.
 */
package arraies;

import java.util.Arrays;
import java.util.Collections;

public class SortRun4 {

	public static void main(String[] args) {
		int[] scores = { 3, 2, 5, 6, 7, 8, 1, 0, 88, 34, 23 };
		
		System.out.println("[내림차순]");
		
		Integer[] descscores = Arrays.stream(scores).boxed().toArray(Integer[]::new);
		Arrays.sort(descscores, Collections.reverseOrder());
	
		print(descscores);
	}

  public static void print(Object[] a) {
	  String str = "null";
	  
      if (a == null) {
    	  str = "null";
      }
      else {
    	  int iMax = a.length - 1;
    	  if (iMax == -1) {
    		  str = "[]";
    	  }
    	  else {
	    	  StringBuilder b = new StringBuilder();
	    	  b.append('[');
	    	  for (int i = 0; ; i++) {
	    		  b.append(a[i]);
	    		  if (i == iMax) {
	    			  b.append(']');
	    			  str = b.toString();
	    			  break;
	    		  }
	    		  b.append(", ");
	    	  }
    	  }
      }
        
      System.out.println(str);
    }	
}