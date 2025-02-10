package TableauDynamique;

import IntegerList;

public class Main {
    public static int step = 1;
    public static void main(String[] args) {
        TableauDynamique tab = new TableauDynamique();

        // Manipulation du tableau
        for (int i = 1; i <= 10; i++) {
            tab.add(i);
        }

        test(tab);

        TableauDynamique tab2 = new TableauDynamique();
        for (int i = 1; i <= 10; i++) {
            tab2.add(i);
        }
    }

    public static void test(IntegerList tab) {
        System.out.println("Tableau initial : " + tab);
        tab.add(3, 100);
        print(tab);
        tab.remove(5);
        print(tab);
        tab.add(14);
        print(tab);
        tab.add(18);
        print(tab);
        tab.remove(2);
        print(tab);
        tab.set(0, 200);
        print(tab);
        tab.set(8, 300);
        print(tab);
        tab.add(2, 400);
        print(tab);
        tab.remove(3);
        print(tab);
    }

    private static void print(IntegerList tab) {
        System.out.println(step++ + ". " + tab);
    }
}
