import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        /*
        Time table
         */
        System.out.println("Please Enter The Time in Format of :\n 6.00 \n 9.30 \n12.00 ");

        Scanner x=new Scanner(System.in);
        float a=x.nextFloat();

        if (a == 6.00){
            System.out.println("Wake up don't wan late to class.");
        }else if (a == 9.30) {
            System.out.println("Ok Class is over latest back to home and do some work. ");
        }else if (a == 12.00) {
            System.out.println("Moving SSchedule is over ");
        }else {
            System.out.println("Please Provide time as per given statement");
        }
    }
}