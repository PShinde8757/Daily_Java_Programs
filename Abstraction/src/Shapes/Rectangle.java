package Shapes;

import Features.Shape;

public class Rectangle implements Shape {
    @Override
    public float calculateArea(int x, int y) {
        return x*y;
    }
}
