import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        This Program is for nested if-else
         */
        System.out.println("Enter The Number : ");
        Scanner sc = new Scanner(System.in);
                int x=sc.nextInt();
        if (x > 20) {
            System.out.println("x>20");
            if (x >40) {
                System.out.println("x>40");
            } else {
                System.out.println("x<40");
            }
        } else {
            System.out.println("x<20");
        }
    }
}
