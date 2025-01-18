package Library;

import java.util.ArrayList;

public class Librairie {
    private String nom;
    private String adresse;
    private ArrayList<Livre> livres = new ArrayList<>();

    public Librairie(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Livre> getLivres() {
        return livres;
    }

    public void setLivres(ArrayList<Livre> livres) {
        this.livres = livres;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getAdresse() {
        return adresse;
    }
    public void ajouterLivre(Livre livre) {
        livres.add(livre);
    }

    public void retirerLivre(Livre livre) {
        livres.remove(livre);
    }

    public Livre chercherLivre(String nom) {
        for (Livre livre : livres) {
            if (livre.getNom().equals(nom)) {
                return livre;
            }
        }
        return null;
    }

    public static Livre comparerPrix(Livre livre1, Livre livre2) {
        if (livre1.getPrix() > livre2.getPrix()) {
            return livre1;
        } else {
            return livre2;
        }
    }

    public static Livre comparerNom(Livre livre1, Livre livre2) {
        if (livre1.getNom().compareTo(livre2.getNom()) < 0) {
            return livre1;
        } else {
            return livre2;
        }
    }
}
