/*

Given are N ropes of different lengths, the task is to connect these ropes into one rope with
minimum cost, such that the cost to connect two ropes is equal to the sum of their lengths.
Sample Input 1 : N = 4, arr = [4 3 2 6]
Sample Output 1 : 29
Sample Input 2 : N = 2, arr = [1 2 3]
Sample Output 2 : 9

in the priority queue over here 
this implementation provides O(log(n)) time for the enqueuing and dequeuing methods (offer, poll, remove() and add); linear time for the remove(Object) and contains(Object) methods; and constant time for the retrieval methods (peek, element, and size).

*/

import java.util.PriorityQueue;

public class Ques6 {
    public static int minimumCost(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        int res = 0;
        while (pq.size() > 1) {
            int f = pq.poll();
            int s = pq.poll();
            res += f + s;
            pq.add(f + s);
        }
        return res;
    }

    public static void main(String[] args) {
        int len[] = { 4, 3, 2, 6 };
        int size = len.length;
        System.out.println("Total cost for connecting"+ " ropes is "+ minimumCost(len, size));
    }
}
