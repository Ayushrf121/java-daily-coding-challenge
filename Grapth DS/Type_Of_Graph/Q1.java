// Question 1: The Undirected, Unweighted GraphBuild a graph where edges go both ways, and there are no weights.Total Vertices (N): 4 (Nodes are 0, 1, 2, 3)Input Edges: [[0, 1], [1, 2], [2, 3], [3, 0]]Expected Output structure if you print your graph:0 -> [1, 3], 1 -> [0, 2], 2 -> [1, 3], 3 -> [2, 0]

import java.util.ArrayList;
import java.util.List;

public class Q1 {
    static class Edges{
        int src;
        int dest;
        Edges(int src,int dest){
            this.dest = dest;
            this.src = src;
        }
    }   
    static int V = 4;
    static int edges [][] = {{0,1},{1,2},{2,3},{3,0}};
    static List<Edges>[] graph = new ArrayList[V]; 
    public static void createList(){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < edges.length; i++) {
                int u = edges[i][0];
                int v = edges[i][1];
                graph[u].add(new Edges(u, v));
                graph[v].add(new Edges(v, u));
        }
    }
    public static void printGraph(){
        for (int i = 0; i < V; i++) {
            List<Edges> li = graph[i];
            System.out.print("[");
            for (int j = 0; j < li.size(); j++) {
                System.out.print(li.get(j).dest+" ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        createList();
        printGraph();
    }
}
