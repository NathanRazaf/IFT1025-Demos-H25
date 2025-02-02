package Vehicles;

public class Moto extends Vehicule {
    private int cylindree;

    public Moto(int roues, int vitesseMax, String marque, int cylindree) {
        super(roues, vitesseMax, marque);
        this.cylindree = cylindree;
    }

    public Moto(int vitesseMax, String marque, int cylindree) {
        this(2, vitesseMax, marque, cylindree);
    }

    public int getCylindree() {
        return cylindree;
    }

    public void setCylindree(int cylindree) {
        if (cylindree < 0) {
            this.cylindree = 0;
        } else {
            this.cylindree = cylindree;
        }
    }
}
