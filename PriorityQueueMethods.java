import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueueMethods {
    public static void main(String[] args) {

        // Default: MIN-heap (smallest element has highest priority)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // add(E e) / offer(E e)
        pq.add(30);          // same as offer()
        pq.offer(10);
        pq.add(20);
        pq.offer(40);

        System.out.println("Initial pq (heap order, not sorted): " + pq);

        // size()
        int size = pq.size();
        System.out.println("size(): " + size);

        // peek() - head element without removing (null if empty)
        Integer head = pq.peek();
        System.out.println("peek(): " + head);

        // element() - like peek(), but throws exception if empty
        Integer headElement = pq.element();
        System.out.println("element(): " + headElement);

        // contains(Object o)
        boolean has20 = pq.contains(20);
        System.out.println("contains(20): " + has20);

        // remove(Object o) - remove specific value (if present)
        boolean removed20 = pq.remove(20);
        System.out.println("remove(20): " + removed20);
        System.out.println("After remove(20): " + pq);

        // poll() - remove and return head (null if empty)
        Integer polled1 = pq.poll();
        System.out.println("poll(): " + polled1);
        System.out.println("After first poll: " + pq);

        // remove() - remove and return head (throws if empty)
        Integer removedHead = pq.remove();
        System.out.println("remove(): " + removedHead);
        System.out.println("After remove(): " + pq);

        // isEmpty()
        boolean empty = pq.isEmpty();
        System.out.println("isEmpty(): " + empty);

        // addAll(Collection<? extends E>)
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        pq2.add(5);
        pq2.add(15);
        pq2.add(25);
        pq.addAll(pq2);
        System.out.println("After addAll(pq2): " + pq);

        // toArray()
        Object[] arr = pq.toArray();
        System.out.print("toArray(): ");
        for (Object o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();

        // clear()
        pq.clear();
        System.out.println("After clear(): " + pq + ", isEmpty(): " + pq.isEmpty());

        // -------- Custom Comparator: MAX-heap example --------
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.add(10);
        maxHeap.add(5);
        maxHeap.add(30);
        maxHeap.add(20);

        System.out.println("Max-heap pq: " + maxHeap);
        System.out.print("Polling from max-heap: ");
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }
        System.out.println();
    }
}
