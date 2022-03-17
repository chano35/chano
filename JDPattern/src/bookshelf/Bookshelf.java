package bookshelf;

public class Bookshelf {
	final static int MAX_BOOKS = 100;
	private Books books;
	
	public Bookshelf() {
		this.books = new Books(MAX_BOOKS);
	}
	
	public void appendBook(String name, Book book) {
		this.books.appendBook(book);
	}
	
	public void printBook(String name) {
		System.out.printf("[%s]\n", name);
		
		Iterator it = books.iterator();
		while(it.hasNext()) {
			Book book = (Book)it.next();
			book.printInfo();
			System.out.println("-------------------------------------");
		}
	}

}