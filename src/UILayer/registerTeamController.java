package UILayer;

import java.io.IOException;

import LogicLayer.Team;
import Runner.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class registerTeamController 
{
    @FXML
    private Button returnButton;
    

    @FXML
    private TextField teamName;

    
    @FXML
    void goBack(ActionEvent event) throws IOException 
    {
    	Main m = new Main();
    	m.changeScene("teamAdmin.fxml");
    }
    
    @FXML
    void insertTeam(ActionEvent event) 
    {
    	//save the inserted student into the DB
    	
    	Team newTeam = new Team(teamName.getText());
    	newTeam.insertTeam();
    	teamName.clear();
    }
}
