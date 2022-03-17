package bookshelf2;

public interface Aggregate<T> {
	public abstract Iterator<T> iterator();
}