import java.util.Stack;

public class QUsing2Stack {
    static class Queue {
        Stack <Integer> s1 = new Stack<>();
        Stack <Integer> s2 = new Stack<>();
        public void add(int data){
            while (!s1.isEmpty()) {
                s2.push(s1.peek());
                s1.pop();
            }
            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.peek());
                s2.pop();
            }
            return;
        }
        public int remove(){
            if(s1.isEmpty()){
                return -1;
            }
            return s1.pop();
        }
        public int peek(){
            if(s1.isEmpty()){
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(45);
        q.add(55);
        q.add(65);
        q.add(75);
        q.add(85);
        while (!q.s1.isEmpty()) {
            System.out.println(q.peek());
            System.out.println("Removing:"+q.remove());
        }
    }
}
