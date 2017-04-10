/**
 * Created by Alin on 4/5/2017.
 */
public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Method that calculates a rectangle's Area
     * There's no need to override this method in the Square class because if both the width and
     * length are set to the same size then the getArea() function correctly calculates the
     * formula for the area of a square shape
     * @return area value
     */
    public double getArea(){
        return this.length * this.width;
    }

    /**
     * Method that calculates a rectangle's Perimeter
     * There's no need to override this method in the Square class because if both the width and
     * length are set to the same size then the getPerimeter() function correctly calculates the
     * formula for the perimeter of a square shape
     * @return perimeter value
     */
    public double getPerimeter(){
        return 2 * this.length + 2 * this.width;
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " + this.width + " and length = " + this.length + ", which is a subclass of " + super.toString();
    }
}
