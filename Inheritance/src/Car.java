public class Car {
    int cc;
    int wheels;
    String colour;

    public Car(int c_cc, int c_wheels, String c_colour) {
        this.cc = c_cc;
        this.wheels = c_wheels;
        this.colour = c_colour;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int c_cc) {
        this.cc = c_cc;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int c_wheels) {
        this.wheels = c_wheels;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String c_colour) {
        this.colour = c_colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "cc=" + cc +
                ", wheels=" + wheels +
                ", colour='" + colour + '\'' +
                '}';
    }
}
