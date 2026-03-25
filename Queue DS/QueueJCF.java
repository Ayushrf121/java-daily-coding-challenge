import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
public class QueueJCF {
    public static void main(String[] args) {
        //Queue <Integer> q =new LinkedList<>(); // Implemented by LinkedList and ArrayDeque
        Queue <Integer> q =new ArrayDeque<>();
        q.add(45);
        q.add(65);
        q.add(75);
        q.add(85);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            System.out.println("Removing:"+q.remove());
        }
    }
}
