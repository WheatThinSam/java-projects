public class Rectangle {
    private float length;
    private float width;
     
    public Rectangle() {
        length = 0;
        width = 0;
    }
    public Rectangle(float l) {
        length = l;
        width = 0;
    }
    public Rectangle(float l, float w) {
        length = l;
        width = w;
    }
    public Rectangle(double w) {
        length = 0;
        width = (float)w;
    }
     
    public void setLength(float l){
        length = l;
    }
    public void setWidth(float w){
        width = w;
    }
    public void setWidth(double w){
        width = (float)w;
        length = -9;
        System.out.println("Hello there.");
    }
    public void setWidth(){
        width = -9999;
    }
    public float getLength(){
        return length;
    }
    public float getWidth() {
        return width;
    }
    public float getArea() {
        return length * width;
    }
    public float getPerimeter() {
        return 2*length + 2*width;
    }
    public String toString() {
        return String.format("Rectangle{length: %f, width: %f}", length, width);
    }
}