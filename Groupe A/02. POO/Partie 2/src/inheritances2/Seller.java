package inheritances2;

public class Seller extends User {
    private float revenue;

    public Seller(String name, String email, String password, float revenue) {
        super(name, email, password);
        this.revenue = revenue;
    }

    public float getRevenue() {
        return revenue;
    }
    public void setRevenue(float revenue) {
        this.revenue = Math.max(0, revenue);
    }

    @Override
    public String toString() {
        return super.toString() + ", and I'm a seller with " + revenue + "$.";
    }
}
