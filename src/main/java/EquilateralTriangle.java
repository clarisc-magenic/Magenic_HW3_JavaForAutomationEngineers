/**
 * TODO FOR HOMEWORK - EquilateralTriangle.java
 *      [X] Update this class to inherit from BaseShape.java
 *      [X] Update to a valid and logical constructor
 *      [X] Override the area method
 *      [X] Override the perimeter method
 *      [X] Add a static main method
 */
public class EquilateralTriangle extends BaseShape {
    /**
     * TODO FOR HOMEWORK: Update the below constructor
     * NOTE: Remember you only need the length (Same thing as the base) to find the height of an equilateral triangle
     *       height = (sqrt(3)/2) * length
     * Creates an instance of the EquilateralTriangle class
     * @param length The base length of the triangle
     */
    public EquilateralTriangle(double length) {
        super("equilateraltriangle", length, Math.sqrt(3) * length / 2);
    }

    // TODO FOR HOMEWORK: Override the area() method from BaseShape to work for a triangle
    public double area() {
        return (getLength() * getHeight()) / 2;
    }

    // TODO FOR HOMEWORK: Override the perimeter() method from BaseShape to work for a triangle
    public double perimeter() {
        return 3 * getLength();
    }

    // TODO FOR HOMEWORK: Add a static main method for any debugging purposes
    public static void main(String[] args) {
        EquilateralTriangle et = new EquilateralTriangle(5);
        et.DEBUG_PrintOutAreaAndPerimeter();
    }
}