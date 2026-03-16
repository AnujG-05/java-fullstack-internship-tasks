import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Iterator;

public class LinkedHashSetMethods {
    public static void main(String[] args) {

        // Create and initialize (insertion order is preserved)
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // add(E e) – unique elements, keeps first insertion order
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Banana");   // duplicate, ignored
        System.out.println("Initial set: " + set); // [Apple, Banana, Cherry]

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

        // iterator() – iteration follows insertion order
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
        LinkedHashSet<String> other = new LinkedHashSet<>();
        other.add("Mango");
        other.add("Orange");
        set.addAll(other);
        System.out.println("addAll(other): " + set); // order: Apple, Cherry, Mango, Orange

        // toArray()
        Object[] arr = set.toArray();
        System.out.print("toArray(): ");
        for (Object o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();

        // clone() – shallow copy
        @SuppressWarnings("unchecked")
        LinkedHashSet<String> copy = (LinkedHashSet<String>) set.clone();
        System.out.println("clone(): " + copy);

        // clear()
        set.clear();
        System.out.println("After clear(): " + set + ", isEmpty(): " + set.isEmpty());
    }
}
