import java.util.Scanner;

/**
 * {@code DaysOfWeek}d
 * @author Pratik
 */

public class DaysOfWeek {
    public static void main(String[] args) {
        //int b = 0;
        while (true) {

            System.out.println("Enter Number Between 1 To 7 : ");
            Scanner x = new Scanner(System.in);
            int a = x.nextInt();

            switch (a) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid Input ??");
            }
            //b++;
            System.out.println("Do U Want to Continue Yes / No :");
            Scanner y = new Scanner(System.in);
            String c = y.next();
            if (!c.equalsIgnoreCase("yes")) {
                break;
            }
        }
    }
}
