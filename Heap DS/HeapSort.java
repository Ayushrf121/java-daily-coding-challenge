import java.util.ArrayList;
import java.util.List;

public class HeapSort {

    public static void heapify(List<Integer>arr,int n,int i){
        int max= i;
        int left= 2*i+1;
        int right= 2*i+2;
        if(left<n && arr.get(max)<arr.get(left)){
            max = left;
        }
        if(right<n && arr.get(max)<arr.get(right)){
            max = right;
        }
        if(max!=i){
            int t = arr.get(i);
            arr.set(i, arr.get(max));
            arr.set(max, temp);
            heapify(arr, n, max);
        }
        return;
    }

    public static void heapSort(List<Integer>arr){
        if(arr.isEmpty() || arr.size()==1){
            return;
        }
        // finding non leaf node and then getting the MaxHeap.
        for (int i =  arr.size()/2; i>=0; i--) {
            heapify(arr,arr.size(),i);
        }
        // now to get the sorted heap.
        for (int i = arr.size()-1; i>0 ; i--) {
            // to get large value at the end sot swap first and last idx.
            int temp = arr.get(i);
            arr.set(i, arr.get(0));
            arr.set(0, temp);
            // call heapify till the heap size which is decreasing by one so ultimately we get sorted heap
            heapify(arr, i, 0);
        }
        return;
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(4);
        arr.add(5);
        arr.add(3);
        heapSort(arr);
        for (int j = 0; j < arr.size(); j++) {
            System.out.print(arr.get(j)+" ");
        }
    }
}
