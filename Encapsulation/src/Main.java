public class Main {
    public static void main(String[] args) {

        Employee emp1=Employee.getInstance();

        emp1.setName("Roger");
        emp1.setAge(25);
        emp1.setSalary(350000);

        Address add1=Address.getInstance();
        add1.setFlatNo("A-704");
        add1.setSocietyName("Amnora");
        add1.setPinCode(411028);

        emp1.setAddress(add1);

        System.out.println(emp1);

     /*   Employee emp2=Employee.getInstance();
        emp2.setName("Joyboy");
        emp2.setAge(24);
        emp2.setSalary(300000);

        Address add2=Address.getInstance();
        add2.setFlatNo("C-2404");
        add2.setSocietyName("Amnora");
        add2.setPinCode(411028);

        emp2.setAddress(add2);

        System.out.println(emp2);*/
    }
}