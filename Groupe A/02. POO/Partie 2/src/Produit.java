import java.util.Objects;

public class Produit {
    private float prix;
    private String nom;

    public Produit(float prix, String nom) {
        this.prix = prix;
        this.nom = nom;
    }

    public void setPrix(float prix) {
        this.prix = Math.abs(prix);
    }

    public void setNom(String nom) {
        if (Objects.equals(nom, "")) {
            this.nom = "Default product";
        } else {
            this.nom = nom;
        }
    }

    public float getPrix() {
        return prix;
    }

    public String getNom() {
        return nom;
    }
}