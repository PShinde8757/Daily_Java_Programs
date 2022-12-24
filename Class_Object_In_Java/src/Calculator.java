public class Calculator {

    static int num1;
    static int num2;


    //  method / division
    int addition() {

        System.out.println("Addition of " + num1 + " and " + num2 + " is : ");
        return num1 + num2;
    }

    int subtraction() {
        System.out.println("Subtraction of " + num1 + " and " + num2 + " is : ");
        return num1 - num2;

    }

    int multiplication() {
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is : ");
        return num1 * num2;
    }

    int division() {
        System.out.println("Division of " + num1 + " and " + num2 + " is : ");
        return num1 / num2;
    }

    int modDivision() {
        System.out.println("Mod Division of " + num1 + " and " + num2 + " is : ");
        return num1 % num2;

    }
}