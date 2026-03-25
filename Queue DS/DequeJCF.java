import java.util.Deque;
import java.util.LinkedList;

public class DequeJCF{
    public static void main(String[] args) {
        Deque <Integer> dq = new LinkedList<>();
        dq.addFirst(2);
        dq.addFirst(3);
        System.out.println(dq); // 3,2
        dq.addLast(1);
        dq.addLast(4);
        System.out.println(dq); // 3,2,1,4
        dq.removeFirst();//3
        dq.removeFirst();//2
        System.out.println(dq);
        dq.removeLast();//4
        dq.add(45);
        dq.add(65);
        System.out.println(dq);
        dq.remove();
        System.out.println(dq);
    }
}