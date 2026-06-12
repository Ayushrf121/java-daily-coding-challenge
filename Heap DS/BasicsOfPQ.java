import java.util.PriorityQueue;

public class BasicsOfPQ {
    public static void main(String[] args) {
        // Initialized PQ.
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // O(log n);
        pq.add(15);
        pq.add(55);
        pq.add(5);
        pq.add(12);
        pq.add(24);
        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            // O(log n)
            pq.remove();
        }
        System.out.println(pq.peek());
    }
}
