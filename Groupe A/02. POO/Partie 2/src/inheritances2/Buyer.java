package inheritances2;

public class Buyer extends User {
    private float money;

    public Buyer(String name, String email, String password, float money) {
        super(name, email, password);
        this.money = money;
    }

    public float getMoney() {
        return money;
    }
    public void setMoney(float money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return super.toString() + ", and I'm a buyer with " + money + "$.";
    }
}
