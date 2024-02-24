package BinaryTree;
public class BinaryTree {
    Node root;

    class Node {
        int val;
        Node left;
        Node right;
        Node(int val) {
            this.val = val;
            this.right = null;
            this.left = null;
        }
    }

    BinaryTree(int val) {
        root = new Node(val);
    }

    void insertLeft(Node root, int val) {
        root.left = new Node(val);
    }

    void insertRight(Node root, int val) {
        root.right = new Node(val);
    }
    void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.val);
        preorder(root.left);
        preorder(root.right);
    }
    void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.val);
        inorder(root.right);
    }
    void postorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val);
    }

}