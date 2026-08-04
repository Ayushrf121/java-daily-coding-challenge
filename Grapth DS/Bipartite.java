import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bipartite {
    public static boolean isBipartite(List<List<Integer>> adjList){
        int color[] = new int[adjList.size()];
        for (int i = 0; i < color.length; i++) {
            color[i] = -1;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<adjList.size();i++){
            if(color[i]==-1){
                color[i] = 0;
                q.offer(i);
                while(!q.isEmpty()){
                    int val = q.poll();
                    for(int neighbor : adjList.get(val)){
                        if(color[neighbor]==-1){
                            color[neighbor] = color[val]==0 ? 1 : 0;
                            q.add(neighbor); 
                        }else if(color[val] == color[neighbor]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int V = 5;
        int edges [][] = {
            {0,1},{0,2},{1,3},{3,4},{4,2}
        };
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
        for(int edge[] : edges){
            int u = edge[0];
            int v = edge[1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        System.out.println(isBipartite(adjList));
    }
}
