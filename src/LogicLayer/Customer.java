package LogicLayer;

import java.io.IOException;

import DBLayer.SQLHandler;
import Runner.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Customer 
{
	private int customerId;
	private String passWord;
	private String name;
	
	public Customer(int id, String pass, String n){
		customerId=id;
		passWord=pass;
		name=n;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name=n;
	}

	
	public int getCustomerId() 
	{
		return customerId;
	}
	
	public void setCustomerId(int customerId) 
	{
		this.customerId = customerId;
	}
	
	public String getPassWord() 
	{
		return passWord;
	}
	
	public void setPassWord(String passWord) 
	{
		this.passWord = passWord;
	}
	
	 

	//can buy tickets 
	//can view points table
	public boolean logIn() throws IOException {
    	SQLHandler obj = new SQLHandler();
    	boolean b =obj.loginCustomer(this.customerId, this.passWord);
    	//System.out.println("Now what to do?");
    	return b;
	}
	
	
}
