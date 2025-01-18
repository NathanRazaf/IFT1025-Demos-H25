package Bitcoins;

public class Main {
    public static void main(String[] args) {
        BitCoin bitcoin = new BitCoin(2, 0.5f, "BitcoinAaah");
        System.out.println(bitcoin.getValeur());
        System.out.println(bitcoin.getTitreEnMajuscules());
        bitcoin.explose(2);
        System.out.println(bitcoin.getValeur());
    }
}
