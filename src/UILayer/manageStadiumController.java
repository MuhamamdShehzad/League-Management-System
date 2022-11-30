package UILayer;

import java.io.IOException;

import Runner.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class manageStadiumController {
	@FXML
    private Button refreshButton;

    @FXML
    private Button returnButton;

    @FXML
    private TextField stadiumId;

    @FXML
    void goBack(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("systemAdmin.fxml");
    }

    @FXML
    void refreshPage(ActionEvent event) {

    }
	
	
}
