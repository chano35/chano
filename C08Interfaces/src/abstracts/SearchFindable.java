/*
 * 인터페이스
 */
package abstracts;

public interface SearchFindable {
	// 상수
	public static final Content content = new Content("contents...");  
	// String content = new String("contents");  
	
	// 추상 메소드
	void find(String word);
	void search(String statement);
	void lookup(String topic);

	// 정적 메소드
	public static void info(SearchFindable sf) {
		sf.find("단어검색");
		sf.search("문장검색");
		sf.lookup("제목검색");
		System.out.println(SearchFindable.content);
	}
}