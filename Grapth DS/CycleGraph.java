import java.util.ArrayList;
import java.util.List;

public class CycleGraph {
    public static boolean checkCycle(List<List<Integer>> aL,int src,boolean []visited,int parent){
        if(aL.size()==0){
            return false;
        }
        visited[src] = true;
        for(int neighbor : aL.get(src)){
            if(!visited[neighbor]){
                checkCycle(aL, neighbor, visited,src);
            }else if(parent !=neighbor){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        List<List<Integer>> aL = new ArrayList<>();
        int V =6;
        for (int i = 0; i <V; i++) {
            aL.add(new ArrayList<>());
        }        
        int edges[][] = {{0,1},{0,2},{1,3},{2,4},{3,4},{4,5},{3,5}};
        for(int edge[] : edges){
            int u = edge[0];
            int v = edge[1];
            aL.get(u).add(v);
            aL.get(v).add(u);
        }
        System.out.println(checkCycle(aL,0,new boolean[V],-1));
    }
}
