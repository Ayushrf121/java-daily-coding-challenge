import java.util.LinkedList;
import java.util.Queue;

public class Ques5 {
    
    public static String binaryNum(int n){
        if(n==1){
            return "1";
        }
        StringBuilder sb = new StringBuilder("");
        while (n>0) {
            sb.append(n%2);
            n=n/2;
        }
        sb.reverse();

        return sb.toString();
    }
    public static void numToBinary(Queue<String>q,int n){
        if(n<=0){
            return;
        }
        for(int i=1;i<=n;i++){
            q.add(binaryNum(i));
        }
        return;
    }
    public static void main(String[] args) {
        Queue<String>q = new LinkedList<>();
        numToBinary(q, 20);
        while (!q.isEmpty()) {
            System.out.print(q.remove()+" ");
        }
    }
}
