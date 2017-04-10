/**
 * Created by Alin on 4/5/2017.
 */
public class ShapeTest {
    public static void main(String[] args){

        //some Shape class tests are bellow

        Shape firstShape = new Shape();
        Shape secondShape = new Shape("cyan" , false);

        System.out.println(firstShape.toString());
        System.out.println("The first shape's color is : " + firstShape.getColor() + " .Let's set this shape's color to red." );
        firstShape.setColor("red");
        System.out.println("Now the first shape's color is : " + firstShape.getColor());

        System.out.println(secondShape.toString());

        secondShape.setFilled(true);
        System.out.println(secondShape.toString());


        //tests for Circle class

        Shape circle = new Circle();
        System.out.println(circle.toString());

        ((Circle)circle).setRadius(5.0);
        System.out.println(circle.toString());
        System.out.println("The circle has the area =  " + ((Circle) circle).getArea() + " and the perimeter = " + ((Circle) circle).getPerimeter());


        //tests for Rectangle

        Shape rectangle  = new Rectangle();
        System.out.println(rectangle.toString());

        ((Rectangle)rectangle).setWidth(5.0);
        ((Rectangle)rectangle).setLength(10.0);

        System.out.println(rectangle.toString());
        System.out.println("The rectangle has the area =  " + ((Rectangle) rectangle).getArea() + " and the perimeter = " + ((Rectangle) rectangle).getPerimeter());


        //and finally tests for Square class

        Shape square = new Square();
        System.out.println(square.toString());

        square.setFilled(true);
        ((Square)square).setSide(3.0);
        System.out.println(square.toString());

        System.out.println("This square has the area =  " + ((Square) square).getArea() + " and the perimeter = " +((Square) square).getPerimeter() );
    }
}
