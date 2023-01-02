import Feature.Shape;
import Shapes.Circle;
import Shapes.Rectangle;

public class Main {
    public static void main(String[] args) {


        Shape rectangle=new Rectangle();
        rectangle.calculateArea(10,25);
        rectangle.displayArea();


        Shape circle=new Circle();
        circle.calculateArea(10,10);
        circle.displayArea();


    }
}