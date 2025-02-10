package Demo7.Queue;

public class ListeQueue implements Queue {
    private int[] elements;
    private int size;
    public ListeQueue() {
        this.elements = new int[10];
        this.size = 0;
    }
    @Override
    public void enqueue(int value) {
        if (this.size == this.elements.length) {
            int[] newElements = new int[this.elements.length * 2];
            for (int i = 0; i < this.size; i++) {
                newElements[i] = this.elements[i];
            }
            this.elements = newElements;
        }
        this.elements[this.size] = value;
        this.size++;
    }

    @Override
    public int dequeue() {
        int value = this.elements[0];
        for (int i = 0; i < this.size - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.size--;
        return value;
    }

    @Override
    public int peek() {
        return this.elements[0];
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    public String toString() {
        StringBuilder resultat = new StringBuilder();
        resultat.append("[");
        for (int i = 0; i < size; i++) {
            resultat.append(elements[i]);
            if (i < size - 1) {
                resultat.append(", ");
            }
        }
        resultat.append("]");
        return resultat.toString();
    }
}
