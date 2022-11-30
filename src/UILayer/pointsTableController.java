package UILayer;

import java.io.IOException;

import DBLayer.SQLHandler;
import LogicLayer.Team;
import Runner.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class pointsTableController 
{

	    @FXML
	    private TableColumn<Team, Integer> matchesLost;

	    @FXML
	    private TableColumn<Team, Integer> matchesPlayed;

	    @FXML
	    private TableColumn<Team, Integer> matchesWon;

	    @FXML
	    private TableColumn<Team, Integer> points;

	    @FXML
	    private Button returnButton;

	    @FXML
	    private TableColumn<Team, Integer> teamId;

	    @FXML
	    private TableColumn<Team, String> teamName;
	    
	    @FXML
	    private TableColumn<Team, Integer> matchesDrawn;

	    @FXML
	    private TableView<Team> teamTableView;

	    
	    
	    @FXML
	    void goBack(ActionEvent event) throws IOException 
	    {
	    	Main m = new Main();
	    	m.changeScene("systemAdmin.fxml");
	    }
	    
		@FXML
		void initialize() 
		{
//		    assert matchesLost != null : "fx:id=\"matchesLost\" was not injected: check your FXML file 'viewPointsTable.fxml'.";
//		    assert matchesPlayed != null : "fx:id=\"matchesPlayed\" was not injected: check your FXML file 'viewPointsTable.fxml'.";
//		    assert matchesWon != null : "fx:id=\"matchesWon\" was not injected: check your FXML file 'viewPointsTable.fxml'.";
//		    assert points != null : "fx:id=\"points\" was not injected: check your FXML file 'viewPointsTable.fxml'.";
//		    assert returnButton != null : "fx:id=\"returnButton\" was not injected: check your FXML file 'viewPointsTable.fxml'.";
//		    assert teamId != null : "fx:id=\"teamId\" was not injected: check your FXML file 'viewPointsTable.fxml'.";
//		    assert teamName != null : "fx:id=\"teamName\" was not injected: check your FXML file 'viewPointsTable.fxml'.";
//		    assert teamTableView != null : "fx:id=\"teamTableView\" was not injected: check your FXML file 'viewPointsTable.fxml'.";

			ObservableList<Team> teams = FXCollections.observableArrayList();
			SQLHandler sql = new SQLHandler();
			teams = sql.getAllTeams();
			teamId.setCellValueFactory(new PropertyValueFactory<Team, Integer>("teamId"));
			teamName.setCellValueFactory(new PropertyValueFactory<Team, String>("teamName"));
			matchesPlayed.setCellValueFactory(new PropertyValueFactory<Team, Integer>("matchesPlayed"));
			matchesWon.setCellValueFactory(new PropertyValueFactory<Team, Integer>("matchesWon"));
			matchesLost.setCellValueFactory(new PropertyValueFactory<Team, Integer>("matchesLost"));
			matchesDrawn.setCellValueFactory(new PropertyValueFactory<Team, Integer>("matchesDrawn"));
			points.setCellValueFactory(new PropertyValueFactory<Team, Integer>("points"));
			teamTableView.setItems(teams);
		}
	    
	    

}

