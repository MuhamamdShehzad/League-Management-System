package LogicLayer;

import DBLayer.DBTeam;
import DBLayer.SQLHandler;


public class Team 
{
	private static int teamCount = 0;
	private int teamId;
	private String teamName;
	private int matchesPlayed;
	private int matchesWon;
	private int matchesLost;
	private int matchesDrawn;
	private int points;
	
	public DBTeam db;
	
	public Team(int teamId, String teamName, int matchesPlayed, int matchesWon, int matchesLost, int matchesDrawn, int points) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.matchesPlayed = matchesPlayed;
		this.matchesWon = matchesWon;
		this.matchesLost = matchesLost;
		this.setMatchesDrawn(matchesDrawn);
		this.points = points;
	}
	
	public Team(String teamName) {
		super();
		teamCount++;
		this.teamId = teamCount;
		this.teamName = teamName;
		matchesPlayed = 0;
		matchesWon = 0;
		matchesLost = 0;
	}

	public int getMatchesDrawn() {
		return matchesDrawn;
	}

	public void setMatchesDrawn(int matchesDrawn) {
		this.matchesDrawn = matchesDrawn;
	}
	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public void insertTeam()
	{
	SQLHandler db = new SQLHandler();
	db.insertTeam(this.teamId, this.teamName);
	System.out.println("Team Inserted into the DB");
	}

	public int getMatchesPlayed() {
		return matchesPlayed;
	}

	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}

	public int getMatchesWon() {
		return matchesWon;
	}

	public void setMatchesWon(int matchesWon) {
		this.matchesWon = matchesWon;
	}

	public int getMatchesLost() {
		return matchesLost;
	}

	public void setMatchesLost(int matchesLost) {
		this.matchesLost = matchesLost;
	}
	
	public boolean insertTeam2() {
		
		boolean b =db.insertTeam(new Team(this.teamName));
		return b;
		
	}
	
	
}
