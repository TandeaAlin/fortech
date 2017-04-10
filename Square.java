/**
 * Created by Alin on 4/5/2017.
 */
public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side) {
        setSide(side);
    }

    public Square(double side , String color  , boolean filled){
        super(color , filled , side , side);
    }

    public double getSide(){
        return super.getLength();
    }

    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public String toString() {
        return "A Square with side = " + this.getSide() + ", which is a subclass of " + super.toString();
    }
}
