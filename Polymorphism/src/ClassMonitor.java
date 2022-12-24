public class ClassMonitor extends Student{

    public void monitorClass(){
        System.out.println("Class Monitor "+name+" is Monitoring Class");
    }
    public ClassMonitor(String name){
        this.name=name;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void doStudy() {
        super.doStudy();
    }

    @Override
    public void doStudy(String subject) {
        super.doStudy(subject);
    }

    @Override
    public void play() {
        super.play();
    }

    @Override
    public void commute() {
        super.commute();
    }

    @Override
    public String toString() {
        return "ClassMonitor{ "+super.toString()+" }";
    }
}
