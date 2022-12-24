import java.util.Scanner;

public class SwitchI {
    public static void main(String[] args) {

        System.out.println("Given Numbers are: '55 , 45, 78, 87, 40 '");
        System.out.println("Guess The Number, To Win The Price :");

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int i = 0;
        while (i <= 2) {
            switch (x) {
                case 55:
                    System.out.println("Sorry U loss , Better luck next time :(");
                    break;
                case 45:
                    System.out.println("Sorry U loss , Better luck next time :(");
                    break;
                case 78:
                    System.out.println("Sorry U loss , Better luck next time :(");
                    break;
                case 40:
                    System.out.println("Sorry U loss , Better luck next time :(");
                case 75:
                    System.out.println("Hurray U Win :)");
                    break;
                default:
                    System.out.println("Enter number is not in Given Number");
            }
            i++;
        }
    }
}
