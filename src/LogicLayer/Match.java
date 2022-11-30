package LogicLayer;

public class Match 
{
	private int matchId;
	private Team homeTeam;
	private Team awayTeam;
	private Stadium matchStadium;
	private CommentaryPanel matchPanel;
	private Statistics matchStatistics;
	
	public Match(int matchId, Team homeTeam, Team awayTeam, Stadium matchStadium, CommentaryPanel matchPanel,
			Statistics matchStatistics) {
		super();
		this.matchId = matchId;
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
		this.matchStadium = matchStadium;
		this.matchPanel = matchPanel;
		this.matchStatistics = matchStatistics;
	}

	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public Team getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(Team homeTeam) {
		this.homeTeam = homeTeam;
	}

	public Team getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(Team awayTeam) {
		this.awayTeam = awayTeam;
	}

	public Stadium getMatchStadium() {
		return matchStadium;
	}

	public void setMatchStadium(Stadium matchStadium) {
		this.matchStadium = matchStadium;
	}

	public CommentaryPanel getMatchPanel() {
		return matchPanel;
	}

	public void setMatchPanel(CommentaryPanel matchPanel) {
		this.matchPanel = matchPanel;
	}

	public Statistics getMatchStatistics() {
		return matchStatistics;
	}

	public void setMatchStatistics(Statistics matchStatistics) {
		this.matchStatistics = matchStatistics;
	}
	
	
}
