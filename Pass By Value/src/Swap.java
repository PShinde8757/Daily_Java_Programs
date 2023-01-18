public class Swap {

    static void swap(int x,int y){
        int temp=x;
        x=y;
        y=temp;

        System.out.println("before swap");
        System.out.println(x+" "+y);
    }
    public static void main(String[] args) {

            int a=10,b=20;
            swap(a,b);
        System.out.println("after swap");
        System.out.println(a+" "+b);

    }
}