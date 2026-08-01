import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ConnectedComponent {
    
    // Corrected BFS: Traverses all components
    public static void bfs(List<List<Integer>> adjList){
        boolean visited[] = new boolean[adjList.size()];
        System.out.print("BFS Traversal: ");
        for (int i = 0; i < adjList.size(); i++) {
            if(!visited[i]){
                bfsUtil(adjList, i, visited); 
            }
        }
        System.out.println();
    }
    
    // Corrected BFS Utility
    public static void bfsUtil(List<List<Integer>> adjList, int startVertex, boolean visited[] ) {
        if (adjList.isEmpty()) return;
        Queue<Integer> q = new LinkedList<>();
        
        q.offer(startVertex); 
        visited[startVertex] = true;
        
        while (!q.isEmpty()) {
            int vertex = q.poll();
            System.out.print(vertex + " ");
            
            for (int neighbor : adjList.get(vertex)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.offer(neighbor);
                }
            }
        }
    }
    
    // Corrected DFS: Traverses all components
    public static void dfs(List<List<Integer>> adjList) {
        boolean[] visited = new boolean[adjList.size()];
        System.out.print("DFS Traversal: ");
        for(int i = 0; i < adjList.size(); i++){
            if (!visited[i]) {
                dfsUtil(adjList, i, visited); 
            }
        }
        System.out.println();
    }
    
    // Corrected DFS Utility
    public static void dfsUtil(List<List<Integer>> adjList, int vertex, boolean[] visited) {
        System.out.print(vertex + " ");
        visited[vertex] = true;
        
        for (int neighbor : adjList.get(vertex)) {
            if (!visited[neighbor]) {
                dfsUtil(adjList, neighbor, visited);
            }
        }
    }
    
    public static void main(String[] args) {
        int V = 7;
        int edges[][] = { 
            { 0, 1 }, { 0, 2 }, { 1, 3 }, { 2, 4 }, 
            { 4, 5 }, { 3, 4 }, { 3, 5 }, { 5, 6 } 
        };
        
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
        
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        
        // Print Adjacency List
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> " + adjList.get(i));
            if (i < V - 1) System.out.print(", ");
        }
        System.out.println("\n");
        
        bfs(adjList);
        dfs(adjList);
    }
}
