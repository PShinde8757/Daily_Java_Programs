import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee{
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}


public class StreamExample {
    public static void main(String[] args) {


        List<Employee> employeeList= new ArrayList<>();

        employeeList.add(new Employee("Pratik", 10000));
        employeeList.add(new Employee("Sagar",25000));
        employeeList.add(new Employee("Khanna",20000));
        employeeList.add(new Employee("Ashwin",28000));
        employeeList.add(new Employee("Ankit",230000));

        employeeList.forEach(emp -> System.out.println("Name: "+emp.name+" & "+"Salary: "+emp.salary));

        System.out.println("********************************************************\n");


        //Stream --> Sequence of Elements(String, Integer, Double, Student, Employee etc)

        employeeList.stream()
                .sorted(Comparator.comparing(emp -> emp.name ))
                .forEach(emp -> System.out.println("Name: "+emp.name+" & "+"Salary: "+emp.salary));

    }
}