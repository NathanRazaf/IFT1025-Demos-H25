package inheritances;

public class A extends B { //,C
    private int ID;
    public A(int number, String name, int ID) {
        super(number, name);
        this.ID = ID;
    }

    @Override
    public String toString() {
        return super.toString() + " and my ID is " + this.ID;
    }
}
