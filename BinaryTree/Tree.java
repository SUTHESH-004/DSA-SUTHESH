package BinaryTree;

import javax.lang.model.util.ElementScanner14;

public class Tree {
    private class Node {
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

    private Node root; // ROOT OF THE NODE

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }
        var current = root;
        while (true) {
            if (value < current.val) {
                if (current.leftchild == null) {
                    current.leftchild = new Node(value);
                    break;
                }
                current = current.leftchild;
            }
            if (value > current.val) {
                if (current.rightchild == null) {
                    current.rightchild = new Node(value);
                    break;
                }
                current = current.rightchild;
            }

        }

    }
    
    public boolean find(int value)
    {
        var current = root;
        while(current !=null)
        {
            if (value>current.val)
            {
                current = current.rightchild;
            }
            else if(value<current.val)
            {
                current = current.leftchild;
            }
            else{
                return true;
        }
        
    }
    return false;

    }
}
