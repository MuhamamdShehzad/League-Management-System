package LogicLayer;

import DBLayer.SQLHandler;

public class TeamManagement //is the coach of the team
{
	private static int managerCount = 0;
	private int managerId;
	private String firstName;
	private String lastName;
	private String password;
	private int teamId;
	
	
	public TeamManagement(String firstName, String lastName, String password, int teamId) {
		super();
		managerCount++;
		this.managerId = managerCount;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.teamId = teamId;
	}

	public int getManagerId() {
		return managerId;
	}


	public void setManagerId(int managerId) {
		this.managerId = managerId;
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


	public int getTeamId() {
		return teamId;
	}


	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	
	public void insertTeamManager()
	{
	SQLHandler sql = new SQLHandler();
	sql.insertTeamManager(this.getTeamId(), this.getFirstName(), this.getLastName(), this.getPassword(), this.getTeamId());
	
	}
	
}
