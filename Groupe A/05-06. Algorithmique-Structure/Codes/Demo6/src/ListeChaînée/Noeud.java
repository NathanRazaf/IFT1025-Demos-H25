package ListeChaînée;

public class Noeud {
    public int element;
    public Noeud suivant;

    public Noeud(int element, Noeud suivant) {
        this.element = element;
        this.suivant = suivant;
    }

    public Noeud(int element) {
        this(element, null);
    }
}
