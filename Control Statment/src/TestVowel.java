import java.util.Scanner;


/*
To check the character is Vowel or not
 */


public class TestVowel {
    public static void main(String[] args) {
        System.out.println("Enter The Character : ");
        Scanner x = new Scanner(System.in);
        String ch = x.next().toLowerCase();
        System.out.println("User Input :" + ch);

        if (ch.length() == 1) {

            switch (ch) {

                case "a":
                    System.out.println("It is Vowel");
                    break;

                case "e":
                    System.out.println("It is Vowel");
                    break;

                case "i":
                    System.out.println("It is Vowel");
                    break;

                case "o":
                    System.out.println("It is Vowel");
                    break;

                case "u":
                    System.out.println("It is Vowel");
                    break;

                default:
                    System.out.println("Given Character is Not a vowel");
            }
        } else {
            System.out.println("Enter only Character instead of String");
        }
    }
}
