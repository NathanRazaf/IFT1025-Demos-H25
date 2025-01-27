package Armes;

public class Main {
    public static void main(String[] args) {
        Arme[] armes = new Arme[5];
        for (int i = 0; i < armes.length; i++) {
            if (i % 2 == 0) {
                armes[i] = new Epee();
            } else {
                armes[i] = new Arc();
            }
        }
        for (Arme arme : armes) {
            arme.attaque(1);
            arme.attaque(3);
        }
    }
}
