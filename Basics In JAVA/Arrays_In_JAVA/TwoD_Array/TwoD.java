import java.util.Scanner;

public class TwoD
{
    public static boolean search(int arr[][],int val)
    {
         for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
               if(arr[i][j]==val)
               {
                System.out.println("("+i+","+j+")");
                return true;
               }
            }
        }
        return false;
        
    }
    public static void main(String[] args) {
        int [][]arr = new int [3][3];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
         for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        if(!search(arr, 5))
        {
            System.out.println("No value is exist");
        }
        sc.close();
    }
}