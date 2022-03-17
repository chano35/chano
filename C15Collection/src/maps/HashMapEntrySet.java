//[Map]
//1. 키(Key)와 값(Value)으로 구성, 딕셔너리(Dictionary)
//2. 키는 중복 불가
//3. 기존의 키와 동일한 값으로 저장하면 새로운 값으로 대치

package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEntrySet {
	
	public static void main(String ar[]) {
		Map<String, Integer>maps = new HashMap<>();
		
		maps.put("java", 20);
		maps.put("python", 15);
		maps.put("js", 25);
		
		printMap(maps);
	}
	
	static void printMap(Map<String, Integer>maps) {
		System.out.println("size : " + maps.size());
		
		Set<Map.Entry<String, Integer>> entrys = maps.entrySet();
		
		Iterator<Map.Entry<String, Integer>> es = entrys.iterator();
		
		while(es.hasNext() ) {
			Map.Entry<String, Integer> entry = es.next();
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.printf("key(%s), value(%d)\n", key, val);
		}
		
	}

}






