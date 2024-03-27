// package BinaryTreePortal;

// import java.util.*;

// class Node
// {
//     int data;
//     Node left, right;
 
//     Node(int key)
//     {
//         data = key;
//         left = right = null;
//     }
// }
 
// class prog
// {
//     static Node root;
    
//     public static void display(Node node)
//     {
//         if (node == null) 
//             return;
 
//         display(node.left);
//         display(node.right);
//         System.out.print(node.data + " ");
        
//     }
 
//     public static Node insert(Node node, int key)
//     {
        
//         //type code here..
        
//         return node;
//     }
    
//     public static void main(String[] args)
//     {
//         int n;
//         Scanner sc = new Scanner(System.in);
//         n = sc.nextInt();
    
//         root = insert(null,sc.nextInt());
               
//         for(int i=0;i<n-1;++i)
//             insert(root,sc.nextInt());
            
//         display(root);
//     }
// }

