package Demo8.Maps;

import java.util.ArrayList;
import java.util.Iterator;

public class MapIterator implements Iterator<EntryInt> {
    private final ArrayList<EntryInt> entries;
    private int index = 0;

    public MapIterator(ArrayList<EntryInt> entries) {
        this.entries = entries;
    }

    @Override
    public boolean hasNext() {
        return index < entries.size();
    }

    @Override
    public EntryInt next() {
        return entries.get(index++);
    }
}
