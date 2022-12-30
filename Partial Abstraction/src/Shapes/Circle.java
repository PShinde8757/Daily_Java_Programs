package Shapes;

import Feature.Shape;

public class Circle extends Shape {
    @Override
    public void calculateArea(int x, int y) {
        area = Shape.PI*x*y;
    }
}
