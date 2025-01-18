import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // on crée un objet Scanner pour lire l'entrée de l'utilisateur
        System.out.print("Entrez un nombre entier : ");
        int n = scanner.nextInt(); // on lit l'entrée de l'utilisateur
        int fibonacci = fibonacci(n);
        System.out.println("Le " + n + "-ième nombre de Fibonacci est " + fibonacci);
    }


    // solution récursive
    public static int fibonacciRec(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // solution itérative
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
