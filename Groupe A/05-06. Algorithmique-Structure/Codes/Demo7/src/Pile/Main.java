package Demo7.Pile;

public class Main {
    public static void main(String[] args) {
        ListePile pile = new ListePile();

        for (int i = 0; i < 10; i++) {
            pile.push(i);
        }

        System.out.println(pile);
        System.out.println(pile.pop());
        System.out.println(pile);
        pile.push(10);
        System.out.println(pile);
        System.out.println(pile.pop());
        System.out.println(pile);
        pile.push(11);
        System.out.println(pile);
        System.out.println(pile.peek());
        System.out.println(pile.pop());
        System.out.println(pile);
        pile.push(12);
        System.out.println(pile);
        pile.push(13);
        System.out.println(pile);
        System.out.println(pile.isEmpty());
        System.out.println(pile.pop());
        System.out.println(pile);
        System.out.println(pile.pop());
        System.out.println(pile);
    }
}
