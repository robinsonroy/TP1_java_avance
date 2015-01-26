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

        for (int i = 0; i<ipList.size()-1; i++)
        {
            ipList.get(i).printIP1();

        }

        GraphPaint g = new GraphPaint();
        g.testGraph();
    }

}
