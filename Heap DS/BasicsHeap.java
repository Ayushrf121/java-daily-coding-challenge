import java.util.ArrayList;

public class BasicsHeap {
    static class Heap {
    ArrayList<Integer> arr = new ArrayList<>();
    public void put(int data){
        // Step 1. add the data in array.
        arr.add(data);
        // Step 2. fix the heap.
        // 2.1 finding the parent and child index.
        int childIdx = arr.size()-1;
        int parentIdx = (childIdx-1)/2;
        // 2.2 fix the array by making the heap as minHeap.
        while (childIdx > 0 && arr.get(childIdx) < arr.get(parentIdx)) {
            // swap the parent with child.
            int temp = arr.get(childIdx);
            arr.set(childIdx, arr.get(parentIdx));
            arr.set(parentIdx,temp);
            childIdx = parentIdx;
            parentIdx = (childIdx-1)/2;
        }
    }
    public int peek(){
        return arr.get(0);
    }   
    }
    public static void main(String[] args) {
        
    }
}