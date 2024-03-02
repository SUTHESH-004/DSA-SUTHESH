package BinaryTree;

public class Node {
    int val;
    Node leftchild;
    Node rightchild;

    Node(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Node = " + val;
    }
}