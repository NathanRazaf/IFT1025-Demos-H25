package Complexité;

public class Truc {
    public static void main(String[] args) {
        int[] tab = new int[1000];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * 500);
        }

        System.out.println("Taille du tableau : " + tab.length + "\n");
        truc(tab);
    }

    public static int[] truc(int[] tab) {
        int nombreOperations = 0;
        for (int i = 0; i < tab.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[j] < tab[min]) {
                    min = j;
                }
                nombreOperations++;
            }
            if (min != i) {
                int temp = tab[i];
                tab[i] = tab[min];
                tab[min] = temp;
            }
        }
        System.out.println("Nombre d'opérations : " + nombreOperations);
        return tab;
    }
}
