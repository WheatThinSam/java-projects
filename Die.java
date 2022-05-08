public class Die {
    public final int MAX = 6;
    private int faceValue;
     
    public Die() {
        faceValue = 1;
    }
     
    public int getFaceValue() {
        return faceValue;
    }
     
    public void setFaceValue(int val) {
        if(val >= 1 && val <= MAX) {
            faceValue = val;
        }
    }
     
    public void roll() {
        faceValue = (int)(Math.random() * MAX) + 1;
    }
     
    public String toString() {
        return String.format("Die{faceValue: %d}", faceValue);
    }
}
