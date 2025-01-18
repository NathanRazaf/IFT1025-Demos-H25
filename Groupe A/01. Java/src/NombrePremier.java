import java.util.Scanner;

public class NombrePremier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // on crée un objet Scanner pour lire l'entrée de l'utilisateur
        System.out.print("Entrez un nombre entier : ");
        int nombre = scanner.nextInt(); // on lit l'entrée de l'utilisateur
        boolean estPremier = estPremier(nombre);
        System.out.println(nombre + " est premier : " + estPremier);
    }

    public static boolean estPremier(int nombre) {
        if (nombre <= 1) {
            return false;
        }
        for (int i = 2; i < nombre; i++) { // on teste tous les nombres entre 2 et nombre - 1
            if (nombre % i == 0) { // si nombre est divisible par i, alors il n'est pas premier
                return false;
            }
        }
        return true;
    }
}
