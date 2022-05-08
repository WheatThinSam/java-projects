//Ruben Gonzalez
//Michael Madrigal
//ITSE 1302-002
//7/13/17
//Quiz10

public class Address {
	private String street, city, state;
	private int zipCode;
	
	public Address() {
		street = "street";
		city = "city";
		state = "state";
		zipCode = 0;
	}
	
	public String getStreet() {
		return street;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public int getZipCode() {
		return zipCode;
	}
	
	public void setStreet(String val) {
		street = val;
	}
	
	public void setCity(String val) {
		city = val;
	}
	
	public void setState(String val) {
		state = val;
	}
	
	public void setZipCode(int val) {
		zipCode = val;
	}
	
	public String getAddress() {
		return String.format("%s\n%s, %s %d", street, city, state, zipCode);
	}
	
	public String toString() {
		return String.format("Address{street: %s, city: %s, state %s, zip code: %d}"
							, street, city, state, zipCode);
	}
}