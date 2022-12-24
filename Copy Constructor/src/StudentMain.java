public class StudentMain {
    public static void main(String[] args) {

        System.out.println("Output Through Default Constructor");
        Student s1 = new Student();

        System.out.println();

        Student s2 = new Student("pratik", 10);
        System.out.println("Output Through Parameterized Constructor");
        s2.display();

        System.out.println();

        Student s3 = new Student(s2);
        System.out.println("Output Through Copy Constructor");
        s3.display();

       /* s2.display();
        s3.display();*/

    }
}