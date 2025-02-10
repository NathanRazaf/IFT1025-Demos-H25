package Demo7.Queue;

public interface Queue {
    void enqueue(int value);
    int dequeue();
    int peek();
    boolean isEmpty();
    int size();
}
