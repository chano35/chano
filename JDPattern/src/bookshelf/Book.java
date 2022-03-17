package bookshelf;

public class Book {
	
	private String title;
	private String author;
	private String content;
	
	public Book(String title, String author, String content) {
		this.title = title;
		this.author = author;
		this.content = content;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public void printInfo() {
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("내용 : " + content);
		
	}

}
