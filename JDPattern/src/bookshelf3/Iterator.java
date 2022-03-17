package bookshelf3;

public interface Iterator<T> {
	public abstract boolean hasNext();
	public abstract T next();
}