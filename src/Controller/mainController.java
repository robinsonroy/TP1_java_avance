package Controller;
/**
 * Created by Robinson on 12/01/15.
 */


import Model.Fakeroute;
import Model.OutputProcessing;


public class mainController {

    public static void main(String[] args) {

    Fakeroute fakeroute = new Fakeroute ();

        String output  = fakeroute.fakerouteExec();

        OutputProcessing outputProcessing = new OutputProcessing(output);
    }

}
