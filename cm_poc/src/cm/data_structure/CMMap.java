package cm.data_structure;

public interface CMMap {
	<K, V> void insert(K key, V value);
	<K,V> V get(K key);
	int size();
	boolean isEmpty();
}
