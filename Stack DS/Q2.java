//  Reverse a String... "abc"->"cba"

import java.util.Stack;

public class Q2 {
    public static String reverseString(String str){
        Stack<Character>sc = new Stack<>();
        int idx = 0;
        while (idx<str.length()) {
            sc.push(str.charAt(idx));
            idx++;
        }
        StringBuilder sb = new StringBuilder("");
        while (!sc.isEmpty()){
            sb.append(sc.pop());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "abcfefeeeeeeee";
        System.out.println(reverseString(str));
    }
}
