import java.util.Scanner;


public class getIthbit {
    public static int GetIthBit(int n,int i)
    {
        int bit = 1<<i;
        int x = n & bit;
        if(x==0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(GetIthBit(n, 3));
    }
}
