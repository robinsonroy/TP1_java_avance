package Controller;

import Model.Fakeroute;
import Model.LineRoute;
import Model.OutputProcessing;
import View.GraphPaint;
import View.MainWindows;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import org.graphstream.graph.Graph;

import java.util.ArrayList;

public class Main extends Application {

    private int position;
    private GraphPaint g;
    @Override
    public void start(Stage primaryStage) throws Exception{

        final MainWindows mainWindows = new MainWindows(primaryStage);
        g = new GraphPaint();
        g.diplay();
        position = 0;

        mainWindows.getValidateButton().setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {

                if ((mainWindows.getIpTextField().getText() != null && !mainWindows.getIpTextField().getText().isEmpty())){
                    String ipDesination = mainWindows.getIpTextField().getText();
                    Fakeroute fakeroute = new Fakeroute(ipDesination);
                    String output = fakeroute.fakerouteExec();
                    OutputProcessing output2 = new OutputProcessing(output);
                    ArrayList<LineRoute> ipList = output2.getList();


                    g.readList(ipList, "root", position);
                    g.addEdge(ipList);
                    System.out.printf("pos : %d", position);

                    position = position + 50;

                }else{
                    mainWindows.getEmptyText().setFill(Color.FIREBRICK);
                    mainWindows.getEmptyText().setText("Please enter an IP");

                }


            }
        });
    }


    public static void main(String[] args) {
        launch(args);
    }
}
