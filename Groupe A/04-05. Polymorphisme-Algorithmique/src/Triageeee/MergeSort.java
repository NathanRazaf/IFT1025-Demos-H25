package Triageeee;

public class MergeSort { // Time complexity: O(n log n)
    public static int[] sort(int[] tab) {
        if (tab.length <= 1) {
            return tab;
        }
        int[] left = new int[tab.length / 2];
        int[] right = new int[tab.length - left.length];
        for (int i = 0; i < left.length; i++) {
            left[i] = tab[i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = tab[i + left.length];
        }
        left = sort(left);
        right = sort(right);
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            result[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            result[k] = right[j];
            j++;
            k++;
        }
        return result;
    }
}
