package Demo7.ArbreBinaire;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    private BinaryNode root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(int value) {
        if (this.root == null) {
            this.root = new BinaryNode(value);
        } else {
            this.recursiveInsert(this.root, value);
        }
    }

    public void recursiveInsert(BinaryNode node, int value) {
        if (value > node.value) { // si la valeur est plus grande que la valeur du noeud
            if (node.right == null) { // si le noeud droit est vide
                node.right = new BinaryNode(value); // on crée un nouveau noeud
            } else {
                this.recursiveInsert(node.right, value); // sinon on continue la recherche
            }
        } else if (value < node.value) { // si la valeur est plus petite que la valeur du noeud
            if (node.left == null) { // si le noeud gauche est vide
                node.left = new BinaryNode(value);  // on crée un nouveau noeud
            } else {
                this.recursiveInsert(node.left, value); // sinon on continue la recherche
            }
        }
    }

    public BinaryNode getRoot() {
        return this.root;
    }

    public BinaryNode search(int value) {
        return this.recursiveSearch(this.root, value);
    }

    public BinaryNode recursiveSearch(BinaryNode node, int value) {
        if (node == null) {
            return null;
        } else if (node.value == value) {
            return node;
        } else if (value < node.value) {
            return this.recursiveSearch(node.left, value);
        } else {
            return this.recursiveSearch(node.right, value);
        }
    }


}
