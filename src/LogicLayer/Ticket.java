package LogicLayer;

import java.util.ArrayList;
import java.util.Date;

public class Ticket 
{
		//so this is a receipt for 
		private int ticketId;
		private Customer buyer; //buyer info
		private Date date;
		private ArrayList<Seat> seats;
		
		public Ticket(int ticketId, Customer buyer, Date date) {
			super();
			this.ticketId = ticketId;
			this.buyer = buyer;
			this.date = date;
			this.seats = new ArrayList<Seat>();
		}

		public int getTicketId() {
			return ticketId;
		}

		public void setTicketId(int ticketId) {
			this.ticketId = ticketId;
		}

		public Customer getBuyer() {
			return buyer;
		}

		public void setBuyer(Customer buyer) {
			this.buyer = buyer;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public ArrayList<Seat> getSeats() {
			return seats;
		}

		public void setSeats(ArrayList<Seat> seats) {
			this.seats = seats;
		}
		
		

		
		
}
