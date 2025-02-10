package Demo7.ListeChaînéeMieux;

import Demo6.IntegerList;
import Demo6.ListeChaînée.ListeChainee;
import Demo6.ListeChaînée.Noeud;

public class ListeChainee2 implements IntegerList {
    private Noeud premier;
    private int taille = 0;

    public ListeChainee2() {
        premier = null;
    }

    public Noeud getPremier() {
        return premier;
    }

    private Noeud getNoeud(int index) {
        Noeud courant = premier;
        for (int i = 0; i < index; i++) {
            courant = courant.suivant;
        }
        return courant;
    }



    public String toString() {
        StringBuilder resultat = new StringBuilder();
        Noeud courant = premier;
        resultat.append(courant.element);
        courant = courant.suivant;
        while (courant != null) {
            resultat.append(" -> ").append(courant.element);
            courant = courant.suivant;
        }
        return resultat.toString();
    }

    @Override
    public int size() {
        return taille;
    }

    @Override
    public int get(int index) {
        return getNoeud(index).element;
    }

    @Override
    public void set(int index, int value) {
        getNoeud(index).element = value;
    }

    @Override
    public void add(int value) {
        Noeud nouveau = new Noeud(value);
        if (premier == null) {
            premier = nouveau;
        } else {
            Noeud courant = premier;
            while (courant.suivant != null) {
                courant = courant.suivant;
            }
            courant.suivant = nouveau;
        }
        this.taille++;
    }

    @Override
    public void add(int index, int value) {
        if (index == 0) {
            premier = new Noeud(value, premier);
        } else {
            Noeud precedent = getNoeud(index - 1);
            precedent.suivant = new Noeud(value, precedent.suivant);
        }
        this.taille++;
    }

    @Override
    public int remove(int index) {
        int resultat;
        if (index == 0) {
            resultat = premier.element;
            premier = premier.suivant;
        } else {
            Noeud precedent = getNoeud(index - 1);
            resultat = precedent.suivant.element;
            precedent.suivant = precedent.suivant.suivant;
        }
        this.taille--;
        return resultat;
    }

    public void addAll(int index, ListeChainee2 autre) {
        if (index == 0) {
            autre.getNoeud(autre.size() - 1).suivant = premier;
            premier = autre.premier;
        } else {
            Noeud precedent = getNoeud(index - 1);
            autre.getNoeud(autre.size() - 1).suivant = precedent.suivant;
            precedent.suivant = autre.premier;
        }
        this.taille += autre.size();
    }
}
