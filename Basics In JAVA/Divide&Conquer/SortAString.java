public class SortAString {
    public static void sortArray(String arr[] , int i , int j)
    {
        if(i>=j)
        {
            return;
        }
        int mid = i +(j-i)/2;
        sortArray(arr, i, mid);
        sortArray(arr, mid+1, j);
        // merge
        merge(arr,i,j,mid);
    }
    public static void merge(String arr[],int i,int j,int mid)
    {
        int x = i , y = mid+1 , z = 0;
        String temp [] = new String[j-i+1];
        while (x<=mid && y<=j) {
            if(arr[x].compareTo(arr[y])<0)
            {
                temp[z] = arr[x];
                x++;
            }
            else{
                temp[z] = arr[y];
                y++;
            }
            z++;
        }
        while(x<=mid)
        {
            temp[z++] = arr[x++];
        }
        while(y<=j)
        {
            temp[z++] = arr[y++];
        }
        // merge in old array
        for(z = 0 , x=i ; z<temp.length; x++,z++)
        {
            arr[x] = temp[z];
        }
    }
    public static void main(String[] args) {
        String arr [] = {"sun","earth","mars","mercury"};
        
        // merge Sort
        sortArray(arr,0,arr.length-1);
        // Bubble Sort
        // for (int i = 0; i < arr.length-1; i++) {
        //     for(int j=0; j<arr.length-i-1; j++)
        //     {
        //         if(arr[j].compareTo(arr[j+1])>0)
        //         {
        //             String temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        // Selection Sort..
        // for(int i=0;i<arr.length-1;i++)
        // {
            
        //     int x=i;
        //     for(int j=i+1;j<arr.length;j++)
        //     {
        //         if(arr[x].compareTo(arr[j])>0)
        //         {
        //             x = j;
        //         }
                
        //     }
        //     String v = arr[i];
        //     arr[i] = arr[x];
        //     arr[x] = v;
            
        // }
        // insertion sort 
        // for(int i=1;i<arr.length;i++)
        // {
        //     int j = i-1;
        //     String t = arr[i];
        //     while (j>=0 && arr[j].compareTo(t)>0) {
        //         arr[j+1] = arr[j];
        //         j--;
        //     }
        //     arr[j+1] = t;
        // }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
    }
}
