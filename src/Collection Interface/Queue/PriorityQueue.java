import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {

        // by default priority queue implements mean heap datastructure to sort the elements.
        
        // By defult between two numbers the smaller one will get the highest priority and will be removed first.
        Queue<Integer> pq = new java.util.PriorityQueue<>((a,b) -> b-a);
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);
        System.out.println(pq);

        // the smallest element from the queue will be removed first and this will continue.

        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
