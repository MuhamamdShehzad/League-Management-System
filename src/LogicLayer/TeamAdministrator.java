package LogicLayer;

import java.io.IOException;

import DBLayer.SQLHandler;
import Runner.Main;


public class TeamAdministrator 
{
	private int id;
	private String fName;
	private String lName;
	private String passWord;
	
	public TeamAdministrator(int id, String fName, String lName, String passWord) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.passWord = passWord;
	}
	
	public void loadScreen() throws IOException
	{
//		System.out.println("In load screen function");
//		Stage stg = new Stage();
//		Parent root = FXMLLoader.load(getClass().getResource("teamAdmin.fxml"));
//		//Scene scene = new Scene(root);
//		stg.getScene().setRoot(root);
//		stg.show();
		Main m = new Main();
		m.changeScene("teamAdmin.fxml");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	public boolean loginTeamAdmin() throws IOException
	{
    	SQLHandler obj = new SQLHandler();
    	boolean b= obj.loginTeamAdmin(this.id, this.passWord);
    	//System.out.println("Now what to do?");
    	return b;
	}
}
