package Demo8.Maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleIntMap implements IntMap {
    private final List<EntryInt> entries = new ArrayList<>();
    @Override
    public void put(int key, String value) {
        if (getEntry(key) != null) {
            getEntry(key).setValue(value);
        } else {
            entries.add(new EntryInt(key, value));
        }
    }

    public Iterator iterator() {
        return new MapIterator((ArrayList<EntryInt>) entries);
    }

    @Override
    public EntryInt getEntry(int key) {
        for (EntryInt entry : entries) {
            if (entry.getKey() == key) {
                return entry;
            }
        }
        return null;
    }
    @Override
    public String get(int key) {
        EntryInt entry = getEntry(key);
        return entry != null ? entry.getValue() : null;
    }

    @Override
    public void remove(int key) {
        EntryInt entry = getEntry(key);
        if (entry != null) {
            entries.remove(entry);
        }
    }

    @Override
    public boolean containsKey(int key) {
        return getEntry(key) != null;
    }

    @Override
    public boolean containsValue(String value) {
        for (EntryInt entry : entries) {
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
    public void raiseAll() {
        Iterator it = this.iterator();
        while (it.hasNext()) {
            EntryInt entry = (EntryInt) it.next();
            entry.raiseValue();
        }
    }

    public String toString() {
        return entries.toString();
    }
}
