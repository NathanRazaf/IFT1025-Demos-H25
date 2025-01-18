package Library;


public class Livre {
    private String nom;
    private String auteur;
    private float prix;

    public Livre(String nom, String auteur, float prix) {
        this.nom = nom;
        this.auteur = auteur;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public float getPrix() {
        return prix;
    }
    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
}

