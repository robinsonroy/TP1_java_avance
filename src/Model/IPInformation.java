package Model;

/**
 * Created by Robinson on 19/01/15.
 */
public class IPInformation {
    private String IP;
    private int t1, t2, t3;

    public IPInformation(){
        IP = null;
        t1 = -1;
        t2 = -1;
        t3 = -1;
    }
    public IPInformation(String IP , int t1){
        this.IP = IP;
        this.t1 = t1;
        this.t2 = -1;
        this.t3 = -1;
    }



    public IPInformation(String IP , int t1, int t2){
        this.IP = IP;
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = -1;
    }

    public IPInformation(String IP , int t1, int t2, int t3){
        this.IP = IP;
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public void setT1(int t1) {
        this.t1 = t1;
    }

    public void setT2(int t2) {
        this.t2 = t2;
    }

    public void setT3(int t3) {
        this.t3 = t3;
    }

    public String getIP() {
        return IP;
    }

    public void setRootIP(){
      IP = "root";
    }



}
