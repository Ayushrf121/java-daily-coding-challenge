// Question 3: The Directed, Weighted Graph. Build a graph where edges have a one-way direction and a numerical cost/distance value attached to them.Total Vertices (N): 3 (Nodes are 1, 2, 3)Input Edges: [[1, 2, 5], [2, 3, 10], [1, 3, 15]]  Format: [source, destination, weight]Expected Output structure if you print your graph:1 -> [(2, 5), (3, 15)], 2 -> [(3, 10)]

import java.util.ArrayList;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        int V =3;
        int edges [][] = {{1,2,5},{2,3,10},{1,3,15}};
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int [] edge : edges){
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];
            adjList.get(u).add(v);
            adjList.get(u).add(wt);
        }
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> " + adjList.get(i));
            if (i < V - 1) {
                System.out.print(", ");
            }
        }
    }
}
