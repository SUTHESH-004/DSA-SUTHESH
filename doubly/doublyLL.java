package doubly;

public class doublyLL {
    class Node {
        int data;
        Node left;
        Node right;
        Node(int val)
        {
            this.val = val;
        }
    }
    Node head;
    Node tail;
    public void addNode(int val)
    {
        Node newNode = new Node(val);
        if(head ==null)
        {
            head = newNode;
            head.left = null;
            head.right =null;
        }
        else{
            
        }
    }
}
