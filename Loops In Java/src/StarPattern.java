public class StarPattern {
    public static void main(String[] args) {
        int a=1,b=1,row=5;
        while(a<=row){
            while (b<=a){
                System.out.print("*");
                b++;
            }
            System.out.println();
            a++;
            b=1;
        }

    }
}


