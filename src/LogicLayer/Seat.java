package LogicLayer;

import DBLayer.SQLHandler;

public class Seat 
{
	private int seatId;
	private double ticketPrice;
	private boolean available;
	private static int count=0;
	
	public Seat() {
		
	}
	public Seat(double ticketPrice,int c) {
		super();
		count++;
		this.seatId = count;
		this.ticketPrice = ticketPrice;
		this.available=true;
		//insertdb(c);
	}

	private void insertdb(int c) {
		SQLHandler sql = new SQLHandler();
		sql.insertSeat(this.seatId,this.ticketPrice,c, this.available);
		
	}

	
	public int getSeatId() {
		return seatId;
	}

	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
}
