// Push at the bottom.
import java.util.Stack;
public class Q1 {
    public static void pushAtBottom(Stack<Integer>sc,int data){
        if (sc.isEmpty()) {
            sc.push(data);
            return;
        }
        int t = sc.pop();
        pushAtBottom(sc, data);
        sc.push(t);
    }
    public static void main(String[] args) {
        Stack <Integer> sc = new Stack<>();
        sc.push(1);
        sc.push(2);
        sc.push(3);
        pushAtBottom(sc,4);
        while (!sc.isEmpty()) {
            System.out.println(sc.peek());
            sc.pop();
        }
    }
}
