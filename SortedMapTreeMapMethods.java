import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map;

public class SortedMapTreeMapMethods {
    public static void main(String[] args) {

        // TreeMap implements SortedMap (and NavigableMap)
        SortedMap<Integer, String> map = new TreeMap<>();

        // put(K key, V value) – keys kept in ascending order
        map.put(30, "Thirty");
        map.put(10, "Ten");
        map.put(20, "Twenty");
        map.put(40, "Forty");
        System.out.println("Initial map (sorted by key): " + map); // {10=Ten,20=Twenty,30=Thirty,40=Forty}

        // size()
        System.out.println("size(): " + map.size());

        // get(Object key)
        System.out.println("get(20): " + map.get(20));

        // containsKey / containsValue
        System.out.println("containsKey(10): " + map.containsKey(10));
        System.out.println("containsValue(\"Forty\"): " + map.containsValue("Forty"));

        // isEmpty()
        System.out.println("isEmpty(): " + map.isEmpty());

        // firstKey(), lastKey()
        System.out.println("firstKey(): " + map.firstKey()); // smallest key
        System.out.println("lastKey(): " + map.lastKey());   // largest key

        // headMap(toKey): < toKey
        SortedMap<Integer, String> head = map.headMap(30);
        System.out.println("headMap(30): " + head);          // {10=Ten,20=Twenty}

        // tailMap(fromKey): >= fromKey
        SortedMap<Integer, String> tail = map.tailMap(20);
        System.out.println("tailMap(20): " + tail);          // {20=Twenty,30=Thirty,40=Forty}

        // subMap(fromKey, toKey): [fromKey, toKey)
        SortedMap<Integer, String> sub = map.subMap(10, 40);
        System.out.println("subMap(10,40): " + sub);         // {10=Ten,20=Twenty,30=Thirty}

        // remove(Object key)
        String removed = map.remove(20);
        System.out.println("remove(20): " + removed);
        System.out.println("After remove(20): " + map);

        // keySet(), values(), entrySet() – all sorted by key
        System.out.println("keySet(): " + map.keySet());
        System.out.println("values(): " + map.values());
        System.out.println("entrySet(): " + map.entrySet());

        // Iterate via entrySet()
        System.out.print("Iterate entrySet(): ");
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.print("[" + e.getKey() + "=" + e.getValue() + "] ");
        }
        System.out.println();

        // clear()
        map.clear();
        System.out.println("After clear(): " + map + ", isEmpty(): " + map.isEmpty());

        // ---------- TreeMap Navigable methods (extra) ----------
        TreeMap<Integer, String> nav = new TreeMap<>();
        nav.put(10, "Ten");
        nav.put(20, "Twenty");
        nav.put(30, "Thirty");
        nav.put(40, "Forty");
        nav.put(50, "Fifty");

        System.out.println("\nTreeMap nav: " + nav);

        // firstEntry(), lastEntry()
        System.out.println("firstEntry(): " + nav.firstEntry());
        System.out.println("lastEntry(): " + nav.lastEntry());

        // lowerKey(k): greatest key < k
        System.out.println("lowerKey(30): " + nav.lowerKey(30));      // 20

        // floorKey(k): greatest key <= k
        System.out.println("floorKey(30): " + nav.floorKey(30));      // 30

        // higherKey(k): least key > k
        System.out.println("higherKey(30): " + nav.higherKey(30));    // 40

        // ceilingKey(k): least key >= k
        System.out.println("ceilingKey(25): " + nav.ceilingKey(25));  // 30

        // pollFirstEntry(), pollLastEntry() – retrieve + remove
        System.out.println("pollFirstEntry(): " + nav.pollFirstEntry());
        System.out.println("pollLastEntry(): " + nav.pollLastEntry());
        System.out.println("After pollFirst/Last: " + nav);

        // descendingMap()
        System.out.println("descendingMap(): " + nav.descendingMap());
    }
}
