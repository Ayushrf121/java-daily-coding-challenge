import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Iteration {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ayush", 10);
        map.put("Mahesh", 20);
        map.put("Ravi", 30);
        map.put("mahesh", 2);
        System.out.println(map); // {mahesh=2, Ravi=30, Mahesh=20, Ayush=10}

        // A collection that contains no duplicate elements. More formally, sets contain
        // no pair of elements e1 and e2 such that e1.equals(e2), and at most one null
        // element. As implied by its name, this interface models the mathematical set
        // abstraction.

        // .keySet() Returns a Set view of the keys contained in this map.

        Set<String> keys = map.keySet();
        System.out.println(keys);// [mahesh, Ravi, Mahesh, Ayush]
        for(String key: keys){
        System.out.println("Key: "+key+", Value: "+map.get(key));
        }

        Set<Map.Entry<String, Integer>> keys2 = map.entrySet();
        System.out.println(keys2); // [mahesh=2, Ravi=30, Mahesh=20, Ayush=10]

        // Iteartion : So we need to store the key of hashmap.
        for (Map.Entry<String, Integer> key : keys2) {
            System.out.println("Key: " + key.getKey() + ", Value: " + key.getValue());
        }
    }
}
