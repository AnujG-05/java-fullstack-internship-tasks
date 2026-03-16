import java.util.Vector;
import java.util.Enumeration;

public class VectorMethods {
    public static void main(String[] args) {

        // Create and initialize
        Vector<String> v = new Vector<>();

        // add(E e)
        v.add("Apple");
        v.add("Banana");
        v.add("Cherry");
        System.out.println("Initial vector: " + v);

        // add(int index, E element)
        v.add(1, "Blueberry");
        System.out.println("add(1, \"Blueberry\"): " + v);

        // size(), capacity()
        System.out.println("size(): " + v.size());
        System.out.println("capacity(): " + v.capacity());   // Vector-specific

        // get(int index)
        System.out.println("get(0): " + v.get(0));

        // set(int index, E element)
        v.set(2, "Blackberry");
        System.out.println("set(2, \"Blackberry\"): " + v);

        // contains(Object o)
        System.out.println("contains(\"Banana\"): " + v.contains("Banana"));

        // indexOf(Object o), lastIndexOf(Object o)
        v.add("Banana");
        System.out.println("After adding another \"Banana\": " + v);
        System.out.println("indexOf(\"Banana\"): " + v.indexOf("Banana"));
        System.out.println("lastIndexOf(\"Banana\"): " + v.lastIndexOf("Banana"));

        // remove(int index)
        String removedByIndex = v.remove(1);
        System.out.println("remove(1): " + removedByIndex);
        System.out.println("After remove(1): " + v);

        // remove(Object o)
        boolean removedByValue = v.remove("Cherry");
        System.out.println("remove(\"Cherry\"): " + removedByValue);
        System.out.println("After remove(\"Cherry\"): " + v);

        // isEmpty()
        System.out.println("isEmpty(): " + v.isEmpty());

        // toArray()
        Object[] arr = v.toArray();
        System.out.print("toArray(): ");
        for (Object o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();

        // Enumeration (legacy)
        System.out.print("elements() Enumeration: ");
        Enumeration<String> e = v.elements();
        while (e.hasMoreElements()) {
            System.out.print(e.nextElement() + " ");
        }
        System.out.println();

        // for-each
        System.out.print("for-each: ");
        for (String s : v) {
            System.out.print(s + " ");
        }
        System.out.println();

        // clear()
        v.clear();
        System.out.println("After clear(): " + v + ", isEmpty(): " + v.isEmpty());
    }
}
