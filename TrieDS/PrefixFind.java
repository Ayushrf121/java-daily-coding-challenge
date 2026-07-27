import java.util.ArrayList;
import java.util.List;

public class PrefixFind {
    public static void main(String[] args) {
        String word = "ababa";
        List<String> li = new ArrayList<>();
        int n = word.length();
        for (int i = n; i>0; i--) {
            li.add(word.substring(0, i));
        }
        System.out.println(li);
    }
}
