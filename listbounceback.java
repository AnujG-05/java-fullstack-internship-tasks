
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class listbounceback {

    public static void ArrayListMethods() {
        // A. ArrayList
        ArrayList<String> arr = new ArrayList<>();

        // 1. Adding Elements
        // .add(element:)  // add the specified element at the end of the list
        arr.add("I");
        arr.add("am");
        arr.add("Anuj");
        System.out.println(arr);  // [I, am, Anuj]

        // .add(index: , element:)   // insert the specified element at given index
        arr.add(2,"Gupta");
        System.out.println(arr);  // [I, am, Gupta, Anuj]

        ArrayList<String> list = new ArrayList<>();
        list.add("3");
        list.add("5");
        list.add(1,"1");

        System.out.println(list);  // [3, 1, 5]

        // .addAll(Collection)    // append all the elements from specified collection into another collection
        list.addAll(arr);           // note: both collections are of same data type here it's String
        System.out.println(list);   // [3, 1, 5, I, am, Gupta, Anuj]

        // 2. Size and Emptiness
        // .size()  // Size of the list , return type integer
        System.out.println(list.size());  // 7
        // .isEmpty()  // returns true if the list is empty otherwise false
        System.out.println(arr.isEmpty());   // false

        // 3. Accessing Elements
        // .get(index:)   // to access any element from the list using index
        System.out.println(arr.get(3));     // Anuj
        System.out.println(list.get(5));    // Gupta

        // 4. Seaching
        // .contains(object)  
        System.out.println(arr.contains("I"));    // true
        // .indexOf(object)
        System.out.println(list.indexOf("5"));  // 2
        // .lastIndexOf(object)
        System.out.println(arr.lastIndexOf("am"));  // 1

        // 5. Removing Elements
        // .remove(index:)   // to remove element by index
        System.out.println(list.remove(5));     // Gupta

        System.out.println(list); // [3, 1, 5, I, am, Anuj]
        list.add("5");

        // .remove(object)
        System.out.println(list.remove("5"));   // true      => first occurence of 5 is removed

        System.out.println(list);   // [3, 1, I, am, Anuj, 5]

        // 6. SubList and Conversion
        // .subList(begin index, end index)
        List<String> list1 = list.subList(1, 5);   // => [)
        System.out.println(list1);  // [1, I, am, Anuj]

        // .toArray()
        Object[] a1 = arr.toArray();
        System.out.println(Arrays.toString(a1));    // [I, am, Gupta, Anuj]

        // 7. Clear
        // .clear()
        arr.clear();
        System.out.println(arr);    // []

        // 8. replace
        // .set(index:, element:)
        System.out.println(list.set(5,"Gupta")); // 5

        // 9. for each iteration
        for(String s:list)
        System.out.print(s + " "); // 3 1 I am Anuj Gupta 
    }

    public static void LinkedListMethods() {
        // B. LinkedList
        LinkedList<String> list = new LinkedList<>();

        // 1. Adding elements
        list.add("Apple");          // add(E e) - add at end
        list.add("Banana");
        list.add("Cherry");
        System.out.println(list);    // [Apple, Banana, Cherry]

        list.add(1, "Blueberry");

        list.addFirst("at-start");
        list.addLast("last-one");

        System.out.println(list);   // [at-start, Apple, Blueberry, Banana, Cherry, last-one]

        // queue/deque style
        list.offer("Kiwi");
        list.offerFirst("Banana");
        list.offerLast("Papaya");

        System.out.println(list);   // [Banana, at-start, Apple, Blueberry, Banana, Cherry, last-one, Kiwi, Papaya]

        // 2. Size & Emptiness
        System.out.println(list.size());    // 9
        System.out.println(list.isEmpty()); // false

        //  3. Accessing elements
        System.out.println(list.getFirst());    // Banana
        System.out.println(list.get(2));    // Apple
        System.out.println(list.getLast()); // Papaya

        // 4.  Searching
        System.out.println(list.contains("banana"));    // false
        System.out.println(list.indexOf("Banana"));     // 0
        System.out.println(list.lastIndexOf("Banana"));  // 4

        // 5. Removing Elements
        System.out.println(list.remove(2)); // Apple
        System.out.println(list.remove("2"));   // false
        System.out.println(list.removeFirst()); // Banana
        System.out.println(list.removeLast());  // Papaya

        System.out.println(list); // [at-start, Blueberry, Banana, Cherry, last-one, Kiwi]

        // 6. SubList and Conversion
        List<String> sub = list.subList(3, 5);
        System.out.println(sub); // [Cherry, last-one]

        Object[] arr = sub.toArray();
        for(Object o:arr)
        System.out.print(o + " ");  // Cherry last-one

        System.out.println();

        // 7. Clear
        list.clear();
        System.out.println(list); //[]

        // 8. stack style
        list.push("A");
        list.push("B");
        list.push("C");  // top
        System.out.println(list);   // [C, B, A]

        System.out.println(list.pop()); // C
        System.out.println(list); // [B, A]

        // read head/tail without removing
        System.out.println(list.peek()); // B
        System.out.println(list.peekFirst());  // B
        System.out.println(list.peekLast()); // A

        System.out.println(list); // [B, A]

        // read + remove
        System.out.println(list.poll()); // B
        System.out.println(list.pollFirst()); // A
        System.out.println(list.pollLast()); // null

        list.add(",");
        System.out.println(list); //[,]
        list.set(0,"lol");
        System.out.println(list); //[lol]
    }

    public static void ArrayDequeMethods() {
        // C. ArrayDeque
        Deque<Integer> dq = new ArrayDeque<>();

        // 1. Adding Elements
        dq.add(3);
        dq.addLast(15);

        dq.addFirst(6);

        System.out.println(dq);  // [6, 3, 15]

        dq.offer(10);
        dq.offerFirst(43);
        dq.offerLast(21);

        dq.push(18);

        System.out.println(dq); // [18, 43, 6, 3, 15, 10, 21]

        // 2. Size and Emptiness
        System.out.println(dq.size());  // 7
        System.out.println(dq.isEmpty());  // false

        // 3. Accessing elements
        System.out.println(dq.getFirst()); // 18
        System.out.println(dq.getLast()); // 21

        System.out.println(dq.peek()); // 18
        System.out.println(dq.peekFirst()); // 18
        System.out.println(dq.peekLast()); // 21

        // 4. Searching
        System.out.println(dq.contains(3)); // true

        // 5. Removing Elements
        System.out.println(dq.remove()); // 18
        System.out.println(dq.removeFirst()); // 43
        System.out.println(dq.removeLast()); // 21
        System.out.println(dq.remove(3)); // true

        System.out.println(dq); //[6, 15, 10]

        System.out.println(dq.poll()); // 6
        System.out.println(dq.pollFirst()); // 15
        System.out.println(dq.pollLast());  // 10

        System.out.println(dq); // []

        dq.add(18);
        dq.add(51);
        dq.addFirst(1);

        System.out.println(dq.pop()); // 1
        System.out.println(dq); //[18, 51]

        // 6. clear
        dq.clear();
        System.out.println(dq); //[]

        // 7. Conversion
        dq.add(3);
        dq.add(1);
        dq.add(5);

        System.out.println(dq); // [3, 1, 5]

        // 2nd way to print the list
        // for (int n : dq) {
        //     System.out.print(n + " ");             // 3 1 5
        // }
        // System.out.println();

        Object[] arr = dq.toArray();
        for (Object o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();

    }

    public static void PriorityQueueMethods() {
        // D. Priority Queue
        // Default: MIN-heap (smallest element has highest priority)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 1. Adding Elements
        pq.add(30);          // same as offer()
        pq.offer(10);
        pq.add(20);
        pq.offer(40);

        System.out.println(pq); // [10, 20, 30, 40]

        // 2. Size and Emptiness
        System.out.println(pq.size()); // 4
        System.out.println(pq.isEmpty()); // false

        // 3. Accessing Elements
        System.out.println(pq.peek()); // 10
        System.out.println(pq.element()); // 10

        // 4. Searching
        System.out.println(pq.contains(20)); // true

        // 5. Remove Elements
        System.out.println(pq.remove(10)); // true
        System.out.println(pq.remove()); // 20
        System.out.println(pq.poll()); // 30

        System.out.println(pq); // [40]
        
        // 6. Conversion
        Object[] obj = pq.toArray();
        for (Object o : obj) {
            System.out.println(o + " ");           // 40
        }

        // 7. Clear
        pq.clear();
        System.out.println(pq); // []
    }

    public static void HashSetMethods() {
        // E. HashSet
        HashSet<String> hs = new HashSet<>();
        
        //1. Adding Elements
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Apple"); // ignored
        hs.add("Mango");
        hs.add("Kiwi");
        System.out.println(hs); // [Apple, Kiwi, Mango, Banana]

        // 2. Size and Emptiness
        System.out.println(hs.size()); // 4
        System.out.println(hs.isEmpty()); // false

        // 3. Searching
        System.out.println(hs.contains("Apple")); // true

        // 4. Removing Elements
        System.out.println(hs.remove("Kiwi")); // [Apple, Mango, Banana]

        System.out.println(hs);

        // 5. Traversing 
        System.out.print("iterator(): "); 
        Iterator<String> it = hs.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");     // Apple Mango Banana 
        }
        System.out.println();

        // using for each loop
        System.out.print("for-each: ");
        for (String s : hs) {
            System.out.print(s + " ");              // Apple Mango Banana 
        }
        System.out.println();

        // 6. Conversion
        Object[] arr = hs.toArray();
        for (Object o : arr) {
            System.out.print(o + " ");       // Apple Mango Banana 
        }
        System.out.println();

        // 7. Clear
        hs.clear();
        System.out.println(hs); //[]

    }

    public static void LinkedHashSetMethods() {
        // F. LinkedHashSet
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // 1. Adding Elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Banana");   // duplicate, ignored
        set.add("Papaya");
        System.out.println(set); // [Apple, Banana, Cherry, Papaya]

        // 2. Size and Emptiness
        System.out.println(set.size()); // 4
        System.out.println(set.isEmpty()); // false

        // 3. Searching 
        System.out.println(set.contains("Cherry"));  // true

        // 4. Removing Elements
        System.out.println(set.remove("Banana")); // true

        // 5. Traversing
        System.out.print("iterator(): ");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " "); // Apple Cherry Papaya 
        }
        System.out.println();

        // using for-each loop
        System.out.print("for-each: ");
        for (String s : set) {
            System.out.print(s + " ");  // Apple Cherry Papaya 
        }
        System.out.println();

        // 6. Conversion
        Object[] arr = set.toArray();
        System.out.print("toArray(): ");
        for (Object o : arr) {
            System.out.print(o + " ");  // Apple Cherry Papaya 
        }
        System.out.println();

        // 7. Clear
        set.clear();
        System.out.println(set); //[]
    }

    public static void TreeSetMethods() {
        // G. TreeSet
        TreeSet<Integer> ts = new TreeSet<>();

        // 1. Adding Elements
        ts.add(50);
        ts.add(10);
        ts.add(30);
        ts.add(20);
        ts.add(40);
        ts.add(30);   // duplicate, ignored
        System.out.println("Initial set (sorted): " + ts); // [10, 20, 30, 40, 50]

        // 2. Size and Emptiness
        System.out.println(ts.size()); // 5
        System.out.println(ts.isEmpty());  // false

        // 3. Accessing Elements
        System.out.println(ts.first());  // 10
        System.out.println(ts.last());  // 50

        // headSet(toElement)  => elements < toElement
        SortedSet<Integer> head = ts.headSet(30);
        System.out.println("headSet(30): " + head);    // [10, 20]

        // tailSet(fromElement) => elements >= fromElement
        SortedSet<Integer> tail = ts.tailSet(30);
        System.out.println("tailSet(30): " + tail);    // [30, 40, 50]


        // 4. subSet
        SortedSet<Integer> sub = ts.subSet(20, 50);
        System.out.println(sub); // [20, 30, 40]


        // 4. Searching 
        System.out.println(ts.contains(20)); // true

        // 5. Removing Elements
        System.out.println(ts.remove(30));  // true

        // 6. Traversing
        System.out.print("for-each ascending: ");
        for (int x : ts) {
            System.out.print(x + " ");   // [10 20 40 50]
        }
        System.out.println();

        // 7. Conversion
        Object[] arr = ts.toArray();
        System.out.print("toArray(): ");
        for (Object o : arr) {
            System.out.print(o + " ");      // [10 20 40 50]
        }
        System.out.println();


        // 8. Clear
        ts.clear();
        System.out.println(ts); //[]

        // 9. TreeSet-specific Navigable methods 
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
        System.out.println("descendingSet(): " + nav.descendingSet()); // [40, 30, 20]
    }


    public static void HashMapMethods() {
         // H. HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // 1. Adding Elements
        // put(K key, V value)
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Papaya");
        map.put(5, "Cherry");
        System.out.println("Initial map: " + map); // {1=Apple, 2=Banana, 3=Cherry, 4=Papaya, 5=Cherry}

        // put with existing key (overwrites value)
        map.put(2, "Blueberry");
        System.out.println("After put(2, \"Blueberry\"): " + map); // {1=Apple, 2=Blueberry, 3=Cherry, 4=Papaya, 5=Cherry}
        
        map.putIfAbsent(6,"Anuj");

        // 2. Size and Emptiness
        System.out.println(map.size()); // 6
        System.out.println(map.isEmpty()); // false

        // 3. Accessing Elements using key
        System.out.println(map.get(2)); // Blueberry
        System.out.println(map.getOrDefault(5, "default")); // Cherry

        System.out.println(map); // {1=Apple, 2=Blueberry, 3=Cherry, 4=Papaya, 5=Cherry, 6=Anuj}

        // 4. Searching
        System.out.println(map.containsKey(0)); // false
        System.out.println(map.containsValue("Cherry")); // true

        // 5. Removing Elements
        System.out.println(map.remove(5)); // Cherry
        System.out.println(map.remove(4,"WrongValue")); // false

        System.out.println(map.replace(3, "Banana")); // Cherry

        // 6. printing
        // keySet() – all keys
        System.out.println("keySet(): " + map.keySet());  // [1, 2, 3, 4, 6]

        // values() – all values
        System.out.println("values(): " + map.values());   // [Apple, Blueberry, Banana, Papaya, Anuj]

        // entrySet() – key-value pairs as Map.Entry
        System.out.println("entrySet(): " + map.entrySet());  // [1=Apple, 2=Blueberry, 3=Banana, 4=Papaya, 6=Anuj]

        // 7. iterate using entry set
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.print(e.getKey() + " ");
            System.out.print(e.getValue() + " ");
        }
        System.out.println();

        //output: 1 Apple 2 Blueberry 3 Banana 4 Papaya 6 Anuj 

        // using keySet
        Set<Integer>Keys = map.keySet();
        for(int key: Keys)
            System.out.println(key + " " + map.get(key));

        // output: 
        // 1 Apple
        // 2 Blueberry
        // 3 Banana
        // 4 Papaya
        // 6 Anuj


        // for each
        System.out.print("forEach(): ");
        map.forEach((k, v) -> System.out.print("{" + k + ":" + v + "} "));   // {1:Apple} {2:Blueberry} {3:Banana} {4:Papaya} {6:Anuj}
        System.out.println();


        map.forEach((k, v) -> System.out.print(v + " "));  // Apple Blueberry Banana Papaya Anuj 

    }

    public static void LinkedHashMapMethods() {
        // I. LinkedHashMap
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // put(K key, V value)
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        System.out.println("Initial map: " + map);   // {1=Apple, 2=Banana, 3=Cherry}

        // put with existing key (overwrites value, keeps key position)
        map.put(2, "Blueberry");
        System.out.println("After put(2, \"Blueberry\"): " + map); // order unchanged
    }

    public static void TreeMapMethods() {
        // J. TreeMap
        SortedMap<Integer, String> map = new TreeMap<>();

        // put(K key, V value) – keys kept in ascending order
        map.put(30, "Thirty");
        map.put(10, "Ten");
        map.put(20, "Twenty");
        map.put(40, "Forty");
        System.out.println("Initial map (sorted by key): " + map); // {10=Ten,20=Twenty,30=Thirty,40=Forty}
    }


    public static void StackMethods() {
        // K. Stack
        Stack<Integer> stack = new Stack<>();
        // 1. Adding Elements
        stack.push(10);
        stack.push(20);
        stack.push(30);   // top = 30
        System.out.println("After push 10,20,30: " + stack);  // [10, 20, 30]

        // 2. Size and Emptiness
        System.out.println(stack.size()); // 3
        System.out.println(stack.isEmpty()); // false

        // 3. Accessing Elements
        System.out.println(stack.peek()); // 30

            stack.push(16);
            stack.push(18);
            stack.push(55);
            stack.push(2);
        System.out.println(stack); // [10, 20, 30, 16, 18, 55, 2]
        System.out.println(stack.get(5)); // 55

        // 4. Searching
        System.out.println(stack.search(18)); // 3    (1-based position from top)
        System.out.println(stack.search(15)); // -1   (if not present in stack)

        // 5. Removing Elements 
        System.out.println(stack.pop()); // 2
        System.out.println(stack.pop());  // 55

        System.out.println(stack); // [10, 20, 30, 16, 18]
    }

    public static void VectorMethods() {
        // L. Vector
        Vector<String> v = new Vector<>();

        // add(E e)
        v.add("Apple");
        v.add("Banana");
        v.add("Cherry");
        System.out.println("Initial vector: " + v);

        // add(int index, E element)
        v.add(1, "Blueberry");
        System.out.println("add(1, \"Blueberry\"): " + v);
    }

    public static void HashtableMethods() {
        // M. HashTable
        Hashtable<Integer, String> table = new Hashtable<>();

        // 1. Adding Elements
        // put(K key, V value)
        table.put(1, "Apple");
        table.put(2, "Banana");
        table.put(3, "Cherry");
        System.out.println("Initial table: " + table); // {3=Cherry, 2=Banana, 1=Apple}

        // put with existing key (overwrites value)
        table.put(2, "Blueberry"); //
        System.out.println("After put(2, \"Blueberry\"): " + table);  // {3=Cherry, 2=Blueberry, 1=Apple}

        // 2. Size and Emptiness
        System.out.println(table.size()); // 3
        System.out.println(table.isEmpty()); // false
        
        // 3. Accessing Elements
        System.out.println(table.get(0)); // null
        
        // 4. Search
        System.out.println(table.containsKey(3)); // true
        System.out.println(table.containsValue(3)); // false
        
        // 5. Remove Elements
        System.out.println(table.remove(1)); // Apple
        
    }
    public static void main(String[] args) {
        
        ArrayListMethods();
        LinkedListMethods();

        ArrayDequeMethods();
        PriorityQueueMethods();

        HashSetMethods();
        LinkedHashSetMethods();
        TreeSetMethods();

        HashMapMethods();
        LinkedHashMapMethods();
        TreeMapMethods();

        StackMethods();
        VectorMethods();
        HashtableMethods();

    }
}
