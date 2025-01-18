package Produits;

public class Produit {
    private float prix;
    private String nom, description;

    //constructeur
    public Produit(float prix, String nom, String description) {
        this.prix = prix;
        this.nom = nom;
        this.description = description;
    }

    //getters
    public float getPrix() {
        return prix;
    }
    public String getNom() {
        return nom;
    }
    public String getDescription() {
        return description;
    }

    //setters
    public void setPrix(float prix) {
        this.prix = prix;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    //autres méthodes
    public void augmenterPrix(float prix) {
        this.prix += prix;
    }
}
