public class GradeBook {
	
	
	
	
	private float asg1;
	private float asg2;
	private float asg3;
	private float tst1;
	private float tst2;
	private float asgAvg;
	private float tstAvg;
	
	public void setAsg1(float asdf) {
		if(asdf >= 0 && asdf <=100) {
		asg1 = asdf;
		
		}
	}
	
	public float getAsg1() {
		return asg1;
	}
	
	public String toString() {
		return "Ruben Gonzalez";
	}
}