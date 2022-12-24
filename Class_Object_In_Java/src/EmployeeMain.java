public class EmployeeMain {
    public static void main(String[] args) {

        Employee pratik =new Employee();
        pratik.name="Pratik";
        pratik.id=100;
        pratik.department="RnD";
        pratik.designation="SSD";

        Employee sagar = new Employee();
        sagar.name="Sager";
        sagar.id=200;
        sagar.department="Sales";
        sagar.designation="CM";

        pratik.doAttendMeeting();

        sagar.doAttendMeeting();
        sagar.commute();

    }
}