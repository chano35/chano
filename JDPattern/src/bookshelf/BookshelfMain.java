package bookshelf;

public class BookshelfMain {

	public static void main(String[] args) {
		Bookshelf bookshelf = new Bookshelf();
		bookshelf.appendBook("novel", new Book("태백산맥", "조정래", "해방 이후의 이념 대립과 민중의 한"));
		bookshelf.appendBook("novel", new Book("토지", "박경리", "일제강점기를 배경으로 한 소설 "));
		bookshelf.printBook("novel");
	}

}