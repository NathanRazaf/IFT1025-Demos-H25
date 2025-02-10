package Demo8.BetterMaps;

public class AllPurposeEntry<K, V> implements APEntry<K, V> {
    private final K key;
    private V value;

    public AllPurposeEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public void setValue(V value) {
        this.value = value;
    }

    public String toString() {
        return "(" + key + "=" + value + ")";
    }
}
