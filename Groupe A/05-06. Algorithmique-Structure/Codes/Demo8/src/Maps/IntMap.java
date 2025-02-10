package Demo8.Maps;

public interface IntMap {
    void put(int key, String value);
    String get(int key);
    EntryInt getEntry(int key);
    void remove(int key);
    boolean containsKey(int key);
    boolean containsValue(String value);
    int size();
    boolean isEmpty();
    void clear();
    void raiseAll();
}
