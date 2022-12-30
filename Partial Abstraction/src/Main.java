import Feature.Shape;
import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Square;
import Shapes.Triangle;

public class Main {
    public static void main(String[] args) {

        Shape square=new Square();
        square.calculateArea(10,10);
        square.displayArea();

        Shape rectangle=new Rectangle();
        rectangle.calculateArea(10,25);
        rectangle.displayArea();

        Shape triangle=new Triangle();
        triangle.calculateArea(10,5);
        triangle.displayArea();

        Shape circle=new Circle();
        circle.calculateArea(10,10);
        circle.displayArea();
    }
}