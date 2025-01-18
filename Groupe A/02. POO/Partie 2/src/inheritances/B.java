package inheritances;

public class B {
    protected int number; // protected : accessible par les classes enfants
    protected String name; // private : accessible uniquement par la classe B

    public B(int number, String name) {
        this.number = number;
        this.name = name;
    }

    // toString est une méthode héritée de la superclasse Object, et on l'override
    @Override
    public String toString() {
     return "My number is " + number + ", my name is " + name;
    }
}
