package Demo7.ListeChaînéeMieux;

public class Noeud {
    public int element;
    public Noeud suivant;
    public Noeud precedent;

    public Noeud(int element, Noeud precedent, Noeud suivant) {
        this.element = element;
        this.precedent = precedent;
        this.suivant = suivant;
    }

    public Noeud(int element) {
        this(element, null, null);
    }
}
