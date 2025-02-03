package Triageeee;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] tab = new int[10000];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * 100000);
        }

        long start = System.currentTimeMillis();
        System.out.println(Arrays.toString(HeapSort.sort(tab)));
        long end = System.currentTimeMillis();
        System.out.println("Sort time: " + (end - start) + "ms");
    }
}
