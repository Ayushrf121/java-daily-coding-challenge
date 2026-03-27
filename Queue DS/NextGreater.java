import java.util.Stack;
public class NextGreater {
    public static void nxtGreater(int []arr){
        int res[]= new int[arr.length];
        if(arr.length==0){
            return ;
        }
        Stack<Integer> stk = new Stack<>();
        for (int i = (arr.length)-1; i >= 0; i--) {
            while (!stk.isEmpty()&&arr[i]>=arr[stk.peek()]) {
                stk.pop();
            }
            if(stk.isEmpty()){
                res[i]=-1;
            }else{
                res[i]=arr[stk.peek()];
            }
            stk.push(i);
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
        return ;
    }
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        nxtGreater(arr);
    }
}
