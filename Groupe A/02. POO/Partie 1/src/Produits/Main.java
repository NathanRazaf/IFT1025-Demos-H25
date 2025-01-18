package Produits;

public class Main {
    public static void main(String[] args) {
        Produit produit = new Produit(10, "Produit 1", "Description du produit 1");
        System.out.println(produit.getPrix());
        produit.augmenterPrix(5);
        System.out.println(produit.getPrix());
    }
}
