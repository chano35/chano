package bookshelf2;

public class BookshelfMain {

	public static void main(String[] args) {
		Bookshelf bookshelf = new Bookshelf();
		bookshelf.appendBook("novel", new Book("태백산맥", "조정래", "해방 이후의 이념 대립과 민중의 한"));
		bookshelf.appendBook("novel", new Book("토지", "박경리", "일제강점기를 배경으로 한 소설 "));
		bookshelf.appendBook("essay", new Book("정의란 무엇인가?", "마이클 샌델", "정의를 판단하는 세가지 기준-행복, 자유, 미덕"));
		bookshelf.printBook("novel");
		bookshelf.printBook("essay");
	}

}