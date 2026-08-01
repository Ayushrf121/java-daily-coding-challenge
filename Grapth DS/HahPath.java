import java.util.ArrayList;
import java.util.List;

public class HahPath {
    public static boolean checkPath(List<List<Integer>> adjList,boolean []visited,int src,int dest){
        if(src == dest){
            return true;
        }
        visited[src] = true;
        for (int i = 0; i < adjList.get(src).size(); i++) {
            int curr = adjList.get(src).get(i);
            if(!visited[curr] && checkPath(adjList, visited, curr, dest)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int V = 4;
        int edges[][] = { { 0, 1 }, { 1, 2 }, { 2, 3 }, { 3, 0 } };
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
       System.out.println(checkPath(adjList,new boolean[V],0,2));
    }
}
