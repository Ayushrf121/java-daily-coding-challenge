// Ques1.
public class HWques1 {
    public static void checkOccurence(int arr[],int key,int i)
    {
        if(i==arr.length)
        {return;}
        if(arr[i] == key)
        {
            System.out.println(i);
        }
        checkOccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int key=2,arr[] = {3,2,4,5,6,2,7,2,2};
        checkOccurence(arr, key, 0);
    }
}
