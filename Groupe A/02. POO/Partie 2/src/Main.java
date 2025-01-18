import packages.StarWars.Clone;

public class Main {
    public static void main(String[] args) {
        Clone clone1 = new Clone("Bob", 20);

        // On adresse la classe Clone du package Clothes avec son chemin complet pour éviter les conflits
        // avec la classe Clone du package StarWars
        packages.Clothes.Clone clone2 = new packages.Clothes.Clone(1.80f, "blue");

        clone1.sayHello();
        clone2.greet();

        clone1.sayGoodbye();
    }
}
