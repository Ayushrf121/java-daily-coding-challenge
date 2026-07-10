import java.util.TreeMap;

public class TreeMapCode {
    public static void main(String[] args) {
        // Sorted Order Always with TC of O(log n);        
        TreeMap<String, Integer> tmap = new TreeMap<>();
        tmap.put("Piyush", 40);
        tmap.put("Kush", 30);
        tmap.put("Ayush", 20);
        System.out.println(tmap);
    }
}
