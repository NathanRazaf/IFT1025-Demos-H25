package Demo7.ArbreBinaire;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        for (int i= 0; i < 10; i++) {
            tree.insert((int) (Math.random() * 100));
        }
    }
}
