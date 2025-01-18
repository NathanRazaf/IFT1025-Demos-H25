package ABCs;

public class A {
    public void doThing() {
        B b = new B();
        b.doThing();
        System.out.println("A");
    }
}
