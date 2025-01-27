package UnOriginalAnimals;

public abstract class Animal {
    public final void makeSound() { //final means that this method cannot be overridden
        System.out.println("I'm making the following sound : " + sound());
    }
    public abstract String sound();
}
