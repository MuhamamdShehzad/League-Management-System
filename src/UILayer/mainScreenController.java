package UILayer;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import LogicLayer.Customer;
import LogicLayer.SystemAdministrator;
import LogicLayer.TeamAdministrator;
import Runner.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class mainScreenController implements Initializable{

		//private static Stage stage;
	@FXML
    private ComboBox<String> comboBox;
	    @FXML
	    private Button customerLogin;
	    @FXML
	    private Button exitSystem;
	    @FXML
	    private Label selection;
	    @FXML
	    private Button systemAdminLogin;

	    @FXML
	    private Button teamAdminLogin;
	    
	    @FXML
	    private Label confirmation;
	    
	    @FXML
	    private TextField passWord;
	    @FXML
	    private TextField adminId;

	    @FXML
	    void exitSystem(ActionEvent event) 
	    {
	    	System.out.println("Exiting system. Goodbye");
	    	Stage stage = (Stage) exitSystem.getScene().getWindow();
	    	stage.close();
	    }

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			String [] items= {"System Admin","Team Admin", "Customer"};
		
			comboBox.getItems().addAll(items);
			comboBox.setOnAction(event ->{
				String data= comboBox.getSelectionModel().getSelectedItem().toString();
				selection.setText(data);
			});
			
			}
		
		 @FXML
		    void logIn(ActionEvent event) throws IOException {
			 
			 String Text= selection.getText();
			 String Id=adminId.getText();
			 String Pass= passWord.getText();
			 if(Text=="" || Id=="" || Pass=="") {
				 confirmation.setText("Please enter details!");
				 
			 }
			 else if(Text=="System Admin") {
				 
				 SystemAdministrator newSysAdmin = new SystemAdministrator(Integer.valueOf(adminId.getText()), null, null, passWord.getText(), null);
			     boolean b= newSysAdmin.logIn();
			     if(b) {
			    	 confirmation.setText("Login Successful!");
			    	 Main m = new Main();
				     m.changeScene("systemAdmin.fxml");
			     }
			     else
			     {
			    	 confirmation.setText("Login Not Successful!");
			     }
			     adminId.clear();
			     passWord.clear();
			 }
			 else if(Text=="Team Admin") {
				TeamAdministrator newTeamAdmin = new TeamAdministrator(Integer.valueOf(adminId.getText()), null, null, passWord.getText());
				boolean b= newTeamAdmin.loginTeamAdmin();
				if(b) {
					confirmation.setText("Login Successful!");
					Main m = new Main();
				    m.changeScene("TeamAdmin.fxml");
				}
				else {
					confirmation.setText("Login Not Successful!");	
				}
				adminId.clear();
			     passWord.clear();
				 
			 }
			 else if (Text=="Customer") {
				 Customer newCustomer = new Customer(Integer.valueOf(adminId.getText()),passWord.getText(),"");
				 boolean b= newCustomer.logIn();
					if(b) {
						confirmation.setText("Login Successful!");
						Main m = new Main();
					    m.changeScene("customer.fxml");
					}
					else {
						confirmation.setText("Login Not Successful!");	
					}
					adminId.clear();
				    passWord.clear();
			 }
			 
		 }
		 
		 
   }

		
