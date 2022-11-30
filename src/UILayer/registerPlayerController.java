package UILayer;

import java.io.IOException;

import LogicLayer.Player;
import LogicLayer.WicketKeeper;
import Runner.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import LogicLayer.AllRounder;
import LogicLayer.Batsman;
import LogicLayer.Bowler;

public class registerPlayerController {

    @FXML
    private TextField age;

    @FXML
    private RadioButton allRounder;

    @FXML
    private RadioButton bowler;

    @FXML
    private RadioButton batsman;
    
    @FXML
    private TextField firstName;

    @FXML
    private TextField hand;

    @FXML
    private TextField lastName;

    @FXML
    private TextField playerId;
    
    private String type; 
    
    @FXML
    private RadioButton wicketKeeper;

    @FXML
    private Button returnButton;
    
    @FXML
    void registerPlayer(ActionEvent event) 
    {
//    SQLHandler sql = new SQLHandler();
//   	sql.insertPlayer(Integer.valueOf(playerId.getText()), Integer.valueOf(age.getText()), firstName.getText(), lastName.getText(), type, hand.getText());
   	
   	if(type.equals("AllRounder"))
   	{
   	Player p = new AllRounder(Integer.valueOf(age.getText())+1, firstName.getText(), lastName.getText(), type, hand.getText());
   	p.insertPlayer();
   	}
   	else if(type.equals("WicketKeeper"))
   	{
   	Player p = new WicketKeeper(Integer.valueOf(age.getText())+1, firstName.getText(), lastName.getText(), type, hand.getText());
   	p.insertPlayer();
   	}
   	else if(type.equals("Batsman"))
   	{
   	Player p = new Batsman(Integer.valueOf(age.getText())+1, firstName.getText(), lastName.getText(), type, hand.getText());
   	p.insertPlayer();
   	}
   	else if(type.equals("Bowler"))
   	{
   	Player p = new Bowler(Integer.valueOf(age.getText())+1, firstName.getText(), lastName.getText(), type, hand.getText());
   	p.insertPlayer();
   	}

   	playerId.clear();
   	age.clear();
   	firstName.clear();
   	lastName.clear();
   	hand.clear();
   	
    }
    

	@FXML
    void returnAllRounder(ActionEvent event) {
    	type = "AllRounder";
    }

    @FXML
    void returnBatsman(ActionEvent event) {
    	type = "Batsman";
    }

    @FXML
    void returnBowler(ActionEvent event) {
    	type = "Bowler";
    }
    
    @FXML
    void returnWicketKeeper(ActionEvent event) {
    	type = "WicketKeeper";
    }

    @FXML
    void goBack(ActionEvent event) throws IOException 
    {
    	Main m = new Main();
    	m.changeScene("teamAdmin.fxml");
    	
    }
}