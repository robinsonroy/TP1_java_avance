package Model;
import javax.sound.sampled.Line;
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

    public IPInformation getIP1() {
        return IP1;
    }

    public IPInformation getIP2() {
        return IP2;
    }

    public IPInformation getIP3() {
        return IP3;
    }

    public IPInformation getIPByNumber(int i){
        if(i == 1)
            return IP1;
        if(i == 2)
            return IP2;
        if(i == 3)
            return IP3;
        else return null;
    }

    public void setRootLine() {
        IP1 = new IPInformation();
        IP1.setRootIP();
    }

    public void parseLine(String line){

        // parse and put information in lineRoute object
        Pattern ipPattern = Pattern.compile("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
        Matcher matcher = ipPattern.matcher(line);
        int [] saved = new int[3]; saved[0]=0; saved[1]=0; saved[2]=0;
        while (matcher.find())
        {


            if (saved[0]==0)
            {
                IP1 = new IPInformation();
                IP1.setIP(matcher.group());
                saved[0]=1;

            }
            else if (saved [1]== 0) {
                IP2 = new IPInformation();
                IP2.setIP(matcher.group());
                saved[1] = 1;

            }
            else
            {
                IP3 = new IPInformation();
                IP3.setIP(matcher.group());
                saved[2]=1;

            }
        }

    }
}
