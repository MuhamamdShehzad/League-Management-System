package UILayer;

import java.io.IOException;

import Runner.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class teamAdminController 
{
	

    @FXML
    private Button returnButton;

    @FXML
    void goBack(ActionEvent event) throws IOException 
    {
    	Main m = new Main();
    	m.changeScene("mainScreen.fxml");
    }
    
    @FXML
    void registerCoach(ActionEvent event) throws IOException 
    {
    	System.out.println("Button Pressed");
    	Main m = new Main();
    	m.changeScene("RegisterTeamManager.fxml");
    }

    @FXML
    void registerPlayer(ActionEvent event) throws IOException 
    {
    	System.out.println("Button Pressed");
    	Main m = new Main();
    	m.changeScene("RegisterPlayer.fxml");
    }

    @FXML
    void registerTeam(ActionEvent event) throws IOException {
    	System.out.println("Button pressed");
    	Main m = new Main();
    	m.changeScene("RegisterTeam.fxml");
    }

}
