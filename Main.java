package sample.Lab_9;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import sample.Lab_9.UnluckyException;

public class Main extends Application {

    private Label enterN1 = new Label("Enter nr 1:");
    private Label enterN2 = new Label("Enter nr 2:");
    private Label Errors = new Label("Errors:");
    private Label ErrorDisplay = new Label();
    private TextField textN1 = new TextField();
    private TextField textN2 = new TextField();
    private Button btnDiv = new Button("Div");
    private Label lblDiv = new Label("Div:");
    private Label lblDisplayDiv = new Label();


    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        GridPane myPane = new GridPane();
        myPane.setHgap(10);
        myPane.setVgap(10);
        Scene scene = new Scene(myPane, 600, 300);
        primaryStage.setTitle("Lab N9 JAVAFX");
        primaryStage.setScene(scene);
        primaryStage.show();

        myPane.add(enterN1, 0,0);
        myPane.add(textN1, 1, 0);
        myPane.add(enterN2, 0,1);
        myPane.add(textN2, 1, 1);
        myPane.add(lblDiv, 0,2);
        myPane.add(lblDisplayDiv, 1, 2);
        myPane.add(btnDiv, 2,2);
        myPane.add(Errors, 0,3);
        myPane.add(ErrorDisplay, 1, 3);

        myPane.setAlignment(Pos.CENTER);

        btnDiv.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (textN1.getText().length() == 0 || textN2.getText().length() == 0){
                    ErrorDisplay.setText("Empty field(s), please give number");
                    lblDisplayDiv.setText("");
                }
                else if(!isNumeric(textN1.getText()) || !isNumeric(textN2.getText())){
                    ErrorDisplay.setText("Is not number, please give number");
                    lblDisplayDiv.setText("");
                }
                else if(Double.parseDouble(textN2.getText()) == 13){
                    ErrorDisplay.setText(new UnluckyException().e);
                    lblDisplayDiv.setText("");
                }
                else {
                    lblDisplayDiv.setText("" + (Double.parseDouble(textN1.getText()) / Double.parseDouble(textN2.getText())));
                    ErrorDisplay.setText("");
                }
            }
        });


    }


    public static void main(String[] args) {
        Application.launch(args);
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}

