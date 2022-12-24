public class Main {
    public static void main(String[] args) {

        Machine machine = new Machine();
        machine.powerOn();
        machine.powerOff();

        Laptop l1 = new Laptop();
        l1.powerOn();
        l1.display();
        l1.powerOff();

        Printer p1 = new Printer();
        p1.powerOn();
        p1.print();
        p1.powerOff();


        // Up Casting
        Machine p2 = new Printer();
        p2.powerOn();
        p2.powerOff();


    }
}