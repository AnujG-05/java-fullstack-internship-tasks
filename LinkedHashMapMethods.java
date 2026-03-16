import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapMethods {
    public static void main(String[] args) {

        // Insertion-ordered LinkedHashMap
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // put(K key, V value)
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        System.out.println("Initial map: " + map);   // {1=Apple, 2=Banana, 3=Cherry}

        // put with existing key (overwrites value, keeps key position)
        map.put(2, "Blueberry");
        System.out.println("After put(2, \"Blueberry\"): " + map); // order unchanged

        // size()
        System.out.println("size(): " + map.size());

        // get(Object key)
        System.out.println("get(1): " + map.get(1));

        // getOrDefault(Object key, V defaultValue)
        System.out.println("getOrDefault(4, \"Default\"): " + map.getOrDefault(4, "Default"));

        // containsKey, containsValue
        System.out.println("containsKey(2): " + map.containsKey(2));
        System.out.println("containsValue(\"Cherry\"): " + map.containsValue("Cherry"));

        // isEmpty()
        System.out.println("isEmpty(): " + map.isEmpty());

        // remove(Object key)
        String removedVal = map.remove(3);
        System.out.println("remove(3): " + removedVal);
        System.out.println("After remove(3): " + map);

        // remove(Object key, Object value)
        boolean removedPair = map.remove(2, "Wrong");
        System.out.println("remove(2, \"Wrong\"): " + removedPair);
        removedPair = map.remove(2, "Blueberry");
        System.out.println("remove(2, \"Blueberry\"): " + removedPair);
        System.out.println("After conditional remove: " + map);

        // putIfAbsent
        map.putIfAbsent(2, "Banana");
        map.putIfAbsent(1, "NewApple"); // won't overwrite
        System.out.println("After putIfAbsent: " + map);

        // replace
        map.replace(1, "GreenApple");
        System.out.println("replace(1, \"GreenApple\"): " + map);

        // replace with old value check
        boolean replaced = map.replace(1, "Wrong", "RedApple");
        System.out.println("replace(1, \"Wrong\", \"RedApple\"): " + replaced);
        replaced = map.replace(1, "GreenApple", "RedApple");
        System.out.println("replace(1, \"GreenApple\", \"RedApple\"): " + replaced);
        System.out.println("After replace w/ old value: " + map);

        // keySet(), values(), entrySet() – all keep insertion order
        System.out.println("keySet(): " + map.keySet());
        System.out.println("values(): " + map.values());
        System.out.println("entrySet(): " + map.entrySet());

        // Iterate via entrySet()
        System.out.print("Iterate entrySet(): ");
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.print("[" + e.getKey() + "=" + e.getValue() + "] ");
        }
        System.out.println();

        // putAll(Map)
        LinkedHashMap<Integer, String> other = new LinkedHashMap<>();
        other.put(10, "Mango");
        other.put(11, "Orange");
        map.putAll(other);
        System.out.println("After putAll(other): " + map);

        // forEach(BiConsumer)
        System.out.print("forEach(): ");
        map.forEach((k, v) -> System.out.print("{" + k + ":" + v + "} "));
        System.out.println();

        // toString() already shows insertion order
        System.out.println("toString(): " + map);

        // clear()
        map.clear();
        System.out.println("After clear(): " + map + ", isEmpty(): " + map.isEmpty());
    }
}
