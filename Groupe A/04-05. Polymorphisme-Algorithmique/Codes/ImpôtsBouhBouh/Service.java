package Demo5.ImpôtsBouhBouh;

public class Service implements Payable {
    private double prix;

    public Service(double prix) {
        this.prix = prix;
    }

    @Override
    public double totalAvecTaxes() {
        return prix * (1 + TVQ);
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String toString() {
        return "Service[prix=" + prix + "]";
    }


}
