package Controller;

/**
 * Created by Robinson on 12/01/15.
 */


import Model.Fakeroute;
import Model.OutputProcessing;
import Model.LineRoute;
import View.GraphPaint;

import java.util.ArrayList;


public class mainController {

    public static void main(String[] args) {

    Fakeroute fakeroute = new Fakeroute ();

        String output  = fakeroute.fakerouteExec();
        OutputProcessing output2 = new OutputProcessing(output);
        ArrayList<LineRoute> ipList = output2.getList();

        GraphPaint g = new GraphPaint();
        g.readList(ipList);
        g.addEdge(ipList);
        g.diplay();
    }

}
