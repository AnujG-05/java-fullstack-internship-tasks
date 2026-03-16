import java.util.*;

public class CollectionFrameworkkabounceback {
    public static void main(String[] args) {

        // ========================================
        // 1. LIST (ArrayList & LinkedList common + extras)
        // ========================================

        System.out.println("=== 1. LIST DEMO (ArrayList & LinkedList) ===");

        // Creation
        ArrayList<String> al = new ArrayList<>();
        LinkedList<String> ll = new LinkedList<>();

        // A. Adding Elements
        // add(E), add(int index, E), addAll(Collection)
        al.add("Apple");                    // add at end
        al.add("Cherry");
        al.add(1, "Banana");                // insert at index
        System.out.println("ArrayList after adds: " + al);  // [Apple, Banana, Cherry]

        ll.add("X");
        ll.add("Z");
        ll.addAll(al);                      // add entire collection at end
        System.out.println("LinkedList after addAll: " + ll);  // [X, Z, Apple, Banana, Cherry]

        // LinkedList-specific (Deque methods)
        ll.addFirst("First");
        ll.addLast("Last");
        System.out.println("LinkedList after addFirst/addLast: " + ll);
        // [First, X, Z, Apple, Banana, Cherry, Last]

        // B. Size & Emptiness
        System.out.println("al.size(): " + al.size());      // 3
        System.out.println("ll.isEmpty(): " + ll.isEmpty()); // false

        // C. Accessing Elements
        // get(int index)
        System.out.println("al.get(1): " + al.get(1));      // Banana

        // LinkedList-specific
        System.out.println("ll.getFirst(): " + ll.getFirst()); // First
        System.out.println("ll.getLast(): " + ll.getLast());   // Last

        // set(int index, E) - replaces & returns old
        String old = al.set(0, "Apricot");
        System.out.println("set returned old: " + old + ", list now: " + al);
        // Apricot, Banana, Cherry

        // D. Searching
        // contains(Object), indexOf(Object), lastIndexOf(Object)
        System.out.println("al.contains(\"Banana\"): " + al.contains("Banana")); // true
        System.out.println("al.indexOf(\"Cherry\"): " + al.indexOf("Cherry"));   // 2
        al.add("Banana"); // duplicate for demo
        System.out.println("al.lastIndexOf(\"Banana\"): " + al.lastIndexOf("Banana")); // 3

        // E. Removing Elements
        // remove(int index), remove(Object) - returns removed / boolean
        String remIndex = al.remove(1);                 // removes Banana at 1
        System.out.println("remove(index) returned: " + remIndex + ", list: " + al);

        boolean remObj = al.remove("Apricot");
        System.out.println("remove(object) success: " + remObj + ", list: " + al);

        // LinkedList-specific
        System.out.println("ll.removeFirst(): " + ll.removeFirst()); // First
        System.out.println("ll.removeLast(): " + ll.removeLast());   // Last

        // F. Sub-view & Conversion
        // subList(int from, int to) - backed view
        List<String> sub = al.subList(0, 2);
        System.out.println("subList(0,2): " + sub);

        // toArray()
        Object[] arr = al.toArray();
        System.out.println("toArray(): " + Arrays.toString(arr));

        // G. Clear
        al.clear();
        System.out.println("After clear(): " + al + ", isEmpty: " + al.isEmpty()); // true

        System.out.println("\n");

        // ========================================
        // 2. QUEUE & DEQUE (PriorityQueue & ArrayDeque)
        // ========================================

        System.out.println("=== 2. QUEUE & DEQUE DEMO ===");

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayDeque<String> dq = new ArrayDeque<>();

        // A. Adding (Queue/Deque style)
        pq.add(30);
        pq.offer(10);           // same as add, but returns false instead of exception
        pq.add(20);
        System.out.println("PriorityQueue (min-heap): " + pq); // [10, 20, 30] (heap order)

        dq.add("B");
        dq.addFirst("A");
        dq.addLast("C");
        dq.offerFirst("Start");
        dq.offerLast("End");
        dq.push("Top");         // same as addFirst
        System.out.println("ArrayDeque after adds/push: " + dq);
        // [Top, Start, A, B, C, End]

        // B. Peek (access without remove)
        System.out.println("pq.peek(): " + pq.peek());         // 10 (head)
        System.out.println("pq.element(): " + pq.element());   // same, but throws if empty

        System.out.println("dq.peekFirst(): " + dq.peekFirst()); // Top
        System.out.println("dq.peekLast(): " + dq.peekLast());   // End

        // C. Poll (remove + return)
        System.out.println("pq.poll(): " + pq.poll());         // 10
        System.out.println("After poll: " + pq);

        System.out.println("dq.pollFirst(): " + dq.pollFirst()); // Top
        System.out.println("dq.pop(): " + dq.pop());             // same as pollFirst
        System.out.println("dq.pollLast(): " + dq.pollLast());   // End

        // D. Other
        System.out.println("pq.contains(20): " + pq.contains(20)); // true
        pq.remove(20); // removes specific value
        System.out.println("After remove(20): " + pq);

        pq.clear();
        System.out.println("After clear(): " + pq);

        System.out.println("\n");

        // ========================================
        // 3. SET (HashSet, LinkedHashSet, TreeSet)
        // ========================================

        System.out.println("=== 3. SET DEMO ===");

        HashSet<String> hs = new HashSet<>();
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        TreeSet<Integer> ts = new TreeSet<>();

        // A. Adding (duplicates ignored)
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Apple"); // ignored
        System.out.println("HashSet (unordered): " + hs);

        lhs.add("X");
        lhs.add("Y");
        lhs.add("X"); // ignored
        System.out.println("LinkedHashSet (insertion order): " + lhs); // [X, Y]

        ts.add(50);
        ts.add(10);
        ts.add(30);
        ts.add(30); // ignored
        System.out.println("TreeSet (sorted): " + ts); // [10, 30, 50]

        // B. Basic Operations
        System.out.println("hs.size(): " + hs.size());           // 2
        System.out.println("hs.contains(\"Banana\"): " + hs.contains("Banana")); // true
        hs.remove("Apple");
        System.out.println("After remove: " + hs);

        // C. TreeSet-specific (Sorted/Navigable)
        System.out.println("ts.first(): " + ts.first());     // 10
        System.out.println("ts.last(): " + ts.last());       // 50
        System.out.println("ts.headSet(30): " + ts.headSet(30)); // [10]
        System.out.println("ts.tailSet(30): " + ts.tailSet(30)); // [30, 50]
        System.out.println("ts.subSet(10, 50): " + ts.subSet(10, 50)); // [10, 30]

        System.out.println("ts.lower(35): " + ts.lower(35)); // 30
        System.out.println("ts.floor(30): " + ts.floor(30)); // 30
        System.out.println("ts.higher(30): " + ts.higher(30)); // 50
        System.out.println("ts.ceiling(25): " + ts.ceiling(25)); // 30

        System.out.println("ts.pollFirst(): " + ts.pollFirst()); // 10
        System.out.println("ts.pollLast(): " + ts.pollLast());   // 50
        System.out.println("After pollFirst/pollLast: " + ts);  // [30]

        System.out.println("\n");

        // ========================================
        // 4. MAP (HashMap, LinkedHashMap, TreeMap)
        // ========================================

        System.out.println("=== 4. MAP DEMO ===");

        HashMap<String, Integer> hm = new HashMap<>();
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        TreeMap<Integer, String> tm = new TreeMap<>();

        // A. Putting Entries
        hm.put("Apple", 10);
        hm.put("Banana", 20);
        hm.put("Apple", 15); // overwrites
        System.out.println("HashMap: " + hm);

        lhm.put("X", 1);
        lhm.put("Y", 2);
        System.out.println("LinkedHashMap (insertion order): " + lhm);

        tm.put(30, "Thirty");
        tm.put(10, "Ten");
        tm.put(20, "Twenty");
        System.out.println("TreeMap (sorted by key): " + tm);

        // B. Getting & Defaults
        System.out.println("hm.get(\"Banana\"): " + hm.get("Banana")); // 20
        System.out.println("hm.getOrDefault(\"Cherry\", 0): " + hm.getOrDefault("Cherry", 0)); // 0

        // C. Contains & Size
        System.out.println("hm.containsKey(\"Apple\"): " + hm.containsKey("Apple")); // true
        System.out.println("hm.containsValue(15): " + hm.containsValue(15)); // true
        System.out.println("hm.size(): " + hm.size());

        // D. Modern Operations
        hm.putIfAbsent("Banana", 99); // no change
        hm.putIfAbsent("Cherry", 30);
        System.out.println("After putIfAbsent: " + hm);

        hm.replace("Cherry", 35);
        System.out.println("After replace: " + hm);

        boolean replaced = hm.replace("Apple", 15, 100); // old value check
        System.out.println("replace with old check: " + replaced);

        // E. Removing
        hm.remove("Banana");
        hm.remove("Cherry", 30); // conditional - false if value wrong
        System.out.println("After removes: " + hm);

        // F. Views & Iteration
        System.out.println("hm.keySet(): " + hm.keySet());
        System.out.println("hm.values(): " + hm.values());
        System.out.println("hm.entrySet(): " + hm.entrySet());

        System.out.print("forEach: ");
        hm.forEach((k, v) -> System.out.print(k + "=" + v + " "));
        System.out.println();

        // G. TreeMap-specific
        System.out.println("tm.firstKey(): " + tm.firstKey()); // 10
        System.out.println("tm.lastKey(): " + tm.lastKey());   // 30
        System.out.println("tm.headMap(20): " + tm.headMap(20)); // {10=Ten}
        System.out.println("tm.subMap(10, 30): " + tm.subMap(10, 30)); // {10=Ten, 20=Twenty}

        System.out.println("\n");

        // ========================================
        // 5. LEGACY (Stack, Vector, Hashtable)
        // ========================================

        System.out.println("=== 5. LEGACY DEMO ===");

        Stack<Integer> stack = new Stack<>();
        Vector<String> vec = new Vector<>();
        Hashtable<String, Integer> ht = new Hashtable<>();

        // Stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);
        System.out.println("stack.peek(): " + stack.peek());     // 30
        System.out.println("stack.pop(): " + stack.pop());       // 30
        System.out.println("stack.search(10): " + stack.search(10)); // 2 (1-based from top)
        System.out.println("stack.empty(): " + stack.empty());   // false

        // Vector
        vec.add("A");
        vec.add("C");
        vec.add(1, "B");
        System.out.println("Vector: " + vec);
        System.out.println("vec.capacity(): " + vec.capacity()); // usually 10 initially

        // Hashtable (no nulls, synchronized)
        ht.put("One", 1);
        ht.put("Two", 2);
        System.out.println("Hashtable: " + ht);

        System.out.println();
    }
}

// Summary (grouped by interface/implementation):
// 
// Collection (common to List/Set/Queue):
//   size(), isEmpty(), add(E), addAll(Collection), contains(Object), remove(Object), clear(), toArray(), iterator()/for-each
//
// List extras:
//   add(int index, E), get(int index), set(int index, E), indexOf(Object), lastIndexOf(Object), subList(int from, int to), remove(int index)
//
// Deque extras (LinkedList/ArrayDeque):
//   addFirst/Last(E), offerFirst/Last(E), getFirst/Last(), peekFirst/Last(), removeFirst/Last(), pollFirst/Last(), push(E), pop()
//
// Queue extras (PriorityQueue):
//   offer(E), peek()/element(), poll()/remove()
//
// Set (no duplicates):
//   add returns false on duplicate
//
// SortedSet/NavigableSet (TreeSet):
//   first(), last(), headSet/to, tailSet/from, subSet, lower/floor/higher/ceiling, pollFirst/Last(), descendingSet()
//
// Map (common):
//   put(K,V), get(K), getOrDefault(), containsKey/Value, putIfAbsent, replace, remove(key/value), keySet(), values(), entrySet(), forEach(), putAll()
//
// SortedMap/NavigableMap (TreeMap):
//   firstKey(), lastKey(), headMap, tailMap, subMap, lowerKey/floorKey/higherKey/ceilingKey, pollFirstEntry/LastEntry()
//
// Legacy:
//   Stack: push/pop/peek/search/empty()
//   Vector: capacity(), elements() (Enumeration)
//   Hashtable: legacy keys()/elements() Enumeration, contains(value)