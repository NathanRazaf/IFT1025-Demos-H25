package Demo8.BetterMaps;

public interface APEntry<K, V> {
    K getKey();
    V getValue();
    void setValue(V value);
}
