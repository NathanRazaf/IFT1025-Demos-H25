package Complexité;

public class Machin {
    static int nombreOperations = 0;
    public static void main(String[] args) {
        int n = 2048;
        System.out.println("n : " + n);
        System.out.println("Machin : " + machin(n));
        System.out.println("Nombre d'opérations : " + nombreOperations);
    }

    public static int machin(int n) {
        if (n == 0) {
            return 1;
        }
        nombreOperations++;
        return 2 * machin(n / 2);
    }
}
