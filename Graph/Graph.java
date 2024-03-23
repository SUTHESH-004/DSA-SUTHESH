package Graph;

import java.util.*;
import java.util.ArrayList;

// import java.util.
public class Graph {
    private class Node {
        private String label;

        public Node(String label) {
            this.label = label;
        }

        @Override
        public String toString() {
            return this.label;
        }
    }

    private Map<String, Node> nodes = new HashMap<String, Node>();
    // for storing the nodes in the graph
    private Map<Node, ArrayList<Node>> adjacencyList = new HashMap<Node, ArrayList<Node>>();

    public void addNode(String label) {
        var node = new Node(label);
        nodes.putIfAbsent(label, node);
        adjacencyList.putIfAbsent(node, new ArrayList<>());

    }

    public void addEdge(String from, String to) {
        var NodeFrom = nodes.get(from);
        if (NodeFrom == null) {
            throw new IllegalArgumentException();
        }
        var NodeTo = nodes.get(to);
        if (NodeTo == null) {
            throw new IllegalArgumentException();
        }
        adjacencyList.get(NodeFrom).add(NodeTo);
    }

    public void print() {
        for (var node : adjacencyList.keySet()) {
            System.out.println(node + "is connect to " + adjacencyList);
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph();
        g.addNode("Suthesh");
        g.addNode("Sarath");
        g.addNode("Santhosh");
        g.addNode("Velliangiri");
        g.addEdge("Suthesh", "Santhosh");
        g.print();
    }
}
