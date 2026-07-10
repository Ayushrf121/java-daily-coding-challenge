import java.util.LinkedList;

public class HashMapCode {
    // K and V are the generics i.e they doesn't have any specific type eg. int
    // float etc.
    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;
            Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        private int N;
        private int n;
        private LinkedList<Node> buckets[];
        @SuppressWarnings("Unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }
        public int hashFunction(K key){
            return Math.abs(key.hashCode()) % N;
        }
        public int searchFunction(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            int si = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if(key == node.key){
                    return si;
                }
                si++;
            }
            return -1;
        }
        public void put(K key, V value){
            int bi = hashFunction(key);
            int si = searchFunction(key,bi);
            if(si==-1){
                buckets[bi].add(new Node(key, value));
                n++;
            }else{
                Node node = buckets[bi].get(si);
                node.value = value;
            }
        }

    }

    public static void main(String[] args) {

    }
}
