package UILayer;

import java.io.IOException;

import LogicLayer.Staff;
import Runner.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class registerStaffController {

    @FXML
    private TextField fname;

    @FXML
    private TextField lname;

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
    void registerStaff(ActionEvent event) 
    {
    	Staff newStaffMember = new Staff(fname.getText(),lname.getText(),role.getText());
    	newStaffMember.insertStaffMember();
    	fname.clear();
    	lname.clear();
    	role.clear();
    }
}
