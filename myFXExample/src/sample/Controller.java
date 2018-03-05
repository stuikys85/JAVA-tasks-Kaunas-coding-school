package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller
{
    @FXML
    private Label dummieLabel;


    @FXML
    private TextField dummieTextField;


    public void sayHi (ActionEvent event)
{
    String oldLabelText = dummieLabel.getText();
   // dummieLabel.setText(oldLabelText + " Andrius ");// pakeicia label text su vardu.

    dummieLabel.setText(oldLabelText+ " " + dummieTextField.getText());


}

}
