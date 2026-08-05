import java.util.ArrayList;
import java.util.List;

public class CycleGraphDirected {
    public static boolean hasCycle(List<List<Integer>> aL,int st){
        boolean []visited = new boolean[aL.size()];
        boolean res= false;
        boolean []stack = new boolean[aL.size()];
        for (int i = 0; i < aL.size(); i++) {
            if(!visited[i]){
                res = getCycle(aL,visited,stack,i);
                if(res){
                    return res;
                }
            }
        }
        return res;
    }
    public static boolean getCycle(List<List<Integer>> aL,boolean []visited,boolean []stack,int curr){
        visited[curr]= true;
        stack[curr]= true;
        for(int neighbor : aL.get(curr)){
            if(stack[neighbor]){
                return true;
            }
            else if(!visited[neighbor] && getCycle(aL, visited, stack, neighbor)){
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }
    public static void main(String[] args) {
        List<List<Integer>> aL = new ArrayList<>();
        int V =4;
        for (int i = 0; i <V; i++) {
            aL.add(new ArrayList<>());
        }        
        int edges[][] = {{0,1},{3,0},{1,3}};
        for(int edge[] : edges){
            int u = edge[0];
            int v = edge[1];
            aL.get(u).add(v);
        }
        System.out.println(hasCycle(aL,0));
    }
}
