package Model;
import java.util.regex.*;

/**
 * Created by Robinson on 19/01/15.
 */
public class LineRoute {
    private IPInformation IP1, IP2, IP3;

    public LineRoute(){
        IP1 = null;
        IP2 = null;
        IP3 = null;
    }

    public void parseLine(String line){

        // parse and put information in lineRoute object
        Pattern ipPattern = Pattern.compile("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
        Matcher matcher = ipPattern.matcher(line);
        int [] saved = new int[3]; saved[0]=0; saved[1]=0; saved[2]=0;
        while (matcher.find())
        {
            System.out.println("OK");

            if (saved[0]==0)
            {
                IP1 = new IPInformation();
                IP1.setIP(matcher.group());
                saved[0]=1;
                System.out.println(IP1.getIP());
            }
            else if (saved [1]== 0) {
                IP2 = new IPInformation();
                IP2.setIP(matcher.group());
                saved[1] = 1;
                System.out.println(IP2.getIP());
            }
            else
            {
                IP3 = new IPInformation();
                IP3.setIP(matcher.group());
                saved[2]=1;
                System.out.println(IP3.getIP());
            }
        }

    }

}
