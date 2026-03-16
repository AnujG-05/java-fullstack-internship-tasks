import java.util.Hashtable;
import java.util.Map;
import java.util.Enumeration;

public class HashtableMethods {
    public static void main(String[] args) {

        // Create and initialize
        Hashtable<Integer, String> table = new Hashtable<>();

        // put(K key, V value)
        table.put(1, "Apple");
        table.put(2, "Banana");
        table.put(3, "Cherry");
        System.out.println("Initial table: " + table);

        // put with existing key (overwrites value)
        table.put(2, "Blueberry");
        System.out.println("After put(2, \"Blueberry\"): " + table);

        // size()
        System.out.println("size(): " + table.size());

        // get(Object key)
        System.out.println("get(1): " + table.get(1));

        // getOrDefault(Object key, V defaultValue)
        System.out.println("getOrDefault(4, \"Default\"): " + table.getOrDefault(4, "Default"));

        // containsKey(Object key)
        System.out.println("containsKey(2): " + table.containsKey(2));

        // containsValue(Object value)
        System.out.println("containsValue(\"Cherry\"): " + table.containsValue("Cherry"));

        // (legacy) contains(Object value) – same as containsValue
        System.out.println("contains(\"Apple\"): " + table.contains("Apple"));

        // isEmpty()
        System.out.println("isEmpty(): " + table.isEmpty());

        // remove(Object key)
        String removedVal = table.remove(3);
        System.out.println("remove(3): " + removedVal);
        System.out.println("After remove(3): " + table);

        // putIfAbsent(K key, V value)
        table.putIfAbsent(3, "Cherry");
        table.putIfAbsent(1, "NewApple"); // won't overwrite
        System.out.println("After putIfAbsent: " + table);

        // replace(K key, V value)
        table.replace(1, "GreenApple");
        System.out.println("replace(1, \"GreenApple\"): " + table);

        // replace(K key, V oldValue, V newValue)
        boolean replaced = table.replace(1, "Wrong", "RedApple");
        System.out.println("replace(1, \"Wrong\", \"RedApple\"): " + replaced);
        replaced = table.replace(1, "GreenApple", "RedApple");
        System.out.println("replace(1, \"GreenApple\", \"RedApple\"): " + replaced);
        System.out.println("After replace with old value: " + table);

        // keys() – Enumeration of keys (legacy style)
        System.out.print("keys() Enumeration: ");
        Enumeration<Integer> keys = table.keys();
        while (keys.hasMoreElements()) {
            System.out.print(keys.nextElement() + " ");
        }
        System.out.println();

        // elements() – Enumeration of values (legacy)
        System.out.print("elements() Enumeration: ");
        Enumeration<String> elements = table.elements();
        while (elements.hasMoreElements()) {
            System.out.print(elements.nextElement() + " ");
        }
        System.out.println();

        // keySet(), values(), entrySet() – modern view methods
        System.out.println("keySet(): " + table.keySet());
        System.out.println("values(): " + table.values());
        System.out.println("entrySet(): " + table.entrySet());

        // Iterate via entrySet()
        System.out.print("Iterate entrySet(): ");
        for (Map.Entry<Integer, String> e : table.entrySet()) {
            System.out.print("[" + e.getKey() + "=" + e.getValue() + "] ");
        }
        System.out.println();

        // clone() – shallow copy
        @SuppressWarnings("unchecked")
        Hashtable<Integer, String> copy = (Hashtable<Integer, String>) table.clone();
        System.out.println("clone(): " + copy);

        // clear()
        table.clear();
        System.out.println("After clear(): " + table + ", isEmpty(): " + table.isEmpty());
    }
}
