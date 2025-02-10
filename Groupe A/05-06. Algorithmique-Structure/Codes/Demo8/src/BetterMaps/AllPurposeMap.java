package Demo8.BetterMaps;

import java.util.ArrayList;
import java.util.List;

public class AllPurposeMap<K, V> implements APMap<K, V> {
    private final List<APEntry<K, V>> entries = new ArrayList<>();
    @Override
    public void put(K key, V value) {
        if (getEntry(key) != null) {
            getEntry(key).setValue(value);
        } else {
            entries.add(new AllPurposeEntry<>(key, value));
        }
    }

    @Override
    public V get(K key) {
        APEntry<K, V> entry = getEntry(key);
        return entry != null ? entry.getValue() : null;
    }

    @Override
    public APEntry<K, V> getEntry(K key) {
        for (APEntry<K, V> entry : entries) {
            if (entry.getKey().equals(key)) {
                return entry;
            }
        }
        return null;
    }

    @Override
    public void remove(K key) {
        APEntry<K, V> entry = getEntry(key);
        if (entry != null) {
            entries.remove(entry);
        }
    }

    @Override
    public boolean containsKey(K key) {
        return getEntry(key) != null;
    }

    @Override
    public boolean containsValue(V value) {
        for (APEntry<K, V> entry : entries) {
            if (entry.getValue().equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return entries.size();
    }

    @Override
    public boolean isEmpty() {
        return entries.isEmpty();
    }

    @Override
    public void clear() {
        entries.clear();
    }

    public APMapIterator<K, V> iterator() {
        return new APMapIterator<>((ArrayList<APEntry<K,V>>) entries);
    }
}
