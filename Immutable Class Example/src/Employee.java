public class Employee {

    private final String name;
    private final int salary;
    private final int id;
    private final Address address;

    public Employee(String name, int salary, int id, Address address) {
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.address = new Address(address.flatNo, address.lane, address.city, address.pinCode);    //deep clone

    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public Address getAddreass() {
        return new Address(address.flatNo, address.lane, address.city, address.pinCode);    //deep clone
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                ", address=" + address +
                '}';
    }
}
