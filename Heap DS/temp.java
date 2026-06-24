import java.util.ArrayList;

public class temp {

    public static class Heap {
        ArrayList<Integer> li = new ArrayList<>();

        public void put(int data) {
            li.add(data);
            int childIdx = li.size() - 1;
            int parentIdx = (childIdx - 1) / 2;
            while (childIdx > 0 && li.get(childIdx) < li.get(parentIdx)) {
                int temp = li.get(parentIdx);
                li.set(parentIdx, li.get(childIdx));
                li.set(childIdx, temp);
                childIdx = parentIdx;
                parentIdx = (childIdx - 1) / 2;
            }
        }

        public int peek() {
            return li.get(0);
        }

        public void heapify(int idx){
            int min= idx;
            int left = 2*idx+1;
            int right = 2*idx+2;
            if(left<li.size() && li.get(left)<li.get(min)){
                min= left;
            }
            if(right<li.size() && li.get(right)<li.get(min)){
                min= right;
            }
            if(min!=idx){
                int temp = li.get(idx);
                li.set(idx, li.get(min));
                li.set(min, temp);
                heapify(min);
            }
        } 
        public void remove() {
            int temp = li.get(0);
            li.set(0, li.get(li.size() - 1));
            li.set(li.size() - 1, temp);
            li.remove(li.size()-1);
            heapify(0);
        }
        public boolean isEmpty(){
            return li.isEmpty();
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
        while (!hp.isEmpty()) {
            System.out.println(hp.peek());
            hp.remove();
        }
    }
}
