import java.util.ArrayList;
import java.util.List;

/**
 * Java Generics:
 * 1. Generics were introduced in JDK 5.0 to provide Compile-Time Type Checking(Explicit cast)
 * and to eliminate the risk of ClassCastException that was common when working with collection classes earlier.
 * A programmer can restrict a collection class to contain only one type of object using Generics.
 * <p>
 * All occurrences of the formal type parameter e.g. List<E> (E in this case) are replaced
 * by the actual type argument List<Integer> (Integer in this case).
 * <p>
 * Why do we use Generics in Java?
 * Generics provide strong compile-time type checking and reduce the risk of ClassCastException
 * and explicit casting of objects.
 * <p>
 * What is T in Generics?
 * We use <T> to create a generic class, interface, and method.
 * The T is replaced with the actual type parameter when we use it.
 * <p>
 * How does Generics Work in Java?
 * Generic code ensures type safety. The compiler uses type-erasure to remove all type parameters at the compile time to reduce the overload at runtime.
 */

public class GenericsExample {
    public static void main(String[] args) {

        //List of Integers

        List<Integer> myIntegerList = new ArrayList<>();

        myIntegerList.add(10);
        myIntegerList.add(26);
        myIntegerList.add(30);

        Integer x = myIntegerList.iterator().next();
        for (Integer i : myIntegerList) {
            System.out.println(i);
        }

        List<String> myStringList = new ArrayList<>();


        //List of String

        myStringList.add("Pratik");
        myStringList.add(("Sachin"));
        myStringList.add("Shinde");

        String y = myStringList.iterator().next();

        for (String s : myStringList) {
            System.out.println(s);
        }
    }
}