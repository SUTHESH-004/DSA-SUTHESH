package Graph;
import java.util.*;

public class DirectedGraph {
    Map<Integer,Node> nodes = new HashMap<>();
    Map<Node,List<Node>> adjlist = new HashMap<>();

    class Node{
        int n;
        Node(int n)
        {
            this.n = n;
        }
    }
    public void addNode(int n)
    {
        Node newNode = new Node(n);
        nodes.putIfAbsent(n,newNode);
        adjlist.putIfAbsent(newNode,new ArrayList<>());
    }

    public void addEdge(int m,int n)
    {
        Node from = nodes.get(m);
        Node to = nodes.get(n);

        if(from == null)
        System.out.print("no Node Exists");
        
        if(to == null)
        System.out.print("no Node Exists");

        adjlist.get(from).add(to);
    }

    public static void main(String[] args){
        Scanner ab = new Scanner(System.in);
        DirectedGraph g = new DirectedGraph();

        // add Node
        g.addNode(5);
        g.addNode(4);
        g.addNode(3);
        g.addNode(6);
        g.addNode(9);

        // add Edges
        g.addEdge(5, 4);
        g.addEdge(5, 3);
        g.addEdge(3, 4);
        g.addEdge(6, 9);
        g.addEdge(9, 6);

        g.bfs(6);
        ab.close();
    }

    public void bfs(int n)
    {
        Node a = nodes.get(n);
        Queue<Node> q = new LinkedList<>();
        Set<Node> set = new HashSet<>();
        q.add(a);
        set.add(a);

        System.out.println(a.n);
        while(!q.isEmpty())
        {
            Node x = q.poll();
            for(Node z:adjlist.get(x))
            {
                if(!set.contains(z))
                {
                    q.add(z);
                    set.add(z);
                    System.out.println(z.n);
                }
            }
        }
    }

    // public static void dfs(int n)
    // {
        
    // }
}
