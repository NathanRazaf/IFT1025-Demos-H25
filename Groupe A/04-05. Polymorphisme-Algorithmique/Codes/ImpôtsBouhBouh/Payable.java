package Demo5.ImpôtsBouhBouh;

public interface Payable {
    public static final double TPS = 0.05;
    public static final double TVQ = 0.09975;


    public double totalAvecTaxes();
}
