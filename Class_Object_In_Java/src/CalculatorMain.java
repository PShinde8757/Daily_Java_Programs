import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {


        System.out.println("Enter 1st Number : ");
        Scanner a = new Scanner(System.in);
        Calculator.num1 = a.nextInt();

        System.out.println("Enter 2st Number : ");
        Scanner b = new Scanner(System.in);
        Calculator.num2 = b.nextInt();


        Calculator ans = new Calculator();

        System.out.println(ans.addition());
        System.out.println(ans.subtraction());
        System.out.println(ans.multiplication());
        System.out.println(ans.division());
        System.out.println(ans.modDivision());

    }
}
