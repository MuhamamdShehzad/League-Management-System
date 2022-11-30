package LogicLayer;

import java.util.ArrayList;

import DBLayer.SQLHandler;

public class Stadium 
{
	private static int count=0;
	private int stadiumId;
	private String stadiumName;
	private String stadiumAddress;
	private ArrayList<Seat> stadiumSeats;
	private ArrayList<Staff> stadiumStaff;
	
	public Stadium(String stadiumName, String stadiumAddress, int no,double ticket, ArrayList<Staff> stadiumStaff) {
		super();
		count++;
		this.stadiumId = count;
		this.stadiumName = stadiumName;
		this.stadiumAddress = stadiumAddress;
		this.stadiumStaff = stadiumStaff;
		this.stadiumSeats= new ArrayList<Seat>();
		/*for (int i=0;i<no;i++) {
			Seat S= new Seat(ticket,count);
			stadiumSeats.add(S);
		}*/
	}
 
	
	public int getStadiumId() {
		return stadiumId;
	}

	public void setStadiumId(int stadiumId) {
		this.stadiumId = stadiumId;
	}

	public String getStadiumName() {
		return stadiumName;
	}

	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}

	public ArrayList<Seat> getStadiumSeats() {
		return stadiumSeats;
	}

	public void setStadiumSeats(ArrayList<Seat> stadiumSeats) {
		this.stadiumSeats = stadiumSeats;
	}

	public ArrayList<Staff> getStadiumStaff() {
		return stadiumStaff;
	}

	public void setStadiumStaff(ArrayList<Staff> stadiumStaff) {
		this.stadiumStaff = stadiumStaff;
	}

	public String getStadiumAddress() {
		return stadiumAddress;
	}

	public void setStadiumAddress(String stadiumAddress) {
		this.stadiumAddress = stadiumAddress;
	}
	
	public void insertStadium()
	{
		SQLHandler sql = new SQLHandler();
		sql.insertStadium(this.getStadiumId(),this.getStadiumName(),this.getStadiumAddress());
		
	}
}
