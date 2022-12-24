import java.util.Scanner;

public class iFELSEiii {
    public static void main(String[] args) {
        int w=0;
        System.out.println("Given Numbers are: '55 , 45, 78, 87, 40 '");
        System.out.println("Guess The Right Number From Given Number only, To Win The Price :");


        while(w<=2) {

            Scanner u=new Scanner(System.in);
            int x=u.nextInt();

            if (x==87){
                System.out.println("Hurray U Win the Game :) :) :)");
                break;
            }else {
                System.out.println("Sorry U loss :( , Better luck next time :) ");
                w++;
            }

        }
    }
}