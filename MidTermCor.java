public class MidTermCor {
	public static void main(String[] args) {
		/*Rectangle r1 = new Rectangle(4,2);
		Rectangle r2 = new Rectangle();
		double result = r2.getArea(2);
		r1.setLength(2);
		
		if(r1.equals(r2)) {
			result += 10;
		}
		
		System.out.println(result);
	}*/
		
		Rectangle r1 = new Rectangle(3,3);
		Rectangle r2 = new Rectangle(2,2);
		double result = 3;
		
		result = r1.getPerimeter() + r1.compareTo(r2) * (4 / r2.compareTo(r1));
		System.out.println(result);
}
}