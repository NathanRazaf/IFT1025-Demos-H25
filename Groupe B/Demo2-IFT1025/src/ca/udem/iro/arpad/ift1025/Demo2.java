package ca.udem.iro.arpad.ift1025;

import ca.udem.iro.arpad.ift1025.personnes.Personne;

import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(is_Amstrong_number(9474));
        System.out.println(is_automorphic(376));

        Personne john = new Personne("Doe", "John", 26, new ArrayList<>(){});
        System.out.println(john);

        System.out.println(is_leap_year(2016));
        System.out.println(is_leap_year(2020));
    }
    public static boolean is_Amstrong_number(int n) {
        char[] number = String.valueOf(n).toCharArray();
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            int chiffre = Integer.parseInt(String.valueOf(number[i]));
            sum += (int) Math.pow(chiffre, number.length);
        }
        return sum == n;
    }
    public static boolean is_automorphic (int n) {
        int carre = (int) Math.pow(n, 2);
        String carre_n = String.valueOf(carre);
        int size = String.valueOf(n).length();
        return carre_n.substring(carre_n.length()-size).equals(String.valueOf(n));
    }
    public static boolean is_leap_year(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { // "if" complet
            return true;
        }
        return false;
    }
    public static boolean is_leap_year_compact(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0; //manière compacte sans "if"
    }
}
