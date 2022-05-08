//Ruben Gonzalez
//Michael Madrigal
//ITSE 1302-002
//7/13/17
//Quiz10

public class Student {
	private int studentId;
	private String firstName, lastName;
	
	
	//uses our own address objects
	private Address homeAddress, workAddress;
	
	public Student(int id, String fName, String lName) {
		studentId = id;
		firstName = firstName;
		lastName = lastName;
		
		//instantiates address
		homeAddress = new Address();
		workAddress = new Address();
	}
	
	//TODO - create getters and setters for studentId, firstName, lastName
	
	//Read data from a passed in Address object and copy data to homeAddress
	public void setHomeAddress(Address address) {
		homeAddress.setStreet(address.getStreet());
		homeAddress.setCity(address.getCity());
		homeAddress.setState(address.getState());
		homeAddress.setZipCode(address.getZipCode());
	}
	
	//Read data from a passed in Address object and copy data to workAddress
	public void setWorkAddress(Address address) {
		workAddress.setStreet(address.getStreet());
		workAddress.setCity(address.getCity());
		workAddress.setState(address.getState());
		workAddress.setZipCode(address.getZipCode());
	}
	
	//Return the entire homeAddress object
	public Address getHomeAddressObj() {
		return homeAddress;
	}
	
	//Return the entire workAddress object
	public Address getWorkAddressObj() {
		return workAddress;
	}
	
	//return the nice looking string from the homeAddress object
	public String getHomeAddress() {
		return homeAddress.getAddress();
	}
	//return the nice looking string from the workAddress object
	public String getWorkAddress() {
		return workAddress.getAddress();
	}
	
	public String toString() {
		return String.format("Student{id: %d, firstName: %s, lastName: %s}"
							, studentId, firstName, lastName);
	}
	
}