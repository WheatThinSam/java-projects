public class OverLoaded{
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(9.8f);
        Rectangle rect3 = new Rectangle(1.8f, 17.4f);
        Rectangle rect4 = new Rectangle(9.8);
         
        double myNum = 7.99999;
         
        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println(rect3);
        System.out.println(rect4);
         
        rect1.setLength(4);
        rect1.setWidth(5.7f);
         
         
        rect2.setWidth(7.8);
        rect4.setWidth();
        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println(rect4);
         
        
    }
}