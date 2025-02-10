package Demo8.BetterMaps;

public interface APMap<K, V> {
    void put(K key, V value);
    V get(K key);
    APEntry<K, V> getEntry(K key);
    void remove(K key);
    boolean containsKey(K key);
    boolean containsValue(V value);
    int size();
    boolean isEmpty();
    void clear();
}
