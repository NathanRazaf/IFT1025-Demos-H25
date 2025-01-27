package Armes;

public class Arc extends Arme {
    @Override
    public void attaque(int distance) {
        if (distance > 2) {
            System.out.println("Attaque à distance");
        } else {
            System.out.println("Attaque impossible car ennemi trop proche");
        }
    }
}