package bookshelf;

public class Books implements Aggregate {
	
	private Book[] books;
	private int last;
	
	Books(int maxsize) {
		this.books = new Book[maxsize];
	}

	public Book getBookAt(int index) {
		if( index <0 || index >= this.last) {
			return null;
		}
		return this.books[index];
	}
	
	public void appendBook(Book book) {
		if(this.last < this.books.length) {
			this.books[last++] = book;
		}
	}
	
	public int getLength () {
		return this.last;
	}
	
	public Iterator iterator() {
		return new BooksIterator(this);
	}





}
