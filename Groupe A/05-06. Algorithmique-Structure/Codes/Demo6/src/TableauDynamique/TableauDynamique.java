package TableauDynamique;

import IntegerList;

import java.util.Arrays;

public class TableauDynamique implements IntegerList {
    private int[] array;

    public TableauDynamique(int size) {
        this.array = new int[size];
    }

    public TableauDynamique() {
        this(0);
    }
    @Override
    public int size() {
        return array.length;
    }

    @Override
    public int get(int index) {
        return array[index];
    }

    @Override
    public void set(int index, int value) {
        array[index] = value;
    }

    @Override
    public void add(int value) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = value;
        array = newArray;
    }

    @Override
    public void add(int index, int value) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = value;
        for (int i = index; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }
        array = newArray;
    }

    @Override
    public int remove(int index) {
        int[] newArray = new int[array.length - 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        int value = array[index];
        for (int i = index; i < array.length - 1; i++) {
            newArray[i] = array[i + 1];
        }
        array = newArray;
        return value;
    }

    public void addAll(int index, int[] tab2) {
        int[] newArray = new int[array.length + tab2.length];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        for (int i = index; i < index + tab2.length; i++) {
            newArray[i] = tab2[i - index];
        }
        for (int i = index + tab2.length; i < newArray.length; i++) {
            newArray[i] = array[i - tab2.length];
        }
        array = newArray;
    }

    public String toString() {
        return Arrays.toString(array);
    }
}
