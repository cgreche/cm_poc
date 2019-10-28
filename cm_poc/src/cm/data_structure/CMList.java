package cm.data_structure;

public interface CMList {
	<T> void insert(T elem);
	<T> T get(int index);
	int size();
	boolean isEmpty();
}
