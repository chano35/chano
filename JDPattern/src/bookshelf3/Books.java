package bookshelf3;

import java.util.ArrayList;
import java.util.List;

public class Books implements Aggregate<Book> {
	private String name;
	private List<Book> books = new ArrayList<Book>();
	
	Books(String name) {
		this.name = name;
	}

	Books(String name, Book book) {
		this.name = name;
		this.books.add(book);
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Book getBookAt(int index) {
		if(index < 0 || index >= this.books.size()) {
			return null;
		}
		return this.books.get(index);
	}
	
	public void appendBook(Book book) {
		books.add(book);
	}
	
	public int getLength() {
		return this.books.size();
	}
	
	public Iterator<Book> iterator() {
		return new BooksIterator(this);
	}
}