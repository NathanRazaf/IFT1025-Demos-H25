package Triageeee;

public class BubbleSort { // Time complexity: O(n^2)
    public static int[] sort(int[] tab) {
        int n = tab.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    // swap temp and arr[i]
                    int temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }
        return tab;
    }
}
