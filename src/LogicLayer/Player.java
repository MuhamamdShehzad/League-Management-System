package LogicLayer;

import DBLayer.SQLHandler;

public class Player 
{
	private static int playerCount=0;
	private int playerId;
	private int age;
	private String fName;
	private String lName;
	private String hand;
	private String type;
	private boolean availability;
	private int teamId;
	
	Player(int a, String f, String l, String t ,String h) 
	{
		playerCount++;
		this.playerId = playerCount;
		this.age = a;
		this.fName = f;
		this.lName = l;
		this.type = t;
		this.hand = h;
		this.availability = true;
		this.teamId = -1;
	}
	
	
	public void registerPlayer()
	{
		
	}


	public int getPlayerId() {
		return playerId;
	}


	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
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


	public String getHand() {
		return hand;
	}


	public void setHand(String hand) {
		this.hand = hand;
	}


	public boolean isAvailability() {
		return availability;
	}


	public void setAvailability(boolean availability) {
		this.availability = availability;
	}


	public int getTeamId() {
		return teamId;
	}


	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	
	
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public void insertPlayer()
	{
	SQLHandler sql = new SQLHandler();
	sql.insertPlayer(this.getPlayerId(), this.getAge(), this.getfName(), this.getlName(), this.getType(), this.getHand());
	}
}
