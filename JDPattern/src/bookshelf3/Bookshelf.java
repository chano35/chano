package bookshelf3;

import java.util.HashMap;
import java.util.Map;

public class Bookshelf {
	private Map<String, Books> shelves;

	public Bookshelf() {
		this.shelves = new HashMap<String, Books>();
	}

	public void appendBook(String name, Book book) {
		Books books = this.shelves.get(name);
		if (books != null) {
			books.appendBook(book);
			return;
		}

		this.shelves.put(name, new Books(name, book));
	}

	public void printBook(String name) {
		System.out.printf("[%s]\n", name);

		Books books = this.shelves.get(name);
		if (books != null) {
			Iterator<Book> it = books.iterator();
			while (it.hasNext()) {
				Book book = it.next();
				book.printInfo();
				System.out.println("-------------------------------------");
			}
		}
	}
}