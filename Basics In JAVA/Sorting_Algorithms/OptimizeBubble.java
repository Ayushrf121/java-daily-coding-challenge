// TC: O(n) for sorted array.
public class OptimizeBubble {
    public static void Sort(int[] arr) {
        boolean s;
        for (int i = 0; i < arr.length - 1; i++) {
            s=false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                    s=true;
                }
            }
            if(!s)
            {
                System.out.println("Bubble is sorted already!");
                return;
            }
        }
    }

    public static void main(String[] args) {
        // int arr[] = { 5, 4, 1, 3, 2 };
        int arr[] = { 1, 2, 3, 4, 5 };
        Sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}