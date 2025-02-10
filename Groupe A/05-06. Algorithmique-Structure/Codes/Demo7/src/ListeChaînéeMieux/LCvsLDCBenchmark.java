package Demo7.ListeChaînéeMieux;

import Demo6.ListeChaînée.ListeChainee;

public class LCvsLDCBenchmark {
    public static void main(String[] args) {
        int n = 10000;

        ListeChainee listeChainee = new ListeChainee();
        ListeDoublementChainee listeDoublementChainee = new ListeDoublementChainee();

        // add(x)
        System.out.println("add(x):");
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            listeChainee.add((int) (Math.random() * n));
        }
        long end = System.nanoTime();
        System.out.println("ListeChainee.add(x): " + (end - start)/1000 + " microsecondes (" + n + " éléments)");

        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            listeDoublementChainee.add((int) (Math.random() * n));
        }
        end = System.nanoTime();
        System.out.println("ListeDoublementChainee.add(x): " + (end - start)/1000 + " microsecondes (" + n + " éléments)");
        //


        // add(x, index)
        System.out.println("\nadd(x, index):");
        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            listeChainee.add((int) (Math.random() * n), (int) (Math.random() * n));
        }
        end = System.nanoTime();
        System.out.println("ListeChainee.add(x, index): " + (end - start)/1000 + " microsecondes (" + n + " éléments)");

        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            listeDoublementChainee.add((int) (Math.random() * n), (int) (Math.random() * n));
        }
        end = System.nanoTime();
        System.out.println("ListeDoublementChainee.add(x, index): " + (end - start)/1000 + " microsecondes (" + n + " éléments)");
        //


        // remove(index)
        System.out.println("\nremove(index):");
        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            listeChainee.remove((int) (Math.random() * n));
        }
        end = System.nanoTime();
        System.out.println("ListeChainee.remove(index): " + (end - start)/1000 + " microsecondes (" + n + " éléments)");

        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            listeDoublementChainee.remove((int) (Math.random() * n));
        }
        end = System.nanoTime();
        System.out.println("ListeDoublementChainee.remove(index): " + (end - start)/1000 + " microsecondes (" + n + " éléments)");


        // get(index)
        System.out.println("\nget(index):");
        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            listeChainee.get((int) (Math.random() * n));
        }
        end = System.nanoTime();
        System.out.println("ListeChainee.get(index): " + (end - start)/1000 + " microsecondes (" + n + " éléments)");

        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            listeDoublementChainee.get((int) (Math.random() * n));
        }
        end = System.nanoTime();
        System.out.println("ListeDoublementChainee.get(index): " + (end - start)/1000 + " microsecondes (" + n + " éléments)");
        //


        // set(index, value)
        System.out.println("\nset(index, value):");
        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            listeChainee.set((int) (Math.random() * n), (int) (Math.random() * n));
        }
        end = System.nanoTime();
        System.out.println("ListeChainee.set(index, value): " + (end - start)/1000 + " microsecondes (" + n + " éléments)");

        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            listeDoublementChainee.set((int) (Math.random() * n), (int) (Math.random() * n));
        }
        end = System.nanoTime();
        System.out.println("ListeDoublementChainee.set(index, value): " + (end - start)/1000 + " microsecondes (" + n + " éléments)");


        // remove(0)
        System.out.println("\nremove(0):");
        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            listeChainee.remove(0);
        }
        end = System.nanoTime();
        System.out.println("ListeChainee.remove(0): " + (end - start)/1000 + " microsecondes (" + n + " éléments)");

        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            listeDoublementChainee.remove(0);
        }
        end = System.nanoTime();
        System.out.println("ListeDoublementChainee.remove(0): " + (end - start)/1000 + " microsecondes (" + n + " éléments)");
        //

        for (int i = 0; i < n; i++) {
            listeChainee.add((int) (Math.random() * n));
        }
        for (int i = 0; i < n; i++) {
            listeDoublementChainee.add((int) (Math.random() * n));
        }

        // remove(size - 1)
        System.out.println("\nremove(size - 1):");
        start = System.nanoTime();
        for (int i = 0; i < n/2; i++) {
            listeChainee.remove(i);
        }
        end = System.nanoTime();
        System.out.println("ListeChainee.remove(size - 1): " + (end - start)/1000 + " microsecondes (" + n + " éléments)");

        start = System.nanoTime();
        for (int i = 0; i < n/2; i++) {
            listeDoublementChainee.remove(i);
        }
        end = System.nanoTime();
        System.out.println("ListeDoublementChainee.remove(size - 1): " + (end - start)/1000 + " microsecondes (" + n + " éléments)");
    }
}
