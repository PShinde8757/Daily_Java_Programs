public class Student {

    String name;
    int id;
    int rollNo;

   public Student(){
   }

   public Student(String name){
       this .name=name;
       this.rollNo=35;
       this.id=335;
   }

    public Student(int id ){
        this.name="Pratik";
        this.id=id;
        this.rollNo=101;
    }
    public Student(String name, int id , int rollNo ){
       this.name=name;
       this.id=id;
       this.rollNo=rollNo;
    }
    public Student(int rollNo, int id ,String name  ){
        this.name=name;
        this.id=id;
        this.rollNo=rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void doStudy(){
        System.out.println(" Student " +name+ " is doing Study ");
    }

    public void doStudy(String subject){
        System.out.println(" Student " +name+ " is doing Study " +subject);
    }

    public void play(){
        System.out.println(" Student "+name+" is Playing ");
    }
    public void commute(){
        System.out.println(" Student "+name+" is Commuting from Home to School" );
    }

    @Override
    public String toString() {
        return " Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", rollNo=" + rollNo +
                '}';
    }
}
