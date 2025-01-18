import java.util.Scanner;

public class CelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // on crée un objet Scanner pour lire l'entrée de l'utilisateur
        System.out.print("Entrez une température en degrés Celsius : ");
        double celsius = scanner.nextDouble(); // on lit l'entrée de l'utilisateur
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println(celsius + " degrés Celsius = " + fahrenheit + " degrés Fahrenheit");
    }
    
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32; // on applique la formule de conversion
    }
}
