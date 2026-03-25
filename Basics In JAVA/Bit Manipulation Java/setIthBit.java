import java.util.Scanner;

public class setIthBit {
    public static int SetIthBit(int n,int i)
    {
        return n | (1<<i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(SetIthBit(n, 2));
        sc.close();
    }
}
