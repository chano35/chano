/*
 * 실행 클래스
 */
package abstracts;

public class SearchFinderRun {

	public static void main(String[] args) {
		SearchFindable sf = new SearchFinderImpl();
		SearchFindable.info(sf);
		
		// 인터페이스는 객체화 할 수 없다.
		// 구현클래스가 있어야 한다.
		// SearchFindable s1 = new SearchFinable();
		
		// 추상클래스는 객체화 할 수 없다.
		// 구현클래스가 있어야 한다.
		// SearchFindable s2 = new SearchFiner();

	}

}