public class HWques2 {
    public static void convertString(int n,String arr[])
    {
        if(n==0)
        {
            return;
        }
        int ld = n%10;
        convertString(n/10, arr);
        System.out.print(arr[ld]+" ");
    }
    public static void main(String[] args) {
        int n = 2019;
        String arr[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        StringBuilder str = new StringBuilder("");
        // Two Zero One Nine
        convertString(n,arr);
    }
}
