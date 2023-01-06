public class AnonymousExample {

    public static void main(String[] args) {
       /* Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Run method call.");
            }
        });
        thread.start();*/

        interface test{
            void display();

        }

        /*
            1. The left side type should be an Interface e.g. Test exampleInterface
            2. The right side must be an anonymous class body eg. new Test() { ... };
            {...} this is anonymous class that implements ExampleInterface interface
            and also creates its object and finally assigns the address to exampleInterface
            variable.
         */

        test t1=new test() {
            @Override
            public void display() {
                System.out.println("Display From Anonymous Class Method");
            }
        }       ;

     //   t1.display();
    }
}
