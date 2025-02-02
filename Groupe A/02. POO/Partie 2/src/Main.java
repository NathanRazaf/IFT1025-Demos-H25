
public class Main {
    public static void main(String[] args) {
        Produit p = new Produit(10.5f, "SAfd");
        p.setNom("");
        p.setPrix(-10.0f);

        System.out.println(p.getPrix());
        System.out.println(p.getNom());
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}
