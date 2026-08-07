import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KahnsAlgoTopological {
    public static void calcInDegree(List<List<Integer>> adList, int[] ind) {
        for (int i = 0; i < adList.size(); i++) {
            for (int neighbor : adList.get(i)) {
                ind[neighbor]++;
            }
        }
    }

    public static List<Integer> bfsTopoSort(List<List<Integer>> adList) {
        List<Integer> li = new ArrayList<>();
        int[] ind = new int[adList.size()];
        // 1. To calc in-degree
        calcInDegree(adList, ind);
        Queue<Integer> q = new LinkedList<>();
        // 2. Adding the node that has 0 in-degree.
        for (int i = 0; i < ind.length; i++) {
            if (ind[i] == 0) {
                q.offer(i);
            }
        }
        // bfs
        while (!q.isEmpty()) {
            int curr = q.poll();
            li.add(curr);
            for (int neighbor : adList.get(curr)) {
                // decrement the in degree (as only in-degree with 0 can be added in queue) so
                // that it can also be added in a queue.
                ind[neighbor]--;
                if (ind[neighbor] == 0) {
                    q.offer(neighbor);
                }
            }
        }
        return li;
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
        System.out.println(bfsTopoSort(adjList));
    }
}
