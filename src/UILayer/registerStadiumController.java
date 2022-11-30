package UILayer;

import java.io.IOException;

import LogicLayer.Stadium;
import Runner.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class registerStadiumController {

    @FXML
    private Button registerButton;

    @FXML
    private Button returnButton;

    @FXML
    private TextField stadiumAddress;

    @FXML
    private TextField stadiumName;
    
    @FXML
    private TextField seats;

    @FXML
    private TextField ticket;

    @FXML
    void goBack(ActionEvent event) throws IOException 
    {
    	Main m = new Main();
    	m.changeScene("systemAdmin.fxml");
    }
    

    @FXML
    void registerStadium(ActionEvent event) 
    {
    	Stadium newStadium = new Stadium(stadiumName.getText(),stadiumAddress.getText(),Integer.valueOf( seats.getText()),Integer.valueOf(ticket.getText()),null);
    	newStadium.insertStadium();
    	stadiumName.clear();
    	stadiumAddress.clear();
    	seats.clear();
    	ticket.clear();
    }

}
