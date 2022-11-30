package UILayer;

import java.io.IOException;

import LogicLayer.TeamManagement;
import Runner.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class registerTeamManagerController {

    @FXML
    private TextField ManagerId;

    @FXML
    private TextField fName;

    @FXML
    private TextField lName;

    @FXML
    private TextField pass;

    @FXML
    private TextField teamId;
    
    @FXML
    private Button returnButton;

    @FXML
    void goBack(ActionEvent event) throws IOException 
    {
    	Main m = new Main();
    	m.changeScene("teamAdmin.fxml");
    }

    @FXML
    void registerTeamManager(ActionEvent event) 
    {	
    	TeamManagement newTeamManager = new TeamManagement(fName.getText(), lName.getText(), pass.getText(), Integer.valueOf(teamId.getText()));
    	newTeamManager.insertTeamManager();
    	fName.clear();
    	lName.clear();
    	pass.clear();
    	teamId.clear();
    }

}