
// TC can be vary based on the no. of rows and col. 
// like if n>>>>m then O(n) or n<<<<<m O(m);
// here it is O(n+m).

public class Searching_Sorted_2DArray {
    public static boolean Search_Sorted(int [][]arr,int k)
    {
        int row=0,col=arr[0].length-1;
        while (row<arr.length && col>=0) {
            if(k == arr[row][col])
            {
                System.err.println("Found at" +"(" + row +"," + col + ")");
                return true;
            }
            else if(k<arr[row][col])
            {
                col--;
            }
            else
            {
                row++;
            }
        }
        System.out.println("Not found!");
        return false;
    }
    public static void main(String[] args) {
        int arr[][] =  { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9} };
        boolean x=Search_Sorted(arr, 35);
    }
}
