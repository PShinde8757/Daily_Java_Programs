
public class Student {
    private String name, collageName;
    private int id;

    // field getter

    public String getName() {
        return name;
    }

    public String getCollageName() {
        return collageName;
    }

    public int getId() {
        return id;
    }

    // field setter

    public void setName(String sname) {
        this.name = sname;
    }

    public void setCollageName(String sclgName) {
        this.collageName = sclgName;
    }

    public void setId(int sid) {
        this.id = sid;
    }

    //no args constructor

    public Student() {
        name = "pratik";
        id = 101;
        collageName = "KJEI";
    }

    //parameterized constructor

    public Student(String sname, String sclgName, int sid) {
        this.name = sname;
        this.collageName = sclgName;
        this.id = sid;
    }

    //copy constructor

    public Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.collageName = s.collageName;
    }

    // constructor overloading Examples

    //parameterized constructor with different number of arguments
    public Student(int sid, String sname) {

        this.id = sid;
        this.name = sname;

    }

    //parameterized constructor with different sequence of arguments
    public Student(int sid, String sclgName, String sname) {

        this.id = sid;
        this.collageName = sclgName;
        this.name = sname;

    }

    //type different ex of constructor overloading

    public Student(int sid) {
        this.id = sid;
    }

    public Student(String sname) {
        this.name = sname;
    }


}