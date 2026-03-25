// Queue Reversal
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ques3 {
    public static void reverseQueue(Queue<Integer>q){
        if(q.isEmpty()){
            return;
        }
        Stack<Integer>stk = new Stack<>();
        while (!q.isEmpty()) {
            stk.push(q.remove());
        }
        while (!stk.isEmpty()) {
            q.add(stk.pop());
        }
        return;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        reverseQueue(q);
        while (!q.isEmpty()) {
            System.out.print(q.remove()+" ");
        }
    }
}
