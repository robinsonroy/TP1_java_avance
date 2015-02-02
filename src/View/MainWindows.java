package View;



import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Robinson on 02/02/15.
 */
public class MainWindows {
    private TextField ipTextField;
    private Button validateButton;
    private Text emptyText;

    public MainWindows(Stage primaryStage){
        primaryStage.setTitle("TraceRoute");

        primaryStage.show();

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));


        Text scenetitle = new Text("Destination");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label destinationIP = new Label("IP :");
        grid.add(destinationIP, 0, 1);

        ipTextField = new TextField();
        grid.add(ipTextField, 1, 1);

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);

        emptyText = new Text();
        grid.add(emptyText, 1, 6);

        validateButton = new Button("Trace Route");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(validateButton);
        grid.add(hbBtn, 1, 4);
    }

    public TextField getIpTextField() {
        return ipTextField;
    }

    public Button getValidateButton() {
        return validateButton;
    }

    public Text getEmptyText() {
        return emptyText;
    }
}
