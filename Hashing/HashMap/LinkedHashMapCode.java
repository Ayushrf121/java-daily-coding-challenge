import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapCode {
    public static void main(String[] args) {
        // Implements based on the order they added in it.
        LinkedHashMap<String,Integer> lmap = new LinkedHashMap<>();
        lmap.put("Ayush", 20);
        lmap.put("Kush", 30);
        lmap.put("Piyush", 40); 
        // Ayush kush and Piyush always.
        System.out.println(lmap);
        
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Ayush", 20);
        map.put("Kush", 30);
        map.put("Piyush", 40);
        System.out.println(map);
    }
}
