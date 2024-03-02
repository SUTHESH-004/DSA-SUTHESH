package BinaryTree;

public class Tree {
    
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

    public boolean find(int value) {
        var current = root;
        while (current != null) {
            if (value > current.val) {
                current = current.rightchild;
            } else if (value < current.val) {
                current = current.leftchild;
            } else {
                return true;
            }

        }
        return false;

    }

    public void traversePreorder() {
        traversePreorder(root);
    }

    private void traversePreorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.val + " ");
        traversePreorder(root.leftchild);
        traversePreorder(root.rightchild);
    }

    public void traversePostorder() {
        traversePostorder(root);
    }

    private void traversePostorder(Node root) {
        if (root == null) {
            return;
        }
        traversePostorder(root.leftchild);
        traversePostorder(root.rightchild);
        System.out.print(root.val + " ");
    }

    private void traverseInorder(Node root) {
        if (root == null)
            return;
        traverseInorder(root.leftchild);
        System.out.print(root.val + " ");
        traverseInorder(root.rightchild);
    }

    public void traverseInorder() {
        traverseInorder(root);
    }

    public int height() {
        return height(root);
    }

    private int height(Node root) {
        if (root == null)
            return -1;
        if (root.leftchild == null && root.rightchild == null) {
            return 0;
        }
        return 1 + Math.max(height(root.leftchild), height(root.rightchild));
    }

    public int min() {
        if (root == null) {
            throw new IllegalArgumentException();
        }
        Node current = root;
        while (current.leftchild != null) {
            current = current.leftchild;
        }
        return current.val;
        // return min(root);
    }
    // private int min(Node root)
    // {
    // if(root.leftchild==null&&root.rightchild==null)
    // {
    // return root.val;
    // }
    // int l = min(root.leftchild);
    // int r = min(root.rightchild);
    // return Math.min(Math.min(l,r),root.val);
    // }
    public boolean equals(Tree t)
    {
        if(t==null)
        return false;
       return equals(root,t.root);
    }
    private boolean equals(Node root1,Node root2)
    {
        if(root1==null&&root2==null)
        return true;
        if(root1!=null&&root2!=null){
        return root1.val==root2.val && equals(root1.leftchild,root2.leftchild)&&equals(root1.rightchild,root2.rightchild);}
        return false;
    }
    // public boolean isBinarySearchTree()
    // {
         
    // }
    // public boolean isBinarySearchTree(Node root,int min,int max)
    // {
    //     if(root==null)        
    //     return true;
    // }
}
