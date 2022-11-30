package DBLayer;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import LogicLayer.*;


public class DBTeam {

	private String usrname = "root";
	private String pass = "540@MySql";
	Connection con; // connection object
	

	public DBTeam() {
		// connect to DB
		try {
		 
			// university is the database name
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/league", usrname, pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean loginTeamAdmin(int id, String password) throws IOException
	{
		Statement stm;
		try 
		{
			stm = con.createStatement();
			String query = "Select * from TeamAdministrator where id="+id+" && passWord="+"'"+password+"'";
			ResultSet rs = stm.executeQuery(query);	
			rs.next();
			System.out.println("TeamAdmin Obtained");
			//load view of TeamAdmin screen
			//obj.loadScreen();
			return true;
		} catch(SQLException e)
		{
			//stack is being printed
			e.printStackTrace();
			return false;
		}

	}
	
	public boolean loginCustomer(int id, String password2)throws IOException {
		Statement stm;
		Customer obj = null;
		try 
		{
			stm = con.createStatement();
			String query = "Select * from customer where customerId="+id+" && passWord="+"'"+password2+"'";
			ResultSet rs = stm.executeQuery(query);	
			rs.next();
			obj = new Customer(rs.getInt("customerId"),rs.getString("passWord"),rs.getString("name"));
			System.out.println("Customer Obtained");
			
			//obj.loadScreen();
			return true;
		} catch(SQLException e)
		{
			//stack is being printed
			e.printStackTrace();
			return false;
		}
	}
	
	
    public boolean loginSystemAdmin(int id, String password2) throws IOException {
		
		Statement stm;
		SystemAdministrator obj = null;
		try 
		{
			stm = con.createStatement();
			String query = "Select * from SystemAdministrator where id="+id+" && passWord="+"'"+password2+"'";
			ResultSet rs = stm.executeQuery(query);	
			rs.next();
			obj = new SystemAdministrator(rs.getInt("id"),rs.getString("firstName"),rs.getString("lastName"),rs.getString("passWord"),null);
			System.out.println("SystemAdmin Obtained");
			//load view of TeamAdmin screen
			//obj.loadScreen();
			return true;
		} catch(SQLException e)
		{
			//stack is being printed
			e.printStackTrace();
			return false;
		}
	

	}
	
	
	
	public ArrayList<Team> readSTeams() {
		ArrayList<Team> T = new ArrayList<Team>();
		Statement stm;
		try {
			stm = con.createStatement();
			String query = "SELECT * FROM Team";
			ResultSet rs = stm.executeQuery(query);
			while (rs.next()) {
				Team s = new Team(rs.getInt(1),rs.getString(2), rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getInt(7) );
				T.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return T;
	}
	
	public boolean insertTeam(Team s) {
		try {
			String query="INSERT INTO Team (id, teamName,matchesPlayed,matchesWon,matchesLost,matchesDrawn,points) VALUES (?,?,?,?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, s.getTeamId());
			stmt.setString(2, s.getTeamName());
			stmt.setInt(3, s.getMatchesPlayed());
			stmt.setInt(4, s.getMatchesWon());
			stmt.setInt(5, s.getMatchesLost());
			stmt.setInt(6, s.getMatchesDrawn());
			stmt.setInt(7, s.getPoints());	
			int rows=stmt.executeUpdate();
			if (rows>0) {
				System.out.println("A Team was added...");
				return true;
			}
			return false;
			
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
	

	public boolean updateTeam(int id, String teamName, int matchesPlayed,int matchesWon,int matchesLost,int matchesDrawn,int points) {
		String query="UPDATE Team SET teamName=?, matchesPlayed=?, matchesWon=?, matchesLost=? matchesDrawn=? points=?  WHERE id=?";
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(7, id);
			ps.setString(1, teamName);
			ps.setInt(2, matchesPlayed);
			ps.setInt(3, matchesWon);
			ps.setInt(4, matchesLost);
			ps.setInt(5, matchesDrawn);
			ps.setInt(6, points);				
			int rows=ps.executeUpdate();
			if (rows>0) {
				System.out.println("Team was updated...");
				return true;
			}
			else {
				System.out.println("Error Occured!");	
				return false;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}	
	}
	public boolean deleteTeam(int id) {
		String query="DELETE FROM Team WHERE id=?";
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, id);

			int rows=ps.executeUpdate();
			if (rows>0) {
				System.out.println("A Team was deleted...");
				return true;
			}
			return false;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}		
	}
	public void closeConnection() {
		try {

			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
