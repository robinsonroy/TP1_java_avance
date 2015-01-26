package Controller;

/**
 * Created by Robinson on 12/01/15.
 */


import Model.Fakeroute;
import Model.OutputProcessing;
import Model.LineRoute;
import View.GraphPaint;


public class mainController {

    public static void main(String[] args) {

    Fakeroute fakeroute = new Fakeroute ();

        String output  = fakeroute.fakerouteExec();
        LineRoute lineroute = new LineRoute ();
        lineroute.parseLine("Green Lights 123.456.7.43 12.3.456.2 123.2.4.2 1.2.3.4");

        GraphPaint g = new GraphPaint();
        g.testGraph();
    }

}
