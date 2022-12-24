public class StudentMain {
    public static void main(String[] args) {

        Student raj=new Student();
        raj.name="Raj";
        raj.id=10;
        raj.rollNum=101;
        raj.section='A';

        Student ronak =new Student();
        ronak.name="Ronak";
        ronak.id=10;
        ronak.rollNum=101;
        ronak.section='A';

        raj.play();

        ronak.play();
        ronak.study();

    }
}
