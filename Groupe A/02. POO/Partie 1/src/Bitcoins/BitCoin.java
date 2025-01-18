package Bitcoins;

public class BitCoin {
    private int valeur;
    private float random;
    private String titre;

    // constructeur
    public BitCoin(int valeur, float random, String titre) {
        this.valeur = valeur;
        this.random = random;
        this.titre = titre;
    }

    // getters
    public int getValeur() {
        return valeur;
    }
    public float getRandom() {
        return random;
    }
    public String getTitre() {
        return titre;
    }

    // setters
    public void setValeur(int valeur) {
        this.valeur = valeur;
    }
    public void setRandom(float random) {
        this.random = random;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }

    // méthode qui fait exploser la valeur du bitcoin en fonction d'un exposant
    public void explose(int exponent) {
        this.valeur = (int) (this.valeur * Math.pow(69, exponent));
    }

    // méthode qui retourne le titre du bitcoin en majuscules
    public String getTitreEnMajuscules() {
        return titre.toUpperCase();
    }
}
