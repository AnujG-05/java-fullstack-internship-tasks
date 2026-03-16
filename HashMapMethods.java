import java.util.HashMap;
import java.util.Map;

public class HashMapMethods {
    public static void main(String[] args) {

        // Create and initialize
        HashMap<Integer, String> map = new HashMap<>();

        // put(K key, V value)
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        System.out.println("Initial map: " + map);

        // put with existing key (overwrites value)
        map.put(2, "Blueberry");
        System.out.println("After put(2, \"Blueberry\"): " + map);

        // size()
        System.out.println("size(): " + map.size());

        // get(Object key)
        String v1 = map.get(1);
        System.out.println("get(1): " + v1);

        // getOrDefault(Object key, V defaultValue)
        String v2 = map.getOrDefault(4, "DefaultValue");
        System.out.println("getOrDefault(4, \"DefaultValue\"): " + v2);

        // containsKey(Object key)
        System.out.println("containsKey(2): " + map.containsKey(2));
        System.out.println("containsKey(10): " + map.containsKey(10));

        // containsValue(Object value)
        System.out.println("containsValue(\"Cherry\"): " + map.containsValue("Cherry"));
        System.out.println("containsValue(\"Grapes\"): " + map.containsValue("Grapes"));

        // isEmpty()
        System.out.println("isEmpty(): " + map.isEmpty());

        // remove(Object key)
        String removedVal = map.remove(3);
        System.out.println("remove(3): " + removedVal);
        System.out.println("After remove(3): " + map);

        // remove(Object key, Object value) – conditional remove
        boolean removedPair = map.remove(2, "WrongValue");
        System.out.println("remove(2, \"WrongValue\"): " + removedPair);
        removedPair = map.remove(2, "Blueberry");
        System.out.println("remove(2, \"Blueberry\"): " + removedPair);
        System.out.println("After conditional remove(2,\"Blueberry\"): " + map);

        // putIfAbsent(K key, V value)
        map.putIfAbsent(2, "Banana");
        map.putIfAbsent(1, "NewApple"); // won't overwrite
        System.out.println("After putIfAbsent: " + map);

        // replace(K key, V value)
        map.replace(1, "GreenApple");
        System.out.println("replace(1, \"GreenApple\"): " + map);

        // replace(K key, V oldValue, V newValue)
        boolean replaced = map.replace(1, "Wrong", "RedApple");
        System.out.println("replace(1, \"Wrong\", \"RedApple\"): " + replaced);
        replaced = map.replace(1, "GreenApple", "RedApple");
        System.out.println("replace(1, \"GreenApple\", \"RedApple\"): " + replaced);
        System.out.println("After replace with old value check: " + map);

        // keySet() – all keys
        System.out.println("keySet(): " + map.keySet());

        // values() – all values
        System.out.println("values(): " + map.values());

        // entrySet() – key-value pairs as Map.Entry
        System.out.println("entrySet(): " + map.entrySet());

        // Iterate via entrySet()
        System.out.print("Iterate entrySet(): ");
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.print("[" + e.getKey() + "=" + e.getValue() + "] ");
        }
        System.out.println();

        // putAll(Map)
        HashMap<Integer, String> other = new HashMap<>();
        other.put(10, "Mango");
        other.put(11, "Orange");
        map.putAll(other);
        System.out.println("After putAll(other): " + map);

        // forEach(BiConsumer)
        System.out.print("forEach(): ");
        map.forEach((k, v) -> System.out.print("{" + k + ":" + v + "} "));
        System.out.println();

        // clear()
        map.clear();
        System.out.println("After clear(): " + map + ", isEmpty(): " + map.isEmpty());
    }
}
