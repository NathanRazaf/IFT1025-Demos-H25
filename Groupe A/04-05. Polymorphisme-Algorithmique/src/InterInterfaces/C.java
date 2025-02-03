package InterInterfaces;

public class C implements B {
    // Implémentation de méthodeB
    public void methodeB() {
        System.out.println("methodeB");
    }

    // Implémentation de méthodeA car B hérite de A
    public void methodeA() {
        System.out.println("methodeA");
    }
}
