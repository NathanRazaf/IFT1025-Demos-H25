package Triageeee;

public class SelectionSort { // Time complexity: O(n^2)
    public static int[] sort(int[] tab) {
        int n = tab.length;
        for (int i = 0; i < n - 1; i++) { // loop O(n)
            int min = i;
            for (int j = i + 1; j < n; j++) { // loop O(n), total O(n^2)
                if (tab[j] < tab[min]) {
                    min = j;
                }
            }
            int temp = tab[min];
            tab[min] = tab[i];
            tab[i] = temp;
        }
        return tab;
    }
}
