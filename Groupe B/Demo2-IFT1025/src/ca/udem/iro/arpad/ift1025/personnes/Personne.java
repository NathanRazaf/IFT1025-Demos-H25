package ca.udem.iro.arpad.ift1025.personnes;

import java.util.ArrayList;
import java.util.Arrays;

public class Personne {
    private String nom;
    private String prenom;
    private int age;
    private ArrayList<String> inventaire; //un Array est un tableau dynamique
                                          // permettant la modification contrairement à un tableau

    public Personne(String nom, String prenom, int age, ArrayList<String> inventaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.inventaire = inventaire;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<String> getInventaire() {
        return inventaire;
    }

    public void setInventaire(ArrayList<String> inventaire) {
        this.inventaire = inventaire;
    }

    public void addInventaire(String inventaire) {
        this.inventaire.add(inventaire);
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", inventaire=" + inventaire +
                '}';
    }
}
