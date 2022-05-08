public class Student {
	private String fName, lName;
	private float tGrade1, tGrade2, tGrade3;
	
	public Student(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}
	public Student() {
		fName = "Not Set";
		lName = "Not Set";
	}
	
	public String getFName() {
		return fName;
	}
	public String getLName() {
		return lName;
	}
	public float getTGrade1() {
		return tGrade1;
	}
	public float getTGrade2() {
		return tGrade2;
	}
	public float getTGrade3() {
		return tGrade3;
	}
	
	public void setFName(String val) {
		fName = val;
	}
	public void setLName(String val) {
		lName = val;
	}
	public void setTGrade1(float val) {
		tGrade1 = val;
	}
	public void setTGrade2(float val) {
		tGrade2 = val;
	}
	public void setTGrade3(float val) {
		tGrade3 = val;
	}
	
	public boolean equals(Student that) {
        if(this.calAvrg() == that.calAvrg()) {
            return true;
        }
        return false;
    }
	public float calAvrg() {
		return ((tGrade1 + tGrade2 + tGrade3) / 3);
	}
	
	
	public String toString() {
		return String.format("Student {fName: %s, lName: %s, tGrade1: %f, tGrade2: %f, tGrade3: %f}", 
								fName,
								lName,
								tGrade1,
								tGrade2,
								tGrade3);
	}
}	