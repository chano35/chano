/*
 * 구현 클래스
 */
package abstracts;

public class SearchFinderImpl extends SearchFinder {
	
	@Override
	public void lookup(String topic) {
		System.out.printf("SearchFinder: lookup(%s)\n", topic);
	}

}