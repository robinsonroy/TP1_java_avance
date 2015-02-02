package View;

import Model.IPInformation;
import Model.LineRoute;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
import org.graphstream.ui.swingViewer.Viewer;
import scala.util.parsing.combinator.testing.Str;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Robinson on 26/01/15.
 */
public class GraphPaint {

    private Graph graph;

    public GraphPaint(){
        graph = new SingleGraph("GraphRoute");
    };

    public void readList(ArrayList<LineRoute> l, String rootIP, int start) {

        try{
            Node n = graph.addNode(rootIP);
            n.addAttribute("ui.label", rootIP);
            n.setAttribute("xyz", 0, 0, 0);
        }catch (org.graphstream.graph.IdAlreadyInUseException e){
            //e.printStackTrace();
        }

        Iterator iter = l.iterator();

        //use to delete the first element of the list (destincation ip)
        if(iter.hasNext())
            iter.next();

        //position
        int x;
        int y = 3;

        while (iter.hasNext())
        {
            x = start;

            LineRoute lineroute = (LineRoute) iter.next();

            if(lineroute.getIP1() != null){
                IPInformation ipInformation = lineroute.getIP1();
                try {
                    Node n1 = graph.addNode(ipInformation.getIP());
                    n1.addAttribute("ui.label", ipInformation.getIP());
                    n1.setAttribute("xyz", x, y, 0);
                    x = x + 20;
                }catch (org.graphstream.graph.IdAlreadyInUseException e){
                    //e.printStackTrace();
                }
            }

            if(lineroute.getIP2() != null){
                IPInformation ipInformation = lineroute.getIP2();
                try {
                    Node n2 = graph.addNode(ipInformation.getIP());
                    n2.addAttribute("ui.label", ipInformation.getIP());
                    n2.setAttribute("xyz", x, y, 0);
                    x = x + 20;
                }catch (org.graphstream.graph.IdAlreadyInUseException e){
                    //e.printStackTrace();
                }
            }

            if(lineroute.getIP3() != null){
                IPInformation ipInformation = lineroute.getIP3();
                try {
                    Node n3 = graph.addNode(ipInformation.getIP());
                    n3.addAttribute("ui.label", ipInformation.getIP());
                    n3.setAttribute("xyz", x, y, 0);
                }catch (org.graphstream.graph.IdAlreadyInUseException e){
                    //e.printStackTrace();
                }
            }
            y = y + 3;
        }

    }

    public void addEdge(ArrayList<LineRoute> l){

        Iterator iter = l.iterator();

        LineRoute start = new LineRoute();
        start.setRootLine();

        //use to delete the first element of the list (destincation ip)
        if(iter.hasNext())
        iter.next();

        if(iter.hasNext()) {
            LineRoute l1 = (LineRoute) iter.next();
            createEdge(start, l1);

            while (iter.hasNext()) {
                LineRoute l2 = (LineRoute) iter.next();
                createEdge(l1, l2);
                l1 = l2;
                }
        }
    }


    public void createEdge(LineRoute l1, LineRoute l2){

        for (int i = 1; i < 4; i++){
            for(int j = 1; j < 4; j++){
                if(l1.getIPByNumber(i) != null){
                    if(l2.getIPByNumber(j) != null){
                        System.out.println("Edge : " + l1.getIPByNumber(i).getIP() + " -> " + l2.getIPByNumber(j).getIP());
                        String name = l1.getIPByNumber(i).getIP() + l2.getIPByNumber(j).getIP();
                        graph.addEdge(name, l1.getIPByNumber(i).getIP(), l2.getIPByNumber(j).getIP());
                    }
                }
            }
        }
    }

    public void diplay(){

        graph.addAttribute("ui.stylesheet", "node { text-color: #222; text-size: 20px;}");
        Viewer viewer = graph.display();
        viewer.disableAutoLayout();
    }
}
