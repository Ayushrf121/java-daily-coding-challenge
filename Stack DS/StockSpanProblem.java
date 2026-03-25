import java.util.Stack;

public class StockSpanProblem {
    
    public static void solveStackSpan(int []span,int []stock){
        // stack of index of prev highest stock.
        Stack <Integer> s = new Stack<>();
        s.push(0);
        span[0]=1;
        for (int i = 1; i < stock.length; i++) {
            int currPrice = stock[i];
            while (!s.isEmpty() && currPrice>=stock[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }else{
                int prevHighIdx = s.peek();
                // stores the no. of the consecutive days....
                span[i] = i-prevHighIdx;
            }
            s.push(i);
        }
        return;
    }
    public static void main(String[] args) {
        int []stock = {100,80,60,70,60,85,100};
        int []span = new int[stock.length];
        solveStackSpan(span,stock);
        System.out.println("Sapn of the consecutive days :-");
        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i]+" ");
        }    
    }
}