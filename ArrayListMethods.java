import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {

        // Create and initialize
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("Initial list: " + list);

        // size()
        int size = list.size();
        System.out.println("size(): " + size);

        // add(E e)
        list.add("Date");
        System.out.println("add(\"Date\"): " + list);

        // add(int index, E element)
        list.add(1, "Blueberry");
        System.out.println("add(1, \"Blueberry\"): " + list);

        // get(int index)
        String first = list.get(0);
        System.out.println("get(0): " + first);

        // set(int index, E element)
        list.set(2, "Blackberry");
        System.out.println("set(2, \"Blackberry\"): " + list);

        // remove(int index)
        String removedByIndex = list.remove(3);   // removes element at index 3
        System.out.println("remove(3): removed = " + removedByIndex);
        System.out.println("After remove(3): " + list);

        // remove(Object o)
        boolean removedByValue = list.remove("Apple");
        System.out.println("remove(\"Apple\"): " + removedByValue);
        System.out.println("After remove(\"Apple\"): " + list);

        // contains(Object o)
        boolean hasBanana = list.contains("Banana");
        System.out.println("contains(\"Banana\"): " + hasBanana);

        // isEmpty()
        boolean empty = list.isEmpty();
        System.out.println("isEmpty(): " + empty);

        // indexOf(Object o)
        int idxBanana = list.indexOf("Banana");
        System.out.println("indexOf(\"Banana\"): " + idxBanana);

        // lastIndexOf(Object o)
        list.add("Banana"); // duplicate for demo
        System.out.println("After adding another \"Banana\": " + list);
        int lastIdxBanana = list.lastIndexOf("Banana");
        System.out.println("lastIndexOf(\"Banana\"): " + lastIdxBanana);

        // subList(int fromIndex, int toIndex)
        List<String> sub = list.subList(0, 2); // 0 and 1
        System.out.println("subList(0,2): " + sub);

        // clear()
        ArrayList<String> temp = new ArrayList<>(list);
        temp.clear();
        System.out.println("After clear(): " + temp);

        // addAll(Collection<? extends E>)
        ArrayList<String> more = new ArrayList<>();
        more.add("Kiwi");
        more.add("Lemon");
        list.addAll(more);
        System.out.println("addAll(more): " + list);

        // toArray()
        Object[] arr = list.toArray();
        System.out.print("toArray(): ");
        for (Object o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();

        // for-each iteration
        System.out.print("for-each: ");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}