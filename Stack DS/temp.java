import java.util.Stack;

public class temp{
    public static void pushAtBottom(Stack<Integer>sc,int data){
        if (sc.isEmpty()) {
            sc.push(data);
            return;
        }
        int t = sc.pop();
        pushAtBottom(sc, data);
        sc.push(t);
    }
    public static void printStack(Stack<Integer>sc){
        while (!sc.isEmpty()) {
            System.out.println(sc.peek());
            sc.pop(); 
        }
    }
    public static void reverseStack(Stack<Integer>sc){
        if(sc.isEmpty()){
            return;
        }
        int top = sc.pop();
        reverseStack(sc);
        pushAtBottom(sc, top);
    }
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverseStack(s);
        printStack(s);

    }
}