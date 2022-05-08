//Ruben Gonzalez
//Michael Madrigal
//ITSE 1302-002
//7/11/2017
//Quiz9

public class DogDriver {
	public static void main(String[] args) {
		Dog myDog = new Dog("notSet", "notSet", 1);
		
		myDog.setAge(7);
		myDog.setName("Leo");
		myDog.setBreed("Corgi");
		
		System.out.println("Dog name: " + myDog.getName());
		System.out.println("Dog breed: " + myDog.getBreed());
		System.out.println("Dog age: " + myDog.getAge() + "\n");
		
		System.out.println(myDog);
		
		
	}
}