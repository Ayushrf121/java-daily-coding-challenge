// Question 4: Isolated Nodes (The LeetCode Trap)

import java.util.ArrayList;
import java.util.List;

public class Q4 {
    public static void main(String[] args) {
        int V =4;
        int edges [][] = {{0,1},{2,3}};
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int [] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjList.get(u).add(v);
        }
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> " + adjList.get(i));
            if (i < V - 1) {
                System.out.print(", ");
            }
        }
    }
}
