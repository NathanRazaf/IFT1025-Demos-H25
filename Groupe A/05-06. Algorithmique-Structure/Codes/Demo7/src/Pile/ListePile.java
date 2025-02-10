package Demo7.Pile;

public class ListePile implements Pile {
    private int size;
    private int[] elements;

    public ListePile() {
        size = 0;
        elements = new int[10];
    }

    @Override
    public void push(int value) {
        if (size == elements.length) {
            int[] newElements = new int[elements.length * 2];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
        elements[size++] = value;
    }

    @Override
    public int pop() {
        return elements[--size];
    }

    @Override
    public int peek() {
        return elements[size - 1];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
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
