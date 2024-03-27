// package LinkedList;

// /* Python & C students can delete this code & write a clean one from scratch */
// import java.util.*;
// class Node
// {
// 	int data;
// 	Node next;
// 	Node(int d)
// 	{
// 		data = d;
// 		next = null;
// 	}
// }
// public class LinkedList
// {
// 	Node head; // head of linked list

// 	boolean detectloop()
// 	{
// 	    Node h = head;
//         HashSet<Integer> set = new HashSet<>();
//         while(h!=null){
//             if(set.contains(h.data))
//             return true;
//             set.add(h.data);
//             h = h.next;
//         }
        
//         return false;
// 	}

// 	/* Inserts a new Node at front of the list. */
// 	public void add(int new_data)
// 	{
// 		Node new_node = new Node(new_data);
//   	    new_node.next = head;
// 	    head = new_node;
// 	}

// 	public static void main(String [] args)
// 	{
// 	    Scanner sc = new Scanner(System.in);
// 	    int n = sc.nextInt();
// 		LinkedList llist = new LinkedList();
// 		for (int i=1; i<=n; ++i)
// 		{
// 		    int l = sc.nextInt();
// 			llist.add(l);
// 		}
// 		if(llist.detectloop())
// 		   System.out.println("LOOP");
// 		else
// 		   System.out.println("NO LOOP");
// 	}
// }