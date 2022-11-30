package LogicLayer;

import DBLayer.SQLHandler;

public class Commentator 
{
	private static int count=0;
	private int commentatorId;
	private String firstName;
	private String lastName;
	
	public Commentator(String firstName, String lastName) 
	{
		super();
		count++;
		this.commentatorId = count;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int getCommentatorId() 
	{
		return commentatorId;
	}
	public void setCommentatorId(int commentatorId) 
	{
		this.commentatorId = commentatorId;
	}
	public String getFirstName() 
	{
		return firstName;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	public String getLastName() 
	{
		return lastName;
	}
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public void insertCommentator() {
		SQLHandler sql = new SQLHandler();
		sql.insertCommentator(this.getCommentatorId(),this.getFirstName(), this.getLastName());
	}

	
	
	
}
