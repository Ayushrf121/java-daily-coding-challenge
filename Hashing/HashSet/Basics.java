import java.util.HashMap;
import java.util.HashSet;

public class Basics {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        // add return true if it add the value and return false it it encounter same value 'cause it followed the uniqueness in the set.
        boolean a = hs.add(45);
        boolean b = hs.add(45);
        System.out.println(a+","+b);
        hs.add(45);
        hs.add(55);
        hs.add(65);
        hs.add(75);
        System.out.println(hs);
        hs.remove(55);
        System.out.println(hs);
        String ans = hs.contains(75) ? "Yes" : "No";
        System.out.println(ans);
        System.out.println(hs.isEmpty());
        hs.clear();
        System.out.println(hs.isEmpty());
    }
}
