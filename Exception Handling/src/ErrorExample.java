public class ErrorExample {

    static int count = 0;

    public static void main(String[] args)  {
        System.out.println("Main called " + count);
        count++;
        main(new String[]{});
    }
}