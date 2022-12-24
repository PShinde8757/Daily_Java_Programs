public class SirCalMain {
    public static void main(String[] args) {

        SirCal mycal =new SirCal();
        mycal.num1=200;
        mycal.num2=500;

        int res ;
        res=mycal.addition();
        System.out.println(res);
        res=mycal.subtraction();
        System.out.println(res);
        res=mycal.multiplication();
        System.out.println(res);
        res=mycal.division();
        System.out.println(res);
        res=mycal.modDivision();
        System.out.println(res);

        SirCal.display();

   }
}
