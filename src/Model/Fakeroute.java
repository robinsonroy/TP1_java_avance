package Model;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Sekou on 13/01/15.
 */
public class Fakeroute {

    private char[] buffer = new char[2000];




    public Fakeroute()
    {
        for (int i=0; i<200; i++)
        {
            buffer[i] =' ';
        }
    }

    public String fakerouteExec() {



        Runtime r = Runtime.getRuntime();
        Process p = null;
        try {
            p = r.exec("java -jar fakeroute.jar ece.fr");
        } catch (IOException e) {
            e.printStackTrace();
        }

        InputStream myStream = p.getInputStream();


        int i;
        int j=0;
        try {
            while ((i = myStream.read()) != -1) {

                buffer[j] = (char)i;
                j++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String output = new String(buffer);

        System.out.println(output);

        return output;
    }



}
