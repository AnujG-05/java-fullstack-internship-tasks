import java.util.LinkedList;
import java.util.List;

public class LinkedListMethods {
    public static void main(String[] args) {

        // Create and initialize
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");          // add(E e) - add at end
        list.add("Banana");
        list.add("Cherry");
        System.out.println("Initial list: " + list);

        // size()
        int size = list.size();
        System.out.println("size(): " + size);

        // add(E e) - already used above

        // add(int index, E element)
        list.add(1, "Blueberry");
        System.out.println("add(1, \"Blueberry\"): " + list);

        // addFirst(E e)
        list.addFirst("Start");
        System.out.println("addFirst(\"Start\"): " + list);

        // addLast(E e)
        list.addLast("End");
        System.out.println("addLast(\"End\"): " + list);

        // get(int index)
        String first = list.get(0);
        System.out.println("get(0): " + first);

        // getFirst()
        String getFirst = list.getFirst();
        System.out.println("getFirst(): " + getFirst);

        // getLast()
        String getLast = list.getLast();
        System.out.println("getLast(): " + getLast);

        // set(int index, E element)
        list.set(2, "Blackberry");
        System.out.println("set(2, \"Blackberry\"): " + list);

        // contains(Object o)
        boolean hasBanana = list.contains("Banana");
        System.out.println("contains(\"Banana\"): " + hasBanana);

        // indexOf(Object o)
        int idxBanana = list.indexOf("Banana");
        System.out.println("indexOf(\"Banana\"): " + idxBanana);

        // lastIndexOf(Object o)
        list.add("Banana");  // duplicate for demo
        System.out.println("After adding another \"Banana\": " + list);
        int lastIdxBanana = list.lastIndexOf("Banana");
        System.out.println("lastIndexOf(\"Banana\"): " + lastIdxBanana);

        // remove(int index)
        String removedIndex = list.remove(1);
        System.out.println("remove(1): removed = " + removedIndex);
        System.out.println("After remove(1): " + list);

        // remove(Object o)
        boolean removedValue = list.remove("Cherry");
        System.out.println("remove(\"Cherry\"): " + removedValue);
        System.out.println("After remove(\"Cherry\"): " + list);

        // removeFirst()
        String remFirst = list.removeFirst();
        System.out.println("removeFirst(): " + remFirst);
        System.out.println("After removeFirst(): " + list);

        // removeLast()
        String remLast = list.removeLast();
        System.out.println("removeLast(): " + remLast);
        System.out.println("After removeLast(): " + list);

        // isEmpty()
        boolean empty = list.isEmpty();
        System.out.println("isEmpty(): " + empty);

        // offer(E e), offerFirst(E e), offerLast(E e)  (queue/deque-style adds)
        list.offer("Kiwi");
        list.offerFirst("Mango");
        list.offerLast("Papaya");
        System.out.println("After offer/offerFirst/offerLast: " + list);

        // peek(), peekFirst(), peekLast() (read head/tail without removing)
        String peek = list.peek();
        String peekFirst = list.peekFirst();
        String peekLast = list.peekLast();
        System.out.println("peek(): " + peek);
        System.out.println("peekFirst(): " + peekFirst);
        System.out.println("peekLast(): " + peekLast);

        // poll(), pollFirst(), pollLast() (read + remove)
        String poll = list.poll();
        String pollFirst = list.pollFirst();
        String pollLast = list.pollLast();
        System.out.println("poll(): " + poll);
        System.out.println("pollFirst(): " + pollFirst);
        System.out.println("pollLast(): " + pollLast);
        System.out.println("After poll operations: " + list);

        // push(E e), pop()  (stack-style)
        list.clear();
        list.push("A");
        list.push("B");
        list.push("C");     // top = "C"
        System.out.println("After push A,B,C (stack): " + list);
        String popped = list.pop(); // removes "C"
        System.out.println("pop(): " + popped);
        System.out.println("After pop(): " + list);

        // subList(int fromIndex, int toIndex)  (via List reference)
        list.clear();
        list.add("X");
        list.add("Y");
        list.add("Z");
        list.add("W");
        System.out.println("Current list: " + list);
        List<String> sub = list.subList(1, 3); // Y, Z
        System.out.println("subList(1,3): " + sub);

        // clear()
        list.clear();
        System.out.println("After clear(): " + list);

        // toArray()
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        Object[] arr = colors.toArray();
        System.out.print("toArray(): ");
        for (Object o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
