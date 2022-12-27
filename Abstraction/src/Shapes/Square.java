package Shapes;

import Features.Shape;

public class Square implements Shape {
    @Override
    public float calculateArea(int x, int y) {
        return x*y;
    }
}
