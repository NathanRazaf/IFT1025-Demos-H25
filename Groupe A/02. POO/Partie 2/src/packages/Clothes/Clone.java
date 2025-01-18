package packages.Clothes;

public class Clone {
    private float size;
    private String color;

    public Clone(float size, String color) {
        this.size = size;
        this.color = color;
    }

    public float getSize() {
        return this.size;
    }
    public String getColor() {
        return this.color;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void greet() {
        System.out.println("Hi, I'm also a clone, I'm " + size + "m tall and I'm " + color + "!");
    }
}
