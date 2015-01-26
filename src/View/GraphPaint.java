package View;

import org.graphstream.graph.implementations.SingleGraph;

/**
 * Created by Robinson on 26/01/15.
 */
public class GraphPaint {

    public GraphPaint(){};

    public void testGraph() {
        org.graphstream.graph.Graph graph = new SingleGraph("Tutorial 1");

        graph.addNode("A" );
        graph.addNode("B" );
        graph.addNode("C" );
        graph.addEdge("AB", "A", "B");
        graph.addEdge("BC", "B", "C");
        graph.addEdge("CA", "C", "A");

        graph.display();
    }
}
