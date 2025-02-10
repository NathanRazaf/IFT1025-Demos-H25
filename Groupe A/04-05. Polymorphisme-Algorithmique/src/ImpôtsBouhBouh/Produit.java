package ImpôtsBouhBouh;

public class Produit implements Payable {
    private double prix;

    public Produit(double prix) {
        this.prix = prix;
    }

    public double totalAvecTaxes() {
        return prix * (1 + TPS + TVQ);
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Produit[prix=" + prix + "]";
    }
}
