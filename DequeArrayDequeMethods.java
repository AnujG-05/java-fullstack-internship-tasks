import java.util.Deque;
import java.util.ArrayDeque;

public class DequeArrayDequeMethods {
    public static void main(String[] args) {

        // Using Deque reference with ArrayDeque implementation
        Deque<String> dq = new ArrayDeque<>();

        // ---- Add elements (both ends) ----

        // addLast(e) / add(e): add at tail
        dq.add("B");                 // same as addLast("B")
        dq.addLast("C");
        System.out.println("After add/addLast: " + dq);

        // addFirst(e): add at head
        dq.addFirst("A");
        System.out.println("addFirst(\"A\"): " + dq);

        // offer(e), offerFirst(e), offerLast(e)  (return boolean)
        dq.offer("D");               // tail
        dq.offerFirst("Start");      // head
        dq.offerLast("End");         // tail
        System.out.println("After offer/offerFirst/offerLast: " + dq);

        // size()
        System.out.println("size(): " + dq.size());

        // isEmpty()
        System.out.println("isEmpty(): " + dq.isEmpty());

        // contains(Object o)
        System.out.println("contains(\"C\"): " + dq.contains("C"));

        // ---- Access elements without removing (peek) ----

        // peek(): head or null if empty
        System.out.println("peek(): " + dq.peek());

        // peekFirst(), peekLast()
        System.out.println("peekFirst(): " + dq.peekFirst());
        System.out.println("peekLast(): " + dq.peekLast());

        // getFirst(), getLast()  (throw exception if empty)
        System.out.println("getFirst(): " + dq.getFirst());
        System.out.println("getLast(): " + dq.getLast());

        // ---- Remove elements (both ends) ----

        // poll(): remove and return head, null if empty
        System.out.println("poll(): " + dq.poll());
        System.out.println("After poll(): " + dq);

        // pollFirst(), pollLast()
        System.out.println("pollFirst(): " + dq.pollFirst());
        System.out.println("pollLast(): " + dq.pollLast());
        System.out.println("After pollFirst & pollLast: " + dq);

        // remove(): remove and return head, throws if empty
        String removedHead = dq.remove();
        System.out.println("remove(): " + removedHead);
        System.out.println("After remove(): " + dq);

        // removeFirst(), removeLast()
        dq.addFirst("X");
        dq.addLast("Y");
        dq.addLast("Z");
        System.out.println("Before removeFirst/Last: " + dq);
        System.out.println("removeFirst(): " + dq.removeFirst());
        System.out.println("removeLast(): " + dq.removeLast());
        System.out.println("After removeFirst/Last: " + dq);

        // remove(Object o)
        boolean removed = dq.remove("C");
        System.out.println("remove(\"C\"): " + removed);
        System.out.println("After remove(\"C\"): " + dq);

        // ---- Stack-style operations with ArrayDeque ----

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10);     // same as addFirst(10)
        stack.push(20);
        stack.push(30);
        System.out.println("Stack (ArrayDeque): " + stack);
        System.out.println("stack.peek(): " + stack.peek());  // top element
        System.out.println("stack.pop(): " + stack.pop());    // remove top
        System.out.println("After pop: " + stack);

        // ---- Iterate and toArray() ----

        dq.clear();
        dq.add("Red");
        dq.add("Green");
        dq.add("Blue");
        System.out.print("for-each over dq: ");
        for (String s : dq) {
            System.out.print(s + " ");
        }
        System.out.println();

        Object[] arr = dq.toArray();
        System.out.print("toArray(): ");
        for (Object o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();

        // clear()
        dq.clear();
        System.out.println("After clear(): " + dq + ", isEmpty(): " + dq.isEmpty());
    }
}
