package Model;

/**
 * Created by Robinson on 19/01/15.
 */
public class IPInformation {
    private String IP;
    private int t1, t2, t3;

    public IPInformation(){
        IP = null;
        t1 = 0;
        t2 = 0;
        t3 = 0;
    }
    public IPInformation(String IP , int t1){
        this.IP = IP;
        this.t1 = t1;
    }

    public IPInformation(String IP , int t1, int t2){
        this.IP = IP;
        this.t1 = t1;
        this.t2 = t2;
    }

    public IPInformation(String IP , int t1, int t2, int t3){
        this.IP = IP;
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }
}
