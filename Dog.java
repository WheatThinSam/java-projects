//Ruben Gonzalez
//Michael Madrigal
//ITSE 1302-002
//7/11/2017
//4.4

public class Dog {
	private String name, breed;
	private int age;
	
	public Dog(String n, String b, int a) {
		name = n;
		breed = b;
		age = a;
	}
	public Dog() {
		name = "name";
		breed = "breed";
		age = 0;
	}
	
	public void setName(String val) {
		name = val;
	}
	public void setBreed(String val) {
		breed = val;
	}
	public void setAge(int val) {
		age = val;
	}
	
	public String getName() {
		return name;
	}
	public String getBreed() {
		return breed; 
	}
	public int getAge() {
		return age;
	}
	
	public int calHumanAge() {
		return (age * 7);
	}
	
	public String toString() {
	return String.format("Dog {name: %s, breed: %s, age: %d}",
				name,
				breed,
				age);
	}
		
}
	