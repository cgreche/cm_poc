package data;

public interface CMMap {
	<K,V> V get(K key);
	int size();
	boolean isEmpty();
}
