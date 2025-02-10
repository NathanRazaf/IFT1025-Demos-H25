package Sssssearch;

public class Main {
    public static void main(String[] args) {
        int[] tab = new int[1000];
        for (int i=0; i < tab.length; i++) {
            tab[i] = (int) (Math.random()*500);
        }

        long time = System.nanoTime();
        System.out.println(naiveSearch(tab, 420));
        long time2 = System.nanoTime();
        System.out.println("Naive search time : " + (time2-time) + " ns");

        int[] tabSorted = HeapSort.sort(tab);

        long time3 = System.nanoTime();
        System.out.println(dichotomicSearch(tabSorted, 69));
        long time4 = System.nanoTime();
        System.out.println("Dichotomic search time : " + (time4-time3) + " ns");
    }

    public static int naiveSearch(int[] tab, int x) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == x) return i;
        }
        return -1;
    }

    public static int dichotomicSearch(int[] tab, int x) {
        int gauche = 0; // indice de début
        int droite = tab.length - 1; // indice de fin
        while (gauche <= droite) { // tant que la zone de recherche n'est pas vide
            int milieu = (gauche + droite) / 2; // indice du milieu
            if (tab[milieu] == x) { // trouvé
                return milieu;
            } else if (tab[milieu] < x) { // chercher à droite
                gauche = milieu + 1;
            } else {
                droite = milieu - 1; // chercher à gauche
            }
        }
        return -1;
    }

}
