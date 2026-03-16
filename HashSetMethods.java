import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class HashSetMethods {
    public static void main(String[] args) {

        // Create and initialize
        HashSet<String> set = new HashSet<>();

        // add(E e) – duplicates are ignored
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Banana");   // duplicate
        System.out.println("Initial set: " + set);

        // size()
        System.out.println("size(): " + set.size());

        // contains(Object o)
        System.out.println("contains(\"Apple\"): " + set.contains("Apple"));
        System.out.println("contains(\"Mango\"): " + set.contains("Mango"));

        // isEmpty()
        System.out.println("isEmpty(): " + set.isEmpty());

        // remove(Object o)
        boolean removed = set.remove("Banana");
        System.out.println("remove(\"Banana\"): " + removed);
        System.out.println("After remove(\"Banana\"): " + set);

        // iterator()
        System.out.print("iterator(): ");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // for-each loop
        System.out.print("for-each: ");
        for (String s : set) {
            System.out.print(s + " ");
        }
        System.out.println();

        // addAll(Collection)
        HashSet<String> other = new HashSet<>();
        other.add("Mango");
        other.add("Orange");
        set.addAll(other);
        System.out.println("addAll(other): " + set);

        // toArray()
        Object[] arr = set.toArray();
        System.out.print("toArray(): ");
        for (Object o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();

        // clone() – shallow copy
        @SuppressWarnings("unchecked")
        HashSet<String> copy = (HashSet<String>) set.clone();
        System.out.println("clone(): " + copy);

        // clear()
        set.clear();
        System.out.println("After clear(): " + set + ", isEmpty(): " + set.isEmpty());
    }
}
