package Vehicles;

public class Vehicule {
    protected int roues;
    protected int vitesseMax;
    protected String marque;

    public Vehicule(int roues, int vitesseMax, String marque) {
        this.roues = roues;
        this.vitesseMax = vitesseMax;
        this.marque = marque;
    }

    public Vehicule() {
        this.roues = 4;
        this.vitesseMax = 100;
        this.marque = "Volvo";
    }

    public int getRoues() {
        return roues;
    }

    public int getVitesseMax() {
        return vitesseMax;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setRoues(int roues) {
        this.roues = Math.max(1, roues);
    }

    public void setVitesseMax(int vitesseMax) {
        this.vitesseMax = Math.max(0 , vitesseMax);
    }

    @Override
    public String toString() {
        return "Vehicule, roues=" + roues + ", marque=" + marque;
    }
}
