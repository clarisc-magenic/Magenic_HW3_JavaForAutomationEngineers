import javax.imageio.plugins.jpeg.JPEGImageReadParam;

/**
 * TODO FOR HOMEWORK - Rectangle.java
 *      [ ] Update this class to inherit from BaseShape.java
 *      [ ] Update to a valid and logical constructor
 *      [ ] Add a static main method
 */
public class Rectangle extends BaseShape{

    /**
     * TODO FOR HOMEWORK: Update the below constructor
     * Creates an instance of the Rectangle class
     * @param length The length of the rectangle
     * @param height The width of the rectangle
     */

    public Rectangle(double length, double height) {
        super("Rectangle",length, height);
    }

    // TODO FOR HOMEWORK: Add a static main method for any debugging purposes
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,7);
        double area = rectangle.area();
        double perimeter = rectangle.perimeter();

        System.out.println("A rectangle with height of " + rectangle.getHeight() + " has an area of: " + area);
        System.out.println("A rectangle with length of " + rectangle.getLength() + " has a perimeter of: " + perimeter);

    }


}