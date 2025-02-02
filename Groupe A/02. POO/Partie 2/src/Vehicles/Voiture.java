package Vehicles;

public class Voiture extends Vehicule {
    private int nombreDePlaces;

    public Voiture(int vitesseMax, String marque, int nombreDePlaces) {
        super(4, vitesseMax, marque);
        this.nombreDePlaces = nombreDePlaces;
    }

    public Voiture(int roues, int vitesseMax, String marque, int nombreDePlaces) {
        super(roues, vitesseMax, marque);
        this.nombreDePlaces = nombreDePlaces;
    }

    public Voiture() {
        super();
        this.nombreDePlaces = 10;
    }

    public int getNombreDePlaces() {
        return nombreDePlaces;
    }

    public void setNombreDePlaces(int nombreDePlaces) {
        this.nombreDePlaces = Math.max(1, nombreDePlaces);
    }

    public void raiseSpeed(int speed) {
        this.vitesseMax += speed;
    }

    @Override
    public String toString() {
        return "Voiture: nombre de places=" + nombreDePlaces + ", vitesse max=" + nombreDePlaces;
    }
}
