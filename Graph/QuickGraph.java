package Graph;

import java.lang.reflect.Array;
import java.util.*;

public class QuickGraph {
    class Node {
        String label;

        Node(String label) {
            this.label = label;
        }
    }

    static HashMap<String, Node> nodes = new HashMap<String, Node>();static HashMap<Node,ArrayList<Node> adj = new HashMap<Node,ArrayList<Node>();

    public void addNode(String val)
    {
        if(nodes.containsKey(val))
        {
            var node = new Node();
            nodes.putIfAbsent(label,node);
            adjacencyList.putIfAbsent(node,new ArrayList<Node>);
        }
    }

    public void addEdge(from,to)
    {
        adjacencyList.get(from).add(to);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }

}
