import java.util.PriorityQueue;

public class NearestCar {
    static class Points implements Comparable<Points>{
        int x;
        int y;
        int dist;
        Points(int x,int y,int dist){
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
        public int compareTo(Points p2){
            return this.dist - p2.dist;
        }
    }
    public static void main(String[] args) {
        int pts[][] = {{3, 3}, {5, -1}, {-2, 4}};
        int k=2;
        PriorityQueue<Points> pt = new PriorityQueue<>();
        for (int i = 0; i < pts.length; i++) {
            int dist = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1] ;
            pt.offer(new Points(pts[i][0], pts[i][1],dist ));
        }
        for (int i = 0; i < k; i++) {
            System.out.println("Car:-"+pt.poll().dist);   
        }
    }
}
