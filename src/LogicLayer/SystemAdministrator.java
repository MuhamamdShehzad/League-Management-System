package LogicLayer;

import java.io.IOException;

import DBLayer.SQLHandler;
import Runner.Main;

public class SystemAdministrator 
{
	private int id;
	private String firstName;
	private String lastName;
	private String password;
	private League myLeague;
	//private staffList 
	
	public SystemAdministrator(int id, String fName, String lName, String password, League myLeague) 
	{
		super();
		this.id = id;
		this.firstName = fName;
		this.lastName = lName;
		this.password = password;
		this.myLeague = myLeague;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public League getMyLeague() {
		return myLeague;
	}

	public void setMyLeague(League myLeague) {
		this.myLeague = myLeague;
	}

	public boolean logIn() throws IOException {
    	SQLHandler obj = new SQLHandler();
    	boolean b =obj.loginSystemAdmin(this.id, this.password);
    	//System.out.println("Now what to do?");
    	return b;
	}

	public void loadScreen() throws IOException {
		Main m = new Main();
		m.changeScene("systemAdmin.fxml");
	}
	
	
	
	
}


