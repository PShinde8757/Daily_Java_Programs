import Features.Shape;
import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Square;
import Shapes.Triangle;

/**
 * This is a Driver class to drive the functionality of
 * abstraction module.
 */
public class Main {
    public static void main(String[] args) {

        Shape square = new Square();
        System.out.println("Area of Square = " + square.calculateArea(10, 15));
        //  square.displayArea(10,20);

        Shape rectangle = new Rectangle();
        System.out.println("Area of Rectangle = " + rectangle.calculateArea(10, 30));

        Shape triangle = new Triangle();
        System.out.println("Area of Triangle = " + triangle.calculateArea(5, 10));

        Shape circle = new Circle();
        System.out.println("Area of Circle = " + circle.calculateArea(15, 15));
    }
}