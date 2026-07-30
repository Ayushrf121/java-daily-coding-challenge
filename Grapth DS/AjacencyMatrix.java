public class AjacencyMatrix {


    int ajacencyMatrix[][];
    AjacencyMatrix(int nodes){
        ajacencyMatrix = new int [nodes][nodes];
    }
    // undirected graph.
    public void addinMatrixUndirected(int [][]edges){
        for (int []edge : edges) {
            int r = edge[0];
            int c = edge[1];
            ajacencyMatrix[r][c] = 1;
            ajacencyMatrix[c][r] = 1;
        }
    }
    // directed graph.
    public void addinMatrixDirected(int [][]edges){
        for (int []edge : edges) {
            int r = edge[0];
            int c = edge[1];
            ajacencyMatrix[r][c] = 1;
        }
    }
    public void printGraph(){
        for(int i=0;i<ajacencyMatrix.length;i++){
            for(int j=0;j<ajacencyMatrix[0].length;j++){
                System.out.print(ajacencyMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int nodes=4;
        AjacencyMatrix graph = new AjacencyMatrix(nodes);
        AjacencyMatrix graph2 = new AjacencyMatrix(nodes);
        int edges[][] = {{0,2},{0,1},{1,3}};
        graph.addinMatrixUndirected(edges);
        graph.printGraph();
        System.out.println();
        graph2.addinMatrixDirected(edges);
        graph2.printGraph();
    }
}
