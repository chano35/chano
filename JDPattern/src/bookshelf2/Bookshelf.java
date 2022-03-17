package bookshelf2;

import java.util.ArrayList;
import java.util.List;

public class Bookshelf {
	private List<Books> shelves;
	
	public Bookshelf() {
		this.shelves = new ArrayList<Books>();
	}
	
	public void appendBook(String name, Book book) {
		for(int index = 0; index < this.shelves.size(); index++) {
			Books books = this.shelves.get(index);
			if(books.getName().equals(name)) {
				books.appendBook(book);
				return;
			}
		}
		
		this.shelves.add(new Books(name, book));
	}
	
	public void printBook(String name) {
		System.out.printf("[%s]\n", name);

		for(int index = 0; index < this.shelves.size(); index++) {
			Books books = this.shelves.get(index);
			if(books.getName().equals(name)) {
				Iterator<Book> it = books.iterator();
				while(it.hasNext()) {
					Book book = it.next();
					book.printInfo();
					System.out.println("-------------------------------------");
				}
			}
		}
	}
}