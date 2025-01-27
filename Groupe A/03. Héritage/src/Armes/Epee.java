package Armes;

public class Epee extends Arme {
    @Override
    public void attaque(int distance) {
        if (distance < 2) {
            System.out.println("Attaque au corps à corps");
        } else {
            System.out.println("Attaque impossible car ennemi trop éloigné");
        }
    }
}
