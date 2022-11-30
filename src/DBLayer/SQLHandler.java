package DBLayer;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import LogicLayer.Customer;
import LogicLayer.SystemAdministrator;
import LogicLayer.Team;
import LogicLayer.TeamAdministrator;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class SQLHandler 
{
	private String username = "root";
	private String password = "540@MySql";
	private Connection con;
	
	public SQLHandler() 
	{
		super();
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/league",username,password);
			System.out.println("Connection successful\n");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Connection failed");
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
	
	public void insertTeam(int id, String teamName)
	{
		Statement stm;
		try 
		{
			stm = con.createStatement();
			String values = "("+id+","+"'"+teamName+"'"+")"; 
			String query = "INSERT into Team Values" +values;
			stm.executeUpdate(query);
			System.out.println("Team Insertion completed.\n");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insertPlayer(int playerId, int age, String firstName, String lastName, String type, String hand)
	{
		Statement stm;
		try 
		{
			stm = con.createStatement();
			String values = "("+playerId+","+age+","+"'"+firstName+"'"+","+"'"+lastName+"'"+","+"'"+type+"'"+","+"'"+hand+"'"+")"; 
			String query = "INSERT into Player Values" +values;
			stm.executeUpdate(query);
			System.out.println("Player Insertion completed.\n");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public void insertTeamManager(int mId, String fName, String lName, String pass,int teamId)
	{
		Statement stm;
		try 
		{
			stm = con.createStatement();
			String values = "("+mId+","+"'"+fName+"'"+","+"'"+lName+"'"+","+"'"+pass+"'"+","+teamId+")"; 
			String query = "INSERT into TeamManager Values" +values;
			stm.executeUpdate(query);
			System.out.println("Team Manager inserted.\n");
		} catch (SQLException e) {
			e.printStackTrace();
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
	
	
	public void insertStadium(int stadiumId, String stadiumName, String stadiumAddress) {
		Statement stm;
		try 
		{
			stm = con.createStatement();
			String values = "("+stadiumId+","+"'"+stadiumName+"'"+","+"'"+stadiumAddress+"'"+")"; 
			String query = "INSERT into Stadium Values" +values;
			stm.executeUpdate(query);
			System.out.println("Stadium Inserted.\n");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insertStaffMember(int staffId, String firstName, String lastName, String role) 
	{
		Statement stm;
		try 
		{
			stm = con.createStatement();
			String values = "("+staffId+","+"'"+firstName+"'"+","+"'"+lastName+"'"+","+"'"+role+"'"+","+null+")"; 
			String query = "INSERT into Staff Values" +values;
			stm.executeUpdate(query);
			System.out.println("Staff Inserted.\n");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insertCommentator(int commentatorId, String firstName, String lastName) {
		Statement stm;
		try 
		{
			stm = con.createStatement();
			String values = "("+commentatorId+","+"'"+firstName+"'"+","+"'"+lastName+"'"+")"; 
			String query = "INSERT into Commentator Values" +values;
			stm.executeUpdate(query);
			System.out.println("Commentator Inserted.\n");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public boolean insertSeat(int seatid, double ticket,int stadiumId,boolean seatAvailable) {
		Statement stm;
		try 
		{
			stm = con.createStatement();
			String values = "("+seatid+","+"'"+ticket+"'"+","+"'"+stadiumId+"'"+","+"'"+seatAvailable+"'"+")"; 
			String query = "INSERT into Seat Values" +values;
			stm.executeUpdate(query);
			System.out.println("Seat Inserted.\n");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	public int get_id(String table) {
		Statement stm;
		try 
		{
			stm = con.createStatement();
			String query = "SELECT MAX(id) FROM "+table;
			System.out.println("Query: "+ query);
			ResultSet rs = stm.executeQuery(query);
			rs.next();
			System.out.print("ID: " + rs.getInt("id"));
						
			return 1;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}
	public ObservableList<Team> getAllTeams()
	{
		ObservableList<Team> teams = FXCollections.observableArrayList();
		Statement stm;
		try {
			stm = con.createStatement();
			String query = "SELECT * FROM Team";
			ResultSet rs = stm.executeQuery(query);
			while(rs.next())
			{
				Team obj = new Team(rs.getInt("teamId"),rs.getString("teamName"),rs.getInt("matchesPlayed"),rs.getInt("matchesWon"),rs.getInt("matchesLost"),rs.getInt("matchesDrawn"),rs.getInt("points"));
				//obj.toString();
				//System.out.println(obj.getId()+" "+obj.getFirstName()+" "+obj.getLastName());
				//System.out.println(obj.toString());
				teams.add(obj);
			}
			return teams;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
