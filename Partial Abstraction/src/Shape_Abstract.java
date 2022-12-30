public abstract class Shape_Abstract {

    abstract float calculateArea(int x, int y);

    float area;
    void displayArea(){
        System.out.println("Area : " + area);
    }
}
