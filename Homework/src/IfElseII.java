import java.util.Scanner;

public class IfElseII {
    public static void main(String[] args) {
        int p = 0;
        while (p <= 10) {
            System.out.println("Enter the age :");
            int x;
            Scanner a = new Scanner(System.in);
            x = a.nextInt();

            if (x <= 20) {
                System.out.println("Ure are under age !!");
            } else if (x <= 50) {
                System.out.println("Ure are Adult ");
            } else {
                System.out.println("ure are over age :( ");
            }
            p++;
        }
    }
}
