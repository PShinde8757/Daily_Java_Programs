package Shapes;

import Features.Shape;

public class Circle implements Shape {
    @Override
    public float calculateArea(int x, int y) {
        return PI*x*y;
    }
}
