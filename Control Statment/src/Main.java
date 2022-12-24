import java.util.Scanner;


/*
Use Of Switch case
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the days in Week : ");
        Scanner sc =new Scanner(System.in);
        String day = sc.next().toLowerCase();
        System.out.println("User Input :"+ day);

        switch (day){
            case "monday":
                System.out.println("Today is Monday");
                break;
            case "tuesday":
                System.out.println("Today is Tuesday");
                break;
            case "wednesday":
                System.out.println("Today is Wednesday");
                break;
            case "thursday":
                System.out.println("Today is Thursday");
                break;
            case "friday":
                System.out.println("Today is Friday");
                break;
            case "saturday":
                System.out.println("Today is Saturday");
                break;
            case "sunday":
                System.out.println("Today is Sunday");
                break;
        }
    }
}