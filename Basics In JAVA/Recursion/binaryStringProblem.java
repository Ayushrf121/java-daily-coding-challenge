// print the binary strings of size n without consecutive ones..
import java.util.Scanner;
public class binaryStringProblem {
    public static void binaryString(int n,int lp,String str)
    {
        if(n==0)
        {
            System.out.println(str);
            return;
        }
        binaryString(n-1, 0, str+"0");
        if(lp==0)
        {
            binaryString(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        int n = sc.nextInt();
        binaryString(n, 0, str);
        // if((n&1) == 1)
        // {
        //     System.out.println("Its an odd "+n);
        // }
        // else{
        //     System.out.println("Its an even "+n);
        // }
    }
}
