import java.util.ArrayList;

public class BasicsHeap {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        // insert
        public void put(int data) {
            // Step 1. add the data in array.
            arr.add(data);
            // Step 2. fix the heap.
            // 2.1 finding the parent and child index.
            int childIdx = arr.size() - 1;
            int parentIdx = (childIdx - 1) / 2;
            // 2.2 fix the array by making the heap as minHeap.
            while (childIdx > 0 && arr.get(childIdx) < arr.get(parentIdx)) {
                // swap the parent with child.
                int temp = arr.get(childIdx);
                arr.set(childIdx, arr.get(parentIdx));
                arr.set(parentIdx, temp);
                childIdx = parentIdx;
                parentIdx = (childIdx - 1) / 2;
            }
        }

        // Top of Heap
        public int peek() {
            return arr.get(0);
        }

        private void heapify(int i) {
            // Suppose root element's index is minimum
            int minVal = i;
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            // maybe the node is leaf node and there's no left and right node at that case
            // its idex will be > arr.size();
            if (left < arr.size() && arr.get(minVal) > arr.get(left)) {
                minVal = left;
            }
            if (right < arr.size() && arr.get(minVal) > arr.get(right)) {
                minVal = right;
            }
            // so we got the minIndex finally now do the swapping b/w parent and minIndex
            // value.
            // this minVal != i means heap is not correct need to fix.
            if (minVal != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(minVal));
                arr.set(minVal, temp);
                // Recursively heapify the affected subtree
                heapify(minVal);
            }
        }

        // Remove from heap;
        public void remove() {
            // Swap first and Last index value:-
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);
            // Remove the last number
            arr.remove(arr.size() - 1);
            // Fix using heapify
            heapify(0);
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap hp = new Heap();
        hp.put(3);
        hp.put(4);
        hp.put(10);
        hp.put(5);
        hp.put(1);
        hp.put(2);
        // hp.put(1);
        // hp.put(2);
        // hp.put(4);
        // hp.put(3);
        // hp.put(5);
        // hp.put(6);
        while (!hp.isEmpty()) {
            System.out.println(hp.peek());
            hp.remove();
        }
    }
}