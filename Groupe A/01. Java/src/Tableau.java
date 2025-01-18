import java.util.Arrays;
import java.util.Scanner;

public class Tableau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // on crée un objet Scanner pour lire l'entrée de l'utilisateur
        System.out.print("Entrez un nombre entier : ");
        int n = scanner.nextInt(); // on lit l'entrée de l'utilisateur
        int[] tableau = lireTableau(n);
        System.out.println("Le tableau est : " + Arrays.toString(tableau)); // on affiche le tableau
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
}
