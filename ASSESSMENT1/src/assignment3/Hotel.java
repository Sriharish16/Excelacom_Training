package assignment3;

public class Hotel {
	
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String hotelName;
	private int noOfTables;
	private int noOfServants;
	public Hotel(String hotelName, int noOfTables, int noOfServants) {
		super();
		this.hotelName = hotelName;
		this.noOfTables = noOfTables;
		this.noOfServants = noOfServants;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getNoOfTables() {
		return noOfTables;
	}
	public void setNoOfTables(int noOfTables) {
		this.noOfTables = noOfTables;
	}
	public int getNoOfServants() {
		return noOfServants;
	}
	public void setNoOfServants(int noOfServants) {
		this.noOfServants = noOfServants;
	}
	
		}
	
