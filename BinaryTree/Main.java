package BinaryTree;

public class Main {
  public static void main(String[] args) {
    Tree tree1 = new Tree();
    tree1.insert(7);
    tree1.insert(4);
    tree1.insert(9); 
    tree1.insert(1); 
    tree1.insert(6); 
    tree1.insert(8); 
    tree1.insert(10); 
    Tree tree2 = new Tree();
    tree2.insert(7);
    tree2.insert(4);
    tree2.insert(9); 
    tree2.insert(1); 
    tree2.insert(6); 
    tree2.insert(8); 
    tree2.insert(10); 
    System.out.println(tree1.equals(tree2));
    
  }
}

// System.out.println(tree2.min());
// System.out.println(tree);
// System.out.print(tree.find(9));
// tree.traversePreorder();
// System.out.println();
// tree.traverseInorder();
// System.out.println();
// tree.traversePostorder();
// System.out.println();
// System.out.println(tree.height());