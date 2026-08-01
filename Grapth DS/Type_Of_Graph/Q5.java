import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q5 {
    public static void bfs(List<List<Integer>> adjList) {
    if (adjList.isEmpty()) return;

    Queue<Integer> q = new LinkedList<>();
    boolean visited[] = new boolean[adjList.size()];
    
    q.offer(0);
    visited[0] = true; 

    while (!q.isEmpty()) {
        int vertex = q.poll();
        System.out.print(vertex + " ");

        // Process neighbors
        for (int neighbor : adjList.get(vertex)) {
            if (!visited[neighbor]) {
                visited[neighbor] = true;
                q.offer(neighbor);
            }
        }
    }
}


    public static void dfs(List<List<Integer>> adjList,int vertix,boolean []visited){
        System.out.print(vertix + " ");
        visited[vertix] = true;
        for (int i = 0; i <adjList.get(vertix).size() ; i++) {
            List<Integer> li = adjList.get(vertix);
            if(!visited[li.get(i)]){
                dfs(adjList, li.get(i), visited);
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;
        int edges[][] = { { 0, 1 }, { 0, 2 }, { 1, 3 }, { 2, 4 }, { 4, 5 }, { 3, 4 }, { 3, 5 }, { 5, 6 } };
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int v = edge[1];
            int u = edge[0];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> " + adjList.get(i));
            if (i < V - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        bfs(adjList);
        System.out.println();
        dfs(adjList, 0, new boolean[V]);
    }
}
