package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class Controller
{


     @FXML
             private TextField userGuess;

     @FXML
      private Label correctGuess;

     @FXML
     private Label incorrectGuess;


     public void guessEvent(ActionEvent event){

         Random random =  new Random();
         int randNumb = random.nextInt(10)+1;

         String  g = userGuess.getText();

         try{
         int convertAnswer = Integer.valueOf(g);
         if (randNumb == convertAnswer)
         {
             correctGuess.setText("Valio atspejai" + randNumb);
             incorrectGuess.setText("");
         }
         else
         {
             incorrectGuess.setText("Deja neatspejai" + randNumb);
             correctGuess.setText("");
         }
         }catch(NumberFormatException e) {
             Alert alert = new Alert(Alert.AlertType. ERROR);
             alert.setContentText("Ivestas ne skaicius juk ir pats zinai");
             userGuess.setText("");
             alert.show();
         }





     }



}
