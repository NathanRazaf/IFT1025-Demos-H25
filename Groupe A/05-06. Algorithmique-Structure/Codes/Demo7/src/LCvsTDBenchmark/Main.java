package Demo7.LCvsTDBenchmark;

import Demo6.ListeChaînée.ListeChainee;
import Demo6.TableauDynamique.TableauDynamique;
import Demo7.ListeChaînéeMieux.ListeChainee2;

public class Main {
    public static void main(String[] args) {
        int cache;
        int taille = 1000;
        ListeChainee2 listeChainee = new ListeChainee2();
        TableauDynamique tableauDynamique = new TableauDynamique();


        // add(x) is O(n) for TableauDynamique, ListeChainee and ListeChainee2
        System.out.println("Benchmarking add(x)...");
        long debut = System.nanoTime();
        for (int i = 0; i < taille; i++) {
            listeChainee.add((int) (Math.random() * taille));
        }
        long fin = System.nanoTime();
        System.out.println("ListeChainee.add(x) : " + (fin - debut) + "ns" + " (" + taille + " elements)");

        debut = System.nanoTime();
        for (int i = 0; i < taille; i++) {
            tableauDynamique.add((int) (Math.random() * taille));
        }
        fin = System.nanoTime();
        System.out.println("TableauDynamique.add(x) : " + (fin - debut) + "ns" + " (" + taille + " elements)");
        System.out.println();
        //


        // remove(index) is O(index) for ListeChainee and ListeChainee2, O(n) for TableauDynamique
        System.out.println("Benchmarking remove(1)...");
        debut = System.nanoTime();
        for (int i = 0; i < taille/2; i++) {
            listeChainee.remove(1);
        }
        fin = System.nanoTime();
        System.out.println("ListeChainee.remove(1) : " + (fin - debut) + "ns" + " (" + taille/2 + " elements)");

        debut = System.nanoTime();
        for (int i = 0; i < taille/2; i++) {
            tableauDynamique.remove(1);
        }
        fin = System.nanoTime();
        System.out.println("TableauDynamique.remove(1) : " + (fin - debut) + "ns" + " (" + taille/2 + " elements)");
        System.out.println();
        //
        taille = tableauDynamique.size();


        // add(index, x) is O(n) for TableauDynamique, O(index) for ListeChainee and ListeChainee2
        System.out.println("Benchmarking add(1, x)...");
        debut = System.nanoTime();
        for (int i = 0; i < taille; i++) {
            listeChainee.add(1, (int) (Math.random() * taille));
        }
        fin = System.nanoTime();
        System.out.println("ListeChainee.add(1, x) : " + (fin - debut) + "ns" + " (" + taille + " elements)");

        debut = System.nanoTime();
        for (int i = 0; i < taille; i++) {
            tableauDynamique.add(1, (int) (Math.random() * taille));
        }
        fin = System.nanoTime();
        System.out.println("TableauDynamique.add(1, x) : " + (fin - debut) + "ns" + " (" + taille + " elements)");
        System.out.println();
        //


        // get(x) is O(n) for ListeChainee and ListeChainee2, O(1) for TableauDynamique
        System.out.println("Benchmarking get()...");
        debut = System.nanoTime();
        for (int i = 0; i < taille; i++) {
            cache = listeChainee.get(i);
        }
        fin = System.nanoTime();
        System.out.println("ListeChainee.get() : " + (fin - debut) + "ns" + " (" + taille + " elements)");

        debut = System.nanoTime();
        for (int i = 0; i < taille; i++) {
            cache = tableauDynamique.get(i);
        }
        fin = System.nanoTime();
        System.out.println("TableauDynamique.get() : " + (fin - debut) + "ns" + " (" + taille + " elements)");
        System.out.println();
        //


        // size() is O(1) for both ListeChainee2 and TableauDynamique, O(n) for ListeChainee
        System.out.println("Benchmarking size()...");
        debut = System.nanoTime();
        cache = listeChainee.size();
        fin = System.nanoTime();
        System.out.println("ListeChainee.size() : " + (fin - debut) + "ns" + " (" + taille + " elements)");

        debut = System.nanoTime();
        cache = tableauDynamique.size();
        fin = System.nanoTime();
        System.out.println("TableauDynamique.size() : " + (fin - debut) + "ns" + " (" + taille + " elements)");
        System.out.println();
        //


        // set(x, y) is O(n) for ListeChainee and ListeChainee2, O(1) for TableauDynamique
        System.out.println("Benchmarking set()...");
        debut = System.nanoTime();
        for (int i = 0; i < taille; i++) {
            listeChainee.set(i, (int) (Math.random() * taille));
        }
        fin = System.nanoTime();
        System.out.println("ListeChainee.set() : " + (fin - debut) + "ns" + " (" + taille + " elements)");

        debut = System.nanoTime();
        for (int i = 0; i < taille; i++) {
            tableauDynamique.set(i, (int) (Math.random() * taille));
        }
        fin = System.nanoTime();
        System.out.println("TableauDynamique.set() : " + (fin - debut) + "ns" + " (" + taille + " elements)");
        System.out.println();
        //
    }
}
