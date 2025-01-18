import java.util.Scanner;

public class TableauDeux {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // on crée un objet Scanner pour lire l'entrée de l'utilisateur
        System.out.print("Entrez un nombre entier : ");
        int n = scanner.nextInt(); // on lit l'entrée de l'utilisateur
        int[] tableau = lireTableau(n);
        int somme = sommeTableau(tableau);
        System.out.println("La somme des éléments du tableau est : " + somme);
    }
    
    public static int[] lireTableau(int n) {
        int[] tableau = new int[n]; // on crée un tableau de taille n
        Scanner scanner = new Scanner(System.in); // on crée un objet Scanner pour lire l'entrée de l'utilisateur
        for (int i = 0; i < n; i++) {
            System.out.print("Entrez un nombre entier : ");
            tableau[i] = scanner.nextInt(); // on lit l'entrée de l'utilisateur
        }
        return tableau;
    }

    public static int sommeTableau(int[] tableau) {
        int somme = 0;
        for (int i = 0; i < tableau.length; i++) {
            somme += tableau[i];
        }
        return somme;
    }
}
