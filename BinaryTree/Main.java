package BinaryTree;

public class Main {
 public static void main(String[] args)   
 {
    Tree tree = new Tree();
    tree.insert(7);
    tree.insert(1);
    tree.insert(2);
    tree.insert(8);
    tree.insert(9);
    System.out.println(tree);
    System.out.print(tree.find(9));

 }
}
