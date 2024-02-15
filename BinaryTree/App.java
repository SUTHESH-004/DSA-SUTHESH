package BinaryTree;
public class App {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(0);
        tree.insertLeft(tree.root, 1);
        tree.insertRight(tree.root, 2);
        // System.out.print(tree.root.val);
        tree.insertLeft(tree.root.left, 3);
        tree.insertRight(tree.root.left,4);
        tree.preorder(tree.root);
        System.out.println();
        tree.postorder(tree.root);
        System.out.println();
        tree.inorder(tree.root);

    }
}
