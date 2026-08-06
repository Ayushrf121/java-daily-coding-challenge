import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TopologicalSort {
    public static List<Integer> getSortedGraph(List<List<Integer>> adjList) {
        boolean[] visited = new boolean[adjList.size()];
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < adjList.size(); i++) {
            if (!visited[i]) {
                modifiedDfs(adjList, visited, stk, i);
            }
        }
        List<Integer> li = new ArrayList<>();
        while (!stk.isEmpty()) {
            li.add(stk.pop());
        }
        return li;
    }

    public static void modifiedDfs(List<List<Integer>> adjList, boolean[] visited, Stack<Integer> stk, int curr) {
        visited[curr] = true;
        for (int neighbor : adjList.get(curr)) {
            if (!visited[neighbor]) {
                modifiedDfs(adjList, visited, stk, neighbor);
            }
        }
        stk.push(curr);
    }

    public static void main(String[] args) {
        int V = 6;
        int[][] edges = {
                { 5, 0 },
                { 5, 2 },
                { 4, 0 },
                { 4, 1 },
                { 2, 3 },
                { 3, 1 }
        };
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjList.get(u).add(v);
        }
        // System.out.println(adjList);
        System.out.println(getSortedGraph(adjList));
    }
}
