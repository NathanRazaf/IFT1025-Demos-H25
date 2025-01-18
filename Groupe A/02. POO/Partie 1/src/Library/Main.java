package Library;

public class Main {
    public static void main(String[] args) {
        Livre livre1 = new Livre("Livre 1", "Auteur 1", 10);
        Livre livre2 = new Livre("Livre 2", "Auteur 2", 20);

        Librairie librairie1 = new Librairie("Librairie 1", "Adresse 1");
        System.out.println(librairie1.getNom());

        Livre livreMoinsCher = Librairie.comparerPrix(livre1, livre2);
        Livre livreNomPlusGrand = Librairie.comparerNom(livre1, livre2);

        System.out.println(livreMoinsCher.getNom());
        System.out.println(livreNomPlusGrand.getNom());
    }
}
