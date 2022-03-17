/*
 * 추상 클래스
 */
package abstracts;

public abstract class SearchFinder implements SearchFindable {
	
	@Override
	public void find(String word) {
		System.out.printf("SearchFinder: find(%s)\n", word);
	}
	
	@Override
	public void search(String stmt) {
		System.out.printf("SearchFinder: search(%s)\n", stmt);
	}
	
	/*
	@Override
	public void lookup(String topic) {
	}
	*/
	
	/*
	 * 추상 메소드
	 */
	public abstract void lookup(String topic);
}