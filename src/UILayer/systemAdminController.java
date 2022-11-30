package UILayer;

import java.io.IOException;

import Runner.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class systemAdminController {


    @FXML
    private Button manageStadiumButton;

    @FXML
    private Button matchesButton;

    @FXML
    private Button pointsTable;

    @FXML
    private Button registerCommentatorButton;

    @FXML
    private Button registerStadiumButton;

    @FXML
    private Button registerStaffButton;

    @FXML
    private Button returnButton;

    @FXML
    private Button scheduleButton;

    @FXML
    void goBack(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("mainScreen.fxml");
    }

    @FXML
    void manageMatches(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("manageMatches.fxml");
    }

    @FXML
    void manageStadium(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("manageStadium.fxml");
    }

    @FXML
    void registerCommentator(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("registerCommentator.fxml");
    }

    @FXML
    void registerStadium(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("registerStadium.fxml");
    }

    @FXML
    void registerStaff(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("registerStaff.fxml");
    }

    @FXML
    void scheduleMatches(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("scheduleMatches.fxml");
    }

    @FXML
    void viewPointsTable(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("viewPointsTable.fxml");
    }

    

}