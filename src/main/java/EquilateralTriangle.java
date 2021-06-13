
/**
 * TODO FOR HOMEWORK - EquilateralTriangle.java
 *      [ ] Update this class to inherit from BaseShape.java
 *      [ ] Update to a valid and logical constructor
 *      [ ] Override the area method
 *      [ ] Override the perimeter method
 *      [ ] Add a static main method
 */
public class EquilateralTriangle extends BaseShape{
    /**
     * TODO FOR HOMEWORK: Update the below constructor
     * NOTE: Remember you only need the length (Same thing as the base) to find the height of an equilateral triangle
     *       height = (sqrt(3)/2) * length
     * Creates an instance of the EquilateralTriangle class
     * @param length The base length of the triangle
     */
    private double height;

    public EquilateralTriangle(double length, double height) {
        super("equilateraltriangle", length, Math.sqrt(3) * length / 2);
    }



    public EquilateralTriangle(double length) {
       super("equilateraltriangle", length, length);
    }

    // TODO FOR HOMEWORK: Override the area() method from BaseShape to work for a triangle

    public double area(){
        double length = getLength();
        double height = Math.sqrt(3) * length / 2;
        return length * height/2;
    }

    // TODO FOR HOMEWORK: Override the perimeter() method from BaseShape to work for a triangle

    public double perimeter(){
        double length = getLength();
        return length * 3;
    }

    // TODO FOR HOMEWORK: Add a static main method for any debugging purposes
    public static void main(String[] args) {
        EquilateralTriangle triangle = new EquilateralTriangle(5,8);
        double area = triangle.area();
        double perimeter = triangle.perimeter();

        System.out.println("An Equilateral Triangle with side length of " + triangle.getLength() + " has an area of: " + area);
        System.out.println("An Equilateral Triangle with side length of " + triangle.getLength() + " has a perimeter of: " + perimeter);
    }
}