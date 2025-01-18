import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // on crée un objet Scanner pour lire l'entrée de l'utilisateur
        System.out.print("Quelle est votre année de naissance ? ");
        int anneeNaissance = scanner.nextInt(); // on lit l'entrée de l'utilisateur
        int age = 2024 - anneeNaissance; // on calcule l'âge
        System.out.println("Vous aurez " + age + " ans en 2024.");
    }
}
