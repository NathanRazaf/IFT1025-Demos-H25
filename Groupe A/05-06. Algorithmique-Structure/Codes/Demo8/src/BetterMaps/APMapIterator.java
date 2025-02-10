package Demo8.BetterMaps;

import java.util.ArrayList;
import java.util.Iterator;

public class APMapIterator<K, V> implements Iterator<APEntry<K, V>> {
    private final ArrayList<APEntry<K, V>> entries;
    private int index = 0;

    public APMapIterator(ArrayList<APEntry<K, V>> entries) {
        this.entries = entries;
    }

    @Override
    public boolean hasNext() {
        return index < entries.size();
    }

    @Override
    public APEntry<K, V> next() {
        return entries.get(index++);
    }
}
