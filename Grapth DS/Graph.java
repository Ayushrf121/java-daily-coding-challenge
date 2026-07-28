import java.util.ArrayList;

public class Graph {
    static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int s,int d,int w){
            this.dest = d;
            this.src = s;
            this.wt = w;
        }
    }
    public static void main(String[] args) {
        // So the size of the graph we had discussed was the total number of the vertices.
        int v= 5;
        ArrayList<Edge>[] graph = new ArrayList[v];// currently all the list is null cuz we had not declared anything in it.
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }
        // 0th vertix.
        graph[0].add(new Edge(0,1,5));
        // 1th vertix
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));
        // 2th vertix
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,4,2));
        graph[2].add(new Edge(2,3,1));
        // 3rd vertix
        graph[3].add(new Edge(3,2,1));
        graph[3].add(new Edge(3,1,3));
        // 4th vertix
        graph[4].add(new Edge(4,2,2));

        //  to access the destinations of the graph2.
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.println("Graph 2 destinations : "+e.dest);
        }
    }
}
