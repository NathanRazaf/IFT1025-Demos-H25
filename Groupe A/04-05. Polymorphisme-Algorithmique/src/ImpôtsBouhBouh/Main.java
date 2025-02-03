package ImpôtsBouhBouh;

public class Main {
    public static void main(String[] args) {
        Produit p = new Produit(100);
        Service s = new Service(100);
        System.out.println(p.totalAvecTaxes());
        System.out.println(s.totalAvecTaxes());
    }
}
