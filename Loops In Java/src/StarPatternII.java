public class StarPatternII {
    public static void main(String[] args) {
        int i=1, j = 1;

        /*for(i=5;i>=0;i--){
            for (j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        int row = 6;
        i = row - 1;
        while (i >= 0) {
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
            j = 1;

        }
    }
}
