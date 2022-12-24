import java.util.Scanner;

public class SwitchII {
    public static void main(String[] args) {

        System.out.println("Enter The 1st Numbers:");
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();

        System.out.println("Enter The 2nd Numbers:");
        Scanner y = new Scanner(System.in);
        int b = y.nextInt();

        System.out.println("Choose The Operator' + , - , * , / '");
        Scanner z = new Scanner(System.in);
        String ch = z.next();

        int c;

        switch (ch) {
            case "+" -> {
                c = a + b;
                System.out.println("Addition of Given Two Number is: " + c);
            }
            case "-" -> {
                c = a - b;
                System.out.println("Subtraction of Given Two Number is: " + c);
            }
            case "*" -> {
                c = a * b;
                System.out.println("Multiplication of Given Two Number is: " + c);
            }
            case "/" -> {
                c = a / b;
                System.out.println("Division of Given Two Number is: " + c);
            }
            default -> System.out.println("Case not found");
        }
    }
}
