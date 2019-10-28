package data;

public interface CMList {
	<T> T get(int index);
	int size();
	boolean isEmpty();
}
