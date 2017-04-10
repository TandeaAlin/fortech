/**
 * Created by Alin on 4/5/2017.
 */
public class Circle extends Shape {
    private double radius;
    private static final double PI = 3.14;
    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return this.radius * this.radius * PI;
    }

    public double getPerimeter(){
        return 2.0 * PI * this.radius;
    }

    @Override
    public String toString() {
        return "A circle with radius  = " + this.radius + ", which is a subclass of " + super.toString() ;
    }
}
