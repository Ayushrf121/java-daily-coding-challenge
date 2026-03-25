import java.util.Scanner;

public class BinarySearch {
    public static int find(int arr[], int k) {
        int l,h,m,n=arr.length,ans=-1;
        l=0;
        h=n-1;
        while(l<=h)
        {
            // imp logic
            m=l+(h-l)/2;
            if(arr[m]==k)
            {
                
                ans = m;
                // imp logic
                h = m-1;
            }
            else if(arr[m]<k)
            {
                l = m+1;
            }
            else
            {
                h = m-1;
            }
        }
        return ans;
    }
    public static void insert(int arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values:-");
        for (int i = 0; i < 17; i++) {
            arr[i] = sc.nextInt();
        }
    }
    public static void main(String[] args) {
     int arr[] = new int[50];
        insert(arr);
        for (int i = 0; i < 17; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int val = sc.nextInt();
        int index = find(arr, val);
        if (index != -1) {
            System.out.println("Found at index : " + index);
        }
        else
        {
            System.out.println("Not found");
        }
        sc.close();   
    }
}
