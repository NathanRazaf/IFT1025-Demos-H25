package Triageeee;

public class CountingSort { // Time complexity: O(n+k), where k is the known maximum value of the input array
    public static int[] sort(int[] tab, int max) {
        int[] count = new int[max + 1];
        int[] result = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            count[tab[i]]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        for (int i = tab.length - 1; i >= 0; i--) {
            result[count[tab[i]] - 1] = tab[i];
            count[tab[i]]--;
        }
        return result;
    }
}
