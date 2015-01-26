package Model;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by Sekou on 13/01/15.
 */
public class OutputProcessing {

    private Scanner sc;
    ArrayList<LineRoute> ipList;

    public OutputProcessing(String lines)
    {

        this.sc = new Scanner (lines);
        this.ipList = new ArrayList<LineRoute>();
    }


    private void extractIP (Scanner sc)
    {
        while (sc.hasNextLine())
        {
            String line = sc.nextLine();
            LineRoute outputLine = new LineRoute();
            outputLine.parseLine(line);
            this.ipList.add(outputLine);
        }

    }


    public ArrayList<LineRoute> getList()
    {
        extractIP(sc);
        return this.ipList;

    }


}
