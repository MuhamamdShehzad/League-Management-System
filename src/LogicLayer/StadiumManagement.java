package LogicLayer;

public class StadiumManagement 
{
	//this person is the owner of the stadium
	//this person has the stadium id
	private int managerId;
	private String firstName;
	private String lastName;
	private String passWord;
	private int stadiumId;
	
	public StadiumManagement(int managerId, String firstName, String lastName, String passWord, int stadiumId) {
		super();
		this.managerId = managerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.passWord = passWord;
		this.stadiumId = stadiumId;
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
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public int getStadiumId() {
		return stadiumId;
	}
	public void setStadiumId(int stadiumId) {
		this.stadiumId = stadiumId;
	}
	
	
}
