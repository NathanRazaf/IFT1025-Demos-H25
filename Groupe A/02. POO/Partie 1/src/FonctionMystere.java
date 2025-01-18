public class FonctionMystere {
    public static void main(String[] args) {
        System.out.println(fonctionMystere(2));
    }

    public static String fonctionMystere(int n) {
        String s = "zz";
        for (int i = n; i > 0; i--) {
            s = s + "a" + s;
        }
        return s;
    }
}
