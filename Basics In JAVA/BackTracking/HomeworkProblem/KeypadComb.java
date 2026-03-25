/*Given a string containing digits from 2-9 inclusive, print all possible letter combinations that
the number could represent. You can print the answer in any order.
A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1
does not map to any letters.
Sample Input 1 : digits = "23"
Sample Output 1 : "ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"
Sample Input 2 : digits = "2"
Sample Output 2 : "a", "b", "c"
Sample Input 3 : digits = ""
Sample Output 3 : ” */

public class KeypadComb {
    final static char[][] L = { {}, {}, { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' },
            { 'j', 'k', 'l' }, { 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' },
            { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };
    
    public static void letterComb(String letter)
    {
        int l = letter.length();
        if(l==0)
        {
            System.out.println("");
            return;
        }
        combResult(0, l, letter, new StringBuilder());
    }
    public static void combResult(int pos, int len, String data, StringBuilder sb)
    {
        if(pos==len)
        {
            System.out.println(sb.toString());
            return;
        }else
        {
            char l[] = L[Character.getNumericValue(data.charAt(pos))];
            for (int i = 0; i < l.length; i++) {
                combResult(pos+1, len, data, new StringBuilder(sb).append(l[i]));
            }
        }
    }

    public static void main(String[] args) {
        letterComb("2345");
    }
}
