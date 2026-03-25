import java.util.LinkedList;
import java.util.Queue;
public class StackUsing2Q {
    static class Stack {
        Queue <Integer> q1 = new LinkedList<>();
        Queue <Integer> q2 = new LinkedList<>();
        public void push(int data){
            while (!q1.isEmpty()) {
                q2.add(q1.peek());
                q1.remove();
            }
            q1.add(data);
            while (!q2.isEmpty()) {
                q1.add(q2.peek());
                q2.remove();
            }
        }
        public int pop(){
            if(q1.isEmpty()){
                return -1;
            }
            return q1.remove();
        }
        public int peek(){
            if(q1.isEmpty()){
                return -1;
            }
            return q1.peek();
        }
    }
    public static void main(String[] args) {
        Stack sc = new Stack();
        sc.push(45);
        sc.push(55);
        sc.push(65);
        sc.push(75);
        while (!sc.q1.isEmpty()) {
            System.out.println(sc.peek());
            System.out.println("Removing:"+sc.pop());
        }
    }
}
