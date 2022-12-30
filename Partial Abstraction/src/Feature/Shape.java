package Feature;

public abstract class Shape {

    public float area;
    public static final float PI=3.142f;

    public Shape() {

    }

    public abstract void calculateArea(int x, int y);


    public void displayArea(){
        System.out.println("Area of "+ this.getClass().getName() +" = "+ area);
    }
}
