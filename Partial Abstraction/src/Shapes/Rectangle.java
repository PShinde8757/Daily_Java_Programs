package Shapes;

import Feature.Shape;

public class Rectangle extends Shape {
    @Override
    public void calculateArea(int x, int y) {
        area=x*y;
    }
}
