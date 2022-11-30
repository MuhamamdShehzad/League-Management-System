package LogicLayer;

import DBLayer.SQLHandler;

public class Staff 
{
	private static int count;
	private int staffId;
	private String firstName;
	private String lastName;
	private String role;
	
	public Staff(String firstName, String lastName, String role) {
		super();
		get_id();
		count++;
		this.staffId = count;
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
	}

	private void get_id() {
		SQLHandler sql = new SQLHandler();
		sql.get_id("Staff");
		
	}

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void insertStaffMember() {
		SQLHandler sql = new SQLHandler();
		sql.insertStaffMember(this.getStaffId(),this.getFirstName(),this.getLastName(),this.getRole());
		
		
	}
	
	
	
}
