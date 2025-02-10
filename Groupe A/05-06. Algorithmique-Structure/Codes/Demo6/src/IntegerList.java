public interface IntegerList {
    public int size();
    public int get(int index);
    public void set(int index, int value);
    public void add(int value);
    public void add(int index, int value);
    public int remove(int index);
}
