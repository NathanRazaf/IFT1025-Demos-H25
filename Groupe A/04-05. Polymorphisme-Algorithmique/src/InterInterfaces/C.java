package InterInterfaces;

public abstract class C implements B {
    // Implémentation de méthodeA car B hérite de A
    public void methodeA() {
        System.out.println("methodeA");
    }

    // Implémentation de méthodeB
    public void methodeB() {
        System.out.println("methodeB");
    }

    public abstract void methodC();
}
