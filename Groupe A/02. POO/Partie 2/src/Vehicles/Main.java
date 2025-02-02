package Vehicles;

public class Main {
    public static void main(String[] args) {
        Vehicule v1 = new Voiture(150, "Volvo", 5);
        System.out.println(v1);
        Voiture v1v = (Voiture) v1;
        System.out.println(v1v);
        Vehicule v1vv = (Vehicule) v1v;
        //((Voiture) v1v).getNombreDePlaces();
        System.out.println(v1vv);
    }


}
