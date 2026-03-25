import java.util.Stack;

public class Q3 {
    public static void pushAtBottom(Stack <Integer> s,int t){
        if (s.isEmpty()) {
            s.push(t);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, t);
        s.push(top);
    }
    public static void reverseStack(Stack <Integer> s){
        if(s.isEmpty()){
            return;
        }
        int t = s.pop();
        reverseStack(s);
        pushAtBottom(s,t);
    }
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3); //top
        reverseStack(s);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
