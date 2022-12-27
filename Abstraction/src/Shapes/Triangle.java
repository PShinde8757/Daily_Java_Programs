package Shapes;

import Features.Shape;

public class Triangle implements Shape {
    @Override
    public float calculateArea(int x, int y) {
        return 0.5f*x*y;
    }
}
