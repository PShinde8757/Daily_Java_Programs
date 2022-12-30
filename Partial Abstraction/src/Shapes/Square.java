package Shapes;

import Feature.Shape;

public class Square extends Shape {


    @Override
    public void calculateArea(int x, int y) {
        area=x*y;
    }
}
