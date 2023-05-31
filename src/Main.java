import java.util.List;
public class Main {
    public static void main(String[] args) {
        WeightedGraph<String> graph = new WeightedGraph<>();
        Vertex<String> a = new Vertex<>("A");
        Vertex<String> b = new Vertex<>("B");
        Vertex<String> c = new Vertex<>("C");
        Vertex<String> d = new Vertex<>("D");
        Vertex<String> e = new Vertex<>("E");

        graph.addVertex(a);
        graph.addVertex(b);
        graph.addVertex(c);
        graph.addVertex(d);
        graph.addVertex(e);

        graph.addEdge(a, b, 5.0);
        graph.addEdge(a, c, 2.0);
        graph.addEdge(b, c, 1.0);
        graph.addEdge(b, d, 6.0);
        graph.addEdge(c, d, 3.0);
        graph.addEdge(c, e, 8.0);
        graph.addEdge(d, e, 4.0);

        Search<String> B = new BreadthFirstSearch<>(graph);//tests
        List<String> path = B.path(a, d);//tests
        System.out.println(path);//tests
    }
}