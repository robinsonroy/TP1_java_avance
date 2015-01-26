package View;

import Model.IPInformation;
import Model.LineRoute;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Robinson on 26/01/15.
 */
public class GraphPaint {

    public GraphPaint(){};

    public void testGraph() {
        org.graphstream.graph.Graph graph = new SingleGraph("Tutorial 1");

        graph.addNode("A" );



        org.graphstream.graph.Node n = graph.addNode("B");
        n.addAttribute("ui.label","B");
        graph.addNode("C" );
        graph.addEdge("AB", "A", "B");
        graph.addEdge("BC", "B", "C");
        graph.addEdge("CA", "C", "A");



        graph.addAttribute("ui.stylesheet", "node { text-alignment: at-left; text-background-mode: plain; text-background-color: #EB2; text-color: #222; text-size: 20px; padding: 40px;}");
        graph.display();
    }

    public Graph readList(ArrayList<LineRoute> l, Graph graph) {


        Iterator iter = l.iterator();

        while (iter.hasNext())
        {
            LineRoute lineroute = (LineRoute) iter.next();

            if(lineroute.getIP1() != null){
                IPInformation ipInformation = lineroute.getIP1();
                org.graphstream.graph.Node n1 = graph.addNode(ipInformation.getIP());
                n1.addAttribute("ui.label", ipInformation.getIP());
            }

            if(lineroute.getIP2() != null){
                IPInformation ipInformation = lineroute.getIP2();
                graph.addNode(ipInformation.getIP());
                org.graphstream.graph.Node n2 = graph.addNode(ipInformation.getIP());
                n2.addAttribute("ui.label", ipInformation.getIP());
            }

            if(lineroute.getIP1() != null){
                IPInformation ipInformation = lineroute.getIP3();
                graph.addNode(ipInformation.getIP());
                org.graphstream.graph.Node n3 = graph.addNode(ipInformation.getIP());
                n3.addAttribute("ui.label", ipInformation.getIP());
            }


        }

        graph.addAttribute("ui.stylesheet", "node { text-color: #222; text-size: 20px;}");
        return graph;

    }
}
