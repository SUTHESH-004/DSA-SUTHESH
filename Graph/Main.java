package Graph;

public class Main {
    public static void main(String[] args){
        Graphs g = new Graphs();
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
        g.addNode("E");        g.addEdge("A", "B");
        g.addEdge("B", "C");
        g.addEdge("C", "D");
        g.addEdge("B", "D");
        g.addEdge("A", "E");
        // g.DepthFirstSearch("A");
        g.BreadthFirstSearch("A");

        // g.print();
        // System.out.println();
        // g.print();

    }
}
