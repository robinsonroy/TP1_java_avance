package Controller;

/**
 * Created by Robinson on 12/01/15.
 */


import Model.Fakeroute;
import Model.OutputProcessing;
import Model.LineRoute;



public class mainController {

    public static void main(String[] args) {

    Fakeroute fakeroute = new Fakeroute ();

        String output  = fakeroute.fakerouteExec();
        LineRoute lineroute = new LineRoute ();
        lineroute.parseLine("Green Lights 123.456.7.43 12 ms");


    }

}
