import java.util.Stack;

public class StackMethods {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // empty()
        System.out.println("empty(): " + stack.empty());

        // push(E item)
        stack.push(10);
        stack.push(20);
        stack.push(30);   // top = 30
        System.out.println("After push 10,20,30: " + stack);

        // peek() – look at top without removing
        System.out.println("peek(): " + stack.peek());   // 30

        // search(Object o) – 1-based position from top, -1 if not found
        System.out.println("search(20): " + stack.search(20)); // 2
        System.out.println("search(99): " + stack.search(99)); // -1

        // pop() – remove and return top
        Integer popped1 = stack.pop();   // removes 30
        System.out.println("pop(): " + popped1);
        System.out.println("After first pop: " + stack);

        Integer popped2 = stack.pop();   // removes 20
        System.out.println("pop(): " + popped2);
        System.out.println("After second pop: " + stack);

        // empty() again
        System.out.println("empty(): " + stack.empty());

        // Inherited Vector methods
        stack.push(40);
        stack.push(50);
        System.out.println("Stack now: " + stack);
        System.out.println("size(): " + stack.size());
        System.out.println("get(0): " + stack.get(0));

        // clear via pop
        while (!stack.empty()) {
            System.out.println("popping: " + stack.pop());
        }
        System.out.println("Final stack: " + stack + ", empty(): " + stack.empty());
    }
}
