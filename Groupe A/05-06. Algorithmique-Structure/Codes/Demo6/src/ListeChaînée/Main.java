package ListeChaînée;

import IntegerList;

public class Main {
    public static int step = 1;
    public static void main(String[] args) {
        ListeChainee liste = new ListeChainee();

        for (int i = 1; i <= 4; i++) {
            liste.add(i);
        }

        test(liste);
    }

    private static void print(IntegerList liste) {
        System.out.println(step++ + ". " + liste);
    }

    public static void test(IntegerList liste) {
        System.out.println("Liste initiale : " + liste);
        liste.add(19);
        print(liste);
        liste.remove(2);
        print(liste);
        liste.add(1, 100);
        print(liste);
        liste.add(45);
        print(liste);
        liste.set(0, 200);
        print(liste);
        liste.set(3, 300);
        print(liste);
    }
}
