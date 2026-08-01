// Question 2: The Directed, Unweighted Graph.Build a graph where edges only flow from the source to the destination.Total Vertices (N): 4 (Nodes are 0, 1, 2, 3)Input Edges: [[0, 1], [1, 2], [2, 3], [3, 0]]Expected Output structure if you print your graph:0 -> [1], 1 -> [2], 2 -> [3], 3 -> [0] (Notice how each node only points forward!)

import java.util.ArrayList;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        int V =4;
        int edges [][] = {{0,1},{1,2},{2,3},{3,0}};
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
