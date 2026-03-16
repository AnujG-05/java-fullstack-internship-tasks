import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTreeSetMethods {
    public static void main(String[] args) {

        // TreeSet implements SortedSet (and NavigableSet)
        SortedSet<Integer> set = new TreeSet<>();

        // add(E e) – elements stored in sorted (ascending) order
        set.add(50);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(40);
        set.add(30);   // duplicate, ignored
        System.out.println("Initial set (sorted): " + set); // [10, 20, 30, 40, 50]

        // size()
        System.out.println("size(): " + set.size());

        // contains(Object o)
        System.out.println("contains(20): " + set.contains(20));
        System.out.println("contains(99): " + set.contains(99));

        // isEmpty()
        System.out.println("isEmpty(): " + set.isEmpty());

        // first(), last()
        System.out.println("first(): " + set.first()); // smallest
        System.out.println("last(): " + set.last());   // largest

        // headSet(toElement)  -> elements < toElement
        SortedSet<Integer> head = set.headSet(30);
        System.out.println("headSet(30): " + head);    // [10, 20]

        // tailSet(fromElement) -> elements >= fromElement
        SortedSet<Integer> tail = set.tailSet(30);
        System.out.println("tailSet(30): " + tail);    // [30, 40, 50]

        // subSet(fromElement, toElement) -> [from, to)
        SortedSet<Integer> sub = set.subSet(20, 50);
        System.out.println("subSet(20, 50): " + sub);  // [20, 30, 40]

        // remove(Object o)
        boolean removed = set.remove(30);
        System.out.println("remove(30): " + removed);
        System.out.println("After remove(30): " + set);

        // iterator() / for-each (ascending order)
        System.out.print("for-each ascending: ");
        for (int x : set) {
            System.out.print(x + " ");
        }
        System.out.println();

        // toArray()
        Object[] arr = set.toArray();
        System.out.print("toArray(): ");
        for (Object o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();

        // clear()
        set.clear();
        System.out.println("After clear(): " + set + ", isEmpty(): " + set.isEmpty());

        // ---------- TreeSet-specific Navigable methods ----------

        TreeSet<Integer> nav = new TreeSet<>();
        nav.add(10);
        nav.add(20);
        nav.add(30);
        nav.add(40);
        nav.add(50);
        System.out.println("\nTreeSet nav: " + nav);

        // lower(e): greatest element < e
        System.out.println("lower(30): " + nav.lower(30));       // 20

        // floor(e): greatest element <= e
        System.out.println("floor(30): " + nav.floor(30));       // 30

        // higher(e): least element > e
        System.out.println("higher(30): " + nav.higher(30));     // 40

        // ceiling(e): least element >= e
        System.out.println("ceiling(30): " + nav.ceiling(30));   // 30

        // pollFirst(), pollLast() – retrieve + remove
        System.out.println("pollFirst(): " + nav.pollFirst());   // 10
        System.out.println("pollLast(): " + nav.pollLast());     // 50
        System.out.println("After pollFirst & pollLast: " + nav); // [20, 30, 40]

        // descendingSet() – view in reverse order
        System.out.println("descendingSet(): " + nav.descendingSet());
    }
}
