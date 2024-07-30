import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {

        // Java Queue Interface....................

        // boolean add(E e): Inserts the specified element into the queue.
        // boolean offer(E e): Inserts the specified element into the queue. Returns true if the element was added successfully, or false if the queue is full.
        // remove(): Removes and returns the element at the front of the queue. Throws an exception if the queue is empty.
        // poll(): Removes and returns the element at the front of the queue. Returns null if the queue is empty.
        // element(): Retrieves but does not remove the element at the front of the queue. Throws an exception if the queue is empty.
        // peek(): Retrieves but does not remove the element at the front of the queue. Returns null if the queue is empty.

        // In case of queue use offer() to add element, poll() to remove element and peek() to see the element which is next in line to be removed.

        Queue<String> queue = new LinkedList<>();
        queue.add("hello1");
        queue.add("hello2");
        queue.add("hello3");
        queue.add("hello4");
        queue.add("hello5");
        // System.out.println(queue);
        
        // offer method also used to add element in the queue.(It is provided by the Queue interface itself). It doesnot throw any exception in case of any error, instead returns true or false;
        queue.offer("hello6");
        queue.offer("hello7");
        // System.out.println(queue);

        // Remove element ---------------------------
        // poll() and remove() both remove head element, but remove throws exception if the queue is empty but poll instead returns null.
        // queue.poll();
        // System.out.println(queue);
        // queue.remove();
        // System.out.println(queue);

        // See element to be removed --------------------
        // System.out.println(queue.element());
        // System.out.println(queue.peek());

        // Traverse through the queue --------------------
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        System.out.println(queue.poll());
    }
}
