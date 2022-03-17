package bookshelf3;

public interface Aggregate<T> {
	public abstract Iterator<T> iterator();
}