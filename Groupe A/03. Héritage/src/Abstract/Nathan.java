package Abstract;

public class Nathan implements Parent1, Parent2 {
    @Override
    public void cuisiner() {
        System.out.println("Je cuisine");
    }

    @Override
    public void travailler() {
        System.out.println("Je travaille");
    }

    @Override
    public void jardiner() {
        System.out.println("Je jardine");
    }
}
