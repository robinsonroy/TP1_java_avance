/**
 * Created by Robinson on 12/01/15.
 */

import java.io.InputStream;
import java.lang.Process;
import java.io.IOException;

/**
 * Created by Robinson on 05/01/15.
 */
public class mainController {

    public static void main(String[] args) {

        Runtime r = Runtime.getRuntime();
        Process p = null;
        try {
            p = r.exec("java -jar /Users/Robinson/Downloads/fakeroute.jar ece.fr");
        } catch (IOException e) {
            e.printStackTrace();
        }

        InputStream myStream = p.getInputStream();

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
