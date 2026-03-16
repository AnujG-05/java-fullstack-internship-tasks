import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map= new HashMap<>();  // Unique keys and there Values    aslo unordered

        // insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 200);

        System.out.println(map);

        map.put("India", 180);   
        // key ke corresoponding value get updated and if key not present in map then new value for that key get added into the map like insertion
        System.out.println(map);


        // search 
        if(map.containsKey("India"))                                // map.containsKey(key:) returns either true or false
        {
            System.out.println("key is present in the map");
        }
        else 
            System.out.println("key is not present in the map");

        System.out.println(map.get("India")); // case 1: key exists      returns the corresponding value for this key
        System.out.println(map.get("UK")); // case 2: key does not exist   returns null


        // iterator   for(type var:Collection)
        //Method 1:
         for(Map.Entry<String, Integer> e:map.entrySet())    // entrySet => key + Value
         {
            System.out.print(e.getKey() + " ");
            System.out.print(e.getValue() + " ");
         }

        // output: China 200 US 30 India 180 

        System.out.println();
        // Method2

        Set<String>keys = map.keySet();
        for(String key:keys)
        {
            System.out.println(key + " " + map.get(key));
        }

        // output:
        // China 200
        // US 30
        // India 180
        //


        // delete
        map.remove("China");   // key along with value of that get removed from the map

        System.out.print(map);
    }
}
