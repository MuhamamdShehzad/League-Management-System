package UILayer;

import java.io.IOException;

import Runner.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class customerLoginController {

    @FXML
    private TextField customerId;

    @FXML
    private Button loginButton;

    @FXML
    private TextField passWord;

    @FXML
    private Button returnButton;

    @FXML
    void goBack(ActionEvent event) throws IOException 
    {
    	Main m = new Main();
    	m.changeScene("mainScreen.fxml");
    }

    @FXML
    void logIn(ActionEvent event) 
    {

    }
}
