package Graph;

import java.util.*;

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
            System.out.println(node + " is connect to " + adjacencyList.get(node));
        }
    }

    public void removeNode(String label) {
        var nodef = nodes.get(label);
        for (var nodest : adjacencyList.keySet()) {
            adjacencyList.get(nodest).remove(nodef);
        }
    }

    public void DepthFirstSearch(String label) {
        DepthFirstSearch(nodes.get(label), new HashSet<>());
    }

    public void DepthFirstSearch(Node temp, Set<Node> visited) {
        System.out.println(temp);
        visited.add(temp);
        for (var node : adjacencyList.get(temp)) {
            if (!visited.contains(node))
                DepthFirstSearch(node, visited);
        }
    }

    public void BreadthFirstSearch(String label) {
        if (label == null) {
            return;
        }
        BreadthFirstSearch(nodes.get(label));
    }

    public void BreadthFirstSearch(Node root) {
        Set<Node> visited = new HashSet<Node>();
        Queue<Node> queue = new ArrayDeque<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.remove();
            if (visited.contains(current)) {
                continue;
            }
            System.out.println(current);
            visited.add(current);
            for (Node neighbour : adjacencyList.get(current)) {
                if (!visited.contains(neighbour)) {
                    queue.add(neighbour);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph();
        // g.addNode("Suthesh");
        // g.addNode("Sarath");

        // g.addNode("Santhosh");
        // g.addNode("Velliangiri");
        // g.addEdge("Suthesh", "Santhosh");
        // g.addEdge("Sarath", "Santhosh");
        // g.addEdge("Velliangiri", "Suthesh");
        g.addNode("A");
        g.addNode("B");
        g.addNode("C");
        g.addNode("D");
        g.addNode("E");
        g.addEdge("A", "B");
        g.addEdge("B", "C");
        g.addEdge("C", "D");
        g.addEdge("B", "D");
        g.addEdge("A", "E");
        g.DepthFirstSearch("A");
        g.BreadthFirstSearch("A");

        // g.print();
        // System.out.println();
        // g.print();

    }
}
