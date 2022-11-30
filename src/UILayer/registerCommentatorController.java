package UILayer;

import java.io.IOException;

import LogicLayer.Commentator;
import Runner.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class registerCommentatorController {

    @FXML
    private TextField fName;
    
    @FXML
    private TextField lName;    

    @FXML
    private Button registerButton;

    @FXML
    private Button returnButton;

    @FXML
    private TextField role;

    @FXML
    void goBack(ActionEvent event) throws IOException 
    {
    	Main m = new Main();
    	m.changeScene("systemAdmin.fxml");
    }

    @FXML
    void registerCommentator(ActionEvent event) 
    {
    	Commentator newCommentator = new Commentator(fName.getText(), lName.getText());
    	newCommentator.insertCommentator();
    	fName.clear();
    	lName.clear();
    }

}
