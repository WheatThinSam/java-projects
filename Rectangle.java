

public class Rectangle implements Comparablex{
	public final int NUM_OF_SIDES = 4;
    private double length;
    private double width;
     
    public Rectangle() {
        length = 2;
        width = 2;
    }
    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public void setLength(double l){
        length = l;
    }
	
    public void setWidth(double w){
        width = w;
    }
	
    public double getLength(){
        return length;
    }
	
    public double getWidth() {
        return width;
    }
	
    public double getArea() {
        return length * width;
    }
	
	public double getArea(double val) {
		return length * width * val;
	}
	
    public double getPerimeter() {
        return 2*length + 2*width;
    }
	
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle that = (Rectangle) obj;
			if(this.length == that.length && this.width == that.width) {
				return true;
			}
		}
		return false;
	}
	
	public int compareTo(Object obj){
		if(obj instanceof Rectangle) {
			Rectangle that = (Rectangle)obj;
			double diff = this.getArea() - that.getArea();
			if(Math.abs(diff) <= .001) {
				return 0;
			} else if(diff > 0) {
				return 1;
			}else {
				return -1;
			}
		}
		return 1;
	}
    public String toString() {
        return String.format("Rectangle{length: %f, width: %f}", length, width);
    }
}