// find the non repeating letters in a stream of characters
import java.util.LinkedList;
import java.util.Queue;

public class Ques1{

    public static void printFirstNR(String str){
        if(str.length()==0){
            return;
        }
        int freq[]=new int[26];
        Queue <Character> q = new LinkedList<>(); 
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            freq[ch-'a']++;
            q.add(ch);
            while (!q.isEmpty() && freq[q.peek()-'a']>1) {
                q.remove();
            }
            if(q.isEmpty()){
                System.out.println("No character found in a string"+(-1));
            }else{
                System.out.println(q.peek());
            }
        }
        return;
    }
    public static void main(String []args){
        printFirstNR("aabccxb");
    }
}