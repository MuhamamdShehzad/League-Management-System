package UILayer;

import LogicLayer.CommentaryPanel;
import LogicLayer.Match;
import LogicLayer.Stadium;
import LogicLayer.Statistics;
import LogicLayer.Team;
import Runner.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;


import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class manageMatchesController {

	@FXML
    private TableColumn<Match, Stadium> StadiumID;

    @FXML
    private TableColumn<Match, Team> awayteam;

    @FXML
    private TableColumn<Match, String> date;

    @FXML
    private TableColumn<Match, Team> hometeam;

    @FXML
    private TableColumn<Match, Integer> matchid;

    @FXML
    private TableColumn<Match, CommentaryPanel> panelId;
    
    @FXML
    private TableColumn<Match, Statistics> statsId;
    
    @FXML
    private TextField textAwayID;

    @FXML
    private TextField textDateID;

    @FXML
    private TextField textHomeID;

    @FXML
    private TextField textMatchID;

    @FXML
    private TextField textPanelID;

    @FXML
    private TextField textStadiumID;

    @FXML
    private TextField textStatsID;
    

    @FXML
    private Button returnButton;

    @FXML
    private TableView<Match> tableView;

    @FXML
    void goBack(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("systemAdmin.fxml");
    }

    @FXML
    void removeCustomer(ActionEvent event) {

    }
    
    
    @FXML
    void submit(ActionEvent event) {

    }
    /*@FXML
    void submit(ActionEvent event) {
    	Team home= new Team(textHomeID.getText());
    	Team away= new Team(textAwayID.getText());
    	
    	
        Customer customer = new Customer(nameInput.getText(),
                Integer.parseInt(ageInput.getText()),
                Integer.parseInt(numberInput.getText()));
        ObservableList<Customer> customers = tableView.getItems();
        customers.add(customer);
        tableView.setItems(customers);
    }*/

}
