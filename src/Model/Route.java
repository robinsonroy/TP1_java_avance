package Model;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Robinson on 12/01/15.
 */
public class Route {

    //List<Hop> create a list of hop that contains IP adresses to build a tree using Jtree component from Swing

    InputStream stream;

    public Route(){
        stream = null;
    }

    public InputStream getRoute(String url){
        Runtime r = Runtime.getRuntime();
        Process p = null;
        try {
            p = r.exec("java -jar fakeroute.jar " + url);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return p.getInputStream();
    }

    public void toString(InputStream myStream){

        int i;
        try {
            while ((i = myStream.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
