package Shapes;

import Feature.Shape;

public class Triangle extends Shape {
    @Override
    public void calculateArea(int x, int y) {
        area =0.5f*x*y;
    }
}
