// package LinkedList;
// // to display elements in middle
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

// public class LinkedList5
// {
//     static int size =0;
// 	Node head; // head of linked list
//     Node tail;
// 	boolean detectloop()
// 	{
// 	    Node h = head;
//         HashSet<Integer> set = new HashSet<>();
//         while(h!=null){
//             if(set.contains(h.data))
//             return true;
//             set.add(h.data);
//             h=h.next;
//         }
        
//         return false;
// 	}
// 	public int displaymid()
// 	{
// 	    Node r = head;
// 	    int data =-1;
// 	    int h =0;
// 	    if(size/2==0)
// 	    h=(size/2)+1;
// 	    else
// 	    h=(size/2)+1;
// 	   // h=size/2;
	    
// 	    for(int i=0;i<h;i++)
// 	    {
// 	        data = r.data;
// 	        r = r.next;
// 	    }
// 	    return data;
// 	}

// 	/* Inserts a new Node at front of the list. */
// 	public void add(int new_data)
// 	{
// 	    Node new_node = new Node(new_data);
// 	    if(head == null)
// 	    head = tail = new_node;
// 	    else{
// 	    tail.next = new_node;
// 	    tail = new_node;}
// 	    size++;
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
// 		int so = llist.displaymid();
// 		System.out.print(so);
// 	}
// }