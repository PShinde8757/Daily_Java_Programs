public class SirCal {

    // object field
    int num1;
    int num2;


    //  method / division
    int addition() {
        int result = num1 + num2;
        return result;
    }

    int subtraction() {
        int result = num1 - num2;
        return result;

    }

    int multiplication() {
        int result = num1 * num2;
        return result;
    }


    int division() {
        int result = num1 / num2;
        return result;
    }

    int modDivision() {
        int result = num1 % num2;
        return result;

    }
    static void display(){
        System.out.println("display through static variable");

    }
}