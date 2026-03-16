import java.util.HashSet;
import java.util.Iterator;
// javac -d bin src/Hashset.java && java -cp bin Hashset
public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();    // unordered

        // Insert    => list.add(el)
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);

        // size => list.size()
        System.out.println(set.size());

        // print all elements in set 
        System.out.println(set);

        // search => list.contains(obj)
        if(set.contains(3))      // agar set.contains(obj) returns true then if block get executed
            System.out.println("Set contains 3");

        if(!set.contains(18))       // agar set.contains(obj) returns false then if(!false) => i.e if block get executed
            System.out.println("Set does not contain 18");

        // delete => list.remove(obj)   
        set.remove(1);
        System.out.println("We deleted 1");

        // iterator
        Iterator it = set.iterator();   // .hasNext() returns either true or false; .next() returns element;

        while(it.hasNext())
        System.out.println(it.next());
        
    }
}
