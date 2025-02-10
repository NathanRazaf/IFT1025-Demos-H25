package Demo7;

import Demo6.ListeChaînée.ListeChainee;
import Demo7.ListeChaînéeMieux.ListeChainee2;

public class Main {
    public static void main(String[] args) {
        int taille = 1000;
        ListeChainee liste1 = new ListeChainee();
        ListeChainee2 liste2 = new ListeChainee2();

        for (int i = 0; i < taille; i++) {
            liste1.add((int) (Math.random() * taille));
            liste2.add((int) (Math.random() * taille));
        }

        long debut = System.nanoTime();
        System.out.println(liste1.size());
        long fin = System.nanoTime();
        System.out.println("ListeChainee.size() : " + (fin - debut) + "ns");

        debut = System.nanoTime();
        System.out.println(liste2.size());
        fin = System.nanoTime();
        System.out.println("ListeChainee2.size() : " + (fin - debut) + "ns");
    }
}
