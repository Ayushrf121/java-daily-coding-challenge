import java.util.PriorityQueue;

public class PQForObjects {
    // to set the objects as an priority we use to implement a interface. Comparable<ClassName>
    static class Students implements Comparable<Students>{
        String name;
        int rank;
        public Students(String name,int rank){
            this.name = name;
            this.rank = rank;
        }
        // implements abstract methods i.e. Method Overriding.
        @Override
        // public int compareTo(PQForObjects.Students o) {}
        public int compareTo(Students s2){
            return this.rank-s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Students> pq = new PriorityQueue<>();
            pq.add(new Students("Ayush", 4));
            pq.add(new Students("Ravi", 5));
            pq.add(new Students("Mahesh", 2));
            pq.add(new Students("Krishna", 1));
            pq.add(new Students("Gokul", 6));
        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " " + pq.peek().rank);
            pq.remove();
        }
    }
}
