public class Main {
    public static void main(String[] args) {

        Employee emp=new Employee("Mahesh", 350000, 105,
                new Address("A2405","lane2","Pune",411028));

        System.out.println(emp);
        emp.getAddreass().pinCode=41145;
        System.out.println(emp);


    }
}