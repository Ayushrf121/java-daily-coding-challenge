// Implementation of HashMap.
import java.util.HashMap;
public class Basics{
    public static void main(String[] args){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Ayush",10);
        map.put("Mahesh",20);
        map.put("Ravi",30);
        map.put("mahesh",2);
        System.out.println(map); // {mahesh=2, Ravi=30, Mahesh=20, Ayush=10}

        System.out.println(map.get("Mahesh"));
        map.remove("Mahesh");
        System.out.println(map.get("Mahesh"));
        System.out.println(map.containsKey("Mahesh"));
        System.out.println(map.getOrDefault("Ayush", 45));
        System.out.println(map.getOrDefault("piyush", 45));
        // map.clear();
        System.out.println(map.isEmpty());
        System.out.println(map.size());

    }
}