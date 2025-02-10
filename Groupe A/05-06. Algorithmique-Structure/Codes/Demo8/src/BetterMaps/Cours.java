package Demo8.BetterMaps;

public class Cours {
    private final String nom;
    private float moyenne;

    public Cours(String nom, float moyenne) {
        this.nom = nom;
        this.moyenne = moyenne;
    }

    public String getNom() {
        return nom;
    }

    public float getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(float moyenne) {
        this.moyenne = moyenne;
    }

    public String toString() {
        return nom + " : " + moyenne;
    }

}
