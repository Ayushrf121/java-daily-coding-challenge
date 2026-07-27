import java.util.ArrayList;
import java.util.List;

public class Suffix{
    public static void main(String [] args){
        String word = "ababa";
        List<String> li = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
         li.add(word.substring(i));   
        }
        System.out.println(li);
    }
}