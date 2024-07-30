import java.util.*;

public class DequeLearn {
    public static void main(String[] args) {
        // ArrayDeque is a class itself and it further implements deque which further implements queue.

        // Adding Elements:
        // 1) addFirst(E e) or offerFirst(E e): Adds an element to the front of the deque.
        // 2) addLast(E e) or offerLast(E e): Adds an element to the end of the deque.
        // Removing Elements:
        // 1) removeFirst() or pollFirst(): Removes and returns the element at the front of deque.
        // 2) removeLast() or pollLast(): Removes and returns the element at the end of deque.
        // Accessing Elements:
        // 1) getFirst() or peekFirsT(): Returns the element at the front of the deque without removing it.
        // 2) getLast() or peekLast(): Returns the element at the end of the deque without removing it.

        // IN DEQUEUE YOU CAN ADD OR REMOVE ELEMENT FORM BOTH SIDES OF THE ARRAY
        // YOU CAN IMPLEMENT ARRAYDEQUE USING QUEUE AND DEQUE BOTH. IN CASE OF QUEUE, THE METHODS OF ArrayDeque will not be available.But for deque, all the methods of queue and deque will be available.
        
        Deque<Integer> ardQueue = new ArrayDeque<>();
        ardQueue.add(379);
        ardQueue.add(535);
        ardQueue.addLast(3948);
        ardQueue.offerFirst(5938);
        ardQueue.addLast(4938);
        ardQueue.offer(295);
        ardQueue.addFirst(9036);
        ardQueue.offerFirst(3302);

        // System.out.println(ardQueue);

        // remove/poll
        // System.out.println(ardQueue.poll());
        // System.out.println(ardQueue.pollLast());
        // System.out.println(ardQueue);

        // peek
        // System.out.println(ardQueue.peekLast());
        // System.out.println(ardQueue.peek());




        // STACK AND QUEUE USING ARRAYDEQUE --------------
        // Stack related methods are there in ArrayDeque class itself. So implement it accordingly.

        // In case of stack implementation with ArrayDeque elements are added from front by push() method and removed from front as well.(Not like traditional stack class)
        // ArrayDeque<Integer> stack = new ArrayDeque<>();
        // stack.push(3445);
        // stack.push(3637);
        // stack.push(87437);
        // stack.push(2647);
        // stack.push(937);

        // System.out.println(stack);

        // System.out.println(stack.peek());
        // System.out.println(stack.pop());
        // System.out.println(stack);

        // queue implementation -------------------------
        // In this case element are added from last by offer() method and the first element entered in the queue will be removed first by poll() method.

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(68490);
        queue.offer(3678);
        queue.offer(94678);
        queue.offer(209);

        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);
    }
}
