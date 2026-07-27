import java.util.ArrayList;
import java.util.List;

public class Suffix{
    public static List<String> findPrefix(String word,List<String> temp){
        for (int i = word.length(); i > 0; i--) {
            temp.add(word.substring(0, i));
        }
        return temp;
    }
    public static void main(String [] args){
        String word = "ababa";
        List<String> li = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
         li.add(word.substring(i));   
        }
        // System.out.println(li);
        List<List<String>> ans = new ArrayList<>();
        for (int i = 0; i < li.size(); i++) {
            List<String> temp = new ArrayList<>();
            findPrefix(li.get(i),temp);
            ans.add(temp);
        }
        System.out.println(ans);
    }
}