//Ruben Gonzalez
//Michael Madrigal
//ITSE 1302-002
//7/13/17
//Quiz10

public class StudentObjects {
	public static void main(String[] args) {
	
	Student stud1 = new Student(123, "Tom", "Robinson");
	Address home = new Address();
	Address work = new Address();
	
	home.setStreet("323 eggranch");
	home.setCity("San Antonio");
	home.setState("Texas");
	home.setZipCode(12342);
	
	work.setStreet("984 wortcanyon");
	work.setCity("Dallas");
	work.setState("Texas");
	work.setZipCode(12342);
	
	stud1.setHomeAddress(home);
	stud1.setWorkAddress(work);
	
	System.out.println(stud1);
    System.out.println(stud1.getHomeAddress());
    System.out.println(stud1.getWorkAddressObj());
    System.out.println("Work zipcode is " + stud1.getWorkAddressObj().getZipCode());
    
    stud1.getHomeAddressObj().setZipCode(99999);
    System.out.println("\nHome zipcode is set to " + stud1.getHomeAddressObj().getZipCode());
    System.out.println("\n" + stud1.getHomeAddress());
	
	stud1.setStudentId(45324);
	stud1.setFirstName("Bob");
	stud1.setLastName("Gumfray");
	
	System.out.println(stud1);
	
	}
}
