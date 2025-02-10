package Demo7.ListeChaînéeMieux;

import Demo6.IntegerList;

public class ListeDoublementChainee implements IntegerList {
    private Noeud premier;
    private Noeud dernier;
    private int taille = 0;

    public ListeDoublementChainee() {
        premier = null;
        dernier = null;
    }

    public Noeud getPremier() {
        return premier;
    }
    public Noeud getDernier() {
        return dernier;
    }

    public String toString() {
        StringBuilder resultat = new StringBuilder();
        Noeud courant = premier;
        while (courant != null) {
            resultat.append(courant.element);
            resultat.append(" ");
            courant = courant.suivant;
        }
        return resultat.toString();
    }

    private Noeud getNoeud(int index) {
        Noeud courant = premier;

        if (index == taille - 1) {
            return dernier;
        }

        if (index < taille / 2) {
            for (int i = 0; i < index; i++) {
                courant = courant.suivant;
            }
        } else {
            courant = dernier;
            for (int i = taille - 1; i > index; i--) {
                courant = courant.precedent;
            }
        }
        return courant;
    }

    @Override
    public int size() {
        return this.taille;
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
        // Cas 1 : rien dans la liste
        if( this.premier == null ) {
            this.premier = new Noeud( value, null , null);
            this.dernier = premier;
            // Cas 2 : trouver le noeud terminal
        } else {
            Noeud fin = this.dernier;
            // Ajoute un noeud à la fin de la liste
            fin.suivant = new Noeud( value, fin, null);
            this.dernier = fin.suivant;
        }
        this.taille++;
    }

    @Override
    public void add(int index, int value) {
        if (index == 0) {
            Noeud nouveau = new Noeud(value, null, premier);
            premier.precedent = nouveau;
            premier = nouveau;
        } else if (index == taille) {
            add(value);
        } else {
            Noeud courant = getNoeud(index);
            Noeud nouveau = new Noeud(value, courant.precedent, courant);
            courant.precedent.suivant = nouveau;
            courant.precedent = nouveau;
        }
        taille++;
    }

    @Override
    public int remove(int index) {
        Noeud courant = getNoeud(index);
        if (courant.precedent != null) {
            courant.precedent.suivant = courant.suivant;
        } else {
            premier = courant.suivant;
        }
        return courant.element;
    }
}
