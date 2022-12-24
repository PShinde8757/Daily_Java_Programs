
public class Student {
    private String name;
    private int id;

    public void display(){
        System.out.println("Name : "+ this.name  +"\n Id : "+ this.id);
    }
    public Student(){                                               //no args constructor
        System.out.println("No args ");
    }
    public Student(String name,int id){                             //parameterized constructor
        this.name=name;
        this.id=id;
    }
    public  Student(Student s){                                      //copy constructor
        this.name=s.name;
        this.id=s.id;
    }
}