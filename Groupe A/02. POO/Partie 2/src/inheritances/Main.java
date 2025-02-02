package inheritances;

import inheritances.    inner_inheritance.A;

public class Main {
    public static void main(String[] args) {
        B b = new B(12, "B");
        System.out.println(b.toString());

        A a = new A(24, "A", 20);
        System.out.println(a); // Imprimer un objet signifie imprimer son toString()
    }
}
