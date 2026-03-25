// implement these stack and queue using Deque.
import java.util.Deque;
import java.util.LinkedList;

public class Ques4 {
    static class Stack {
    
        Deque<Integer>dq = new LinkedList<>();
        public void push(int data){
            dq.addLast(data);
        }
        public int pop(){
            if(dq.isEmpty()){
                return -1;
            }
            return dq.removeLast();
        }
        public int peek(){
            if(dq.isEmpty()){
                return -1;
            }
            return dq.getLast();
        }
    }
    static class Queue {
        Deque<Integer>dq = new LinkedList<>();
        public void add(int data){
            dq.addFirst(data);
        }
        public int remove(){
            if(dq.isEmpty()){
                return -1;
            }
            return dq.removeFirst();
        }
        public int peek(){
            if(dq.isEmpty()){
                return -1;
            }
            return dq.getFirst();
        }
    }
    public static void main(String[] args) {
        Stack sc = new Stack();
        sc.dq.push(45);
        sc.dq.push(55);
        sc.dq.push(65);
        sc.dq.push(75);
        while (!sc.dq.isEmpty()) {
            System.out.print(sc.dq.peek()+" ");
            sc.dq.pop();
        }
        System.out.println();
        Queue q = new Queue();
        q.dq.add(45);
        q.dq.add(55);
        q.dq.add(65);
        q.dq.add(75);
        while (!q.dq.isEmpty()) {
            System.out.print(q.dq.peek()+" ");
            q.dq.remove();
        }
    }
}
