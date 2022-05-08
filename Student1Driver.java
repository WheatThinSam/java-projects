public class Student1Driver {
	public static void main(String[] args) {
		
		Student1 stud1 = new Student1();
		Student1 stud2 = new Student1();
		
		stud1.setFName("Bob");
		stud1.setLName("Parsley");
		stud1.setTGrade1(50);
		stud1.setTGrade2(75);
		stud1.setTGrade3(100);
		
		stud2.setFName("Bob");
		stud2.setLName("Parsley");
		stud2.setTGrade1(50);
		stud2.setTGrade2(75);
		stud2.setTGrade3(100);
		
		System.out.println("First name: " + stud1.getFName());
		System.out.println("Last name: " + stud1.getLName());
		System.out.println("Average: " + stud1.calAvrg());
		System.out.println("stud1 and stud2 are equal: " + stud1.equals(stud2));
		
		System.out.println(stud1);
		System.out.println(stud2);
	}
}
