import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        int x = 0;

        while (x <= 10) {
            System.out.println("Enter The Character : ");
            Scanner sc = new Scanner(System.in);
            String ch = sc.next().toLowerCase();
            char[] charArr = ch.toCharArray();

            if (charArr.length == 1) {

                switch (charArr[0]) {

                    case 'a':
                        System.out.println("It is Vowel");
                        break;
                    case 'e':
                        System.out.println("It is Vowel");
                        break;
                    case 'i':
                        System.out.println("It is Vowel");
                        break;
                    case 'o':
                        System.out.println("It is Vowel");
                        break;
                    case 'u':
                        System.out.println("It is Vowel");
                        break;
                    default:
                        System.out.println("Consonant");
                }
            } else {
                System.out.println("Enter only Character instead of String");
            }
            x++;

        }
    }
}