import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface FunctionalTest{
    int display(int a);
}

public class lambdaExpression {
    public static void main(String[] args) {

        System.out.println("********************************************************");

        System.out.println("Print by regular lambda expression\n >");
        FunctionalTest test =a->a*a*a;
        System.out.println(test.display(10));

        System.out.println("********************************************************");

        FunctionalTest test1 =a-> {
                System.out.println("Print by body method lambda expression\n >");
                return a*a;
            };
        System.out.println(test1.display(10));

        System.out.println("********************************************************\n");

        System.out.println("------ Lambda Expression in List Example -----\n");


        List<String> guestList =new ArrayList<>();
        guestList.add("Pratik");
        guestList.add("Sagar");
        guestList.add("Khanna");
        guestList.add("Ashwin");
        guestList.add("Ankit");


        System.out.println("Print all elements of guestList using for loop\n >");
        for (String guestName: guestList){
            System.out.println(guestName);
        }

        System.out.println("********************************************************");

        System.out.println("Print all elements of guestList using Lambda Expression\n >");
        guestList.forEach(guestName -> System.out.println(guestName));



    }
}