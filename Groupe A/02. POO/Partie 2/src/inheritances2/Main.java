package inheritances2;

public class Main {
    public static void main(String[] args) {
        User[] users = new User[5];
        for (int i = 0; i < users.length; i++) {
            if (i % 2 == 0) {
                users[i] = new Buyer("Buyer " + i, "buyer" + i + "@gmail.com", "password" + i, 1000);
            } else {
                users[i] = new Seller("Seller " + i, "seller" + i + "@gmail.com", "password" + i, 2500);
            }
        }

        for (User user : users) {
            System.out.println(user);
            System.out.println("--------------------");
        }
    }
}
