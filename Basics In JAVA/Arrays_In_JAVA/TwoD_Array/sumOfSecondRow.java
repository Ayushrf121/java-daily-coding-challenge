public class sumOfSecondRow {
    public static int SecondRow(int [][]arr)
    {
        int i=1,j=0,s=0;
        while (j<arr[0].length) {
            s+=arr[i][j];
            j++;
        }
        return s;
    }
    public static void main(String[] args) {
         int arr[][] =  {{1,4,9},{11,4,3},{2,2,3}};
        int sum = SecondRow(arr);
        System.out.println(sum);
    }
}
