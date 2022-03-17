package bookshelf;

public class BooksIterator implements Iterator {
	private Books books;
	private int index;

	public BooksIterator(Books books) {
		this.books = books;
		this.index = 0;
	}
	
	@Override
	public boolean hasNext() {
		if(index < books.getLength()) {
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		Book book = books.getBookAt(index++);
		return book;
	}

}