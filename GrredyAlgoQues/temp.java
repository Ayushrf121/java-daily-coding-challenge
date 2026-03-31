/*You have an interesting string S of length N. It is interesting
because you can rearrange the characters of this string in any
order. You want to cut this string into some contiguous pieces
such that after cutting, all the pieces are equal to one another.
You can’t rearrange the characters in the cut pieces or join the
pieces together. You want to make the number of pieces as large
as possible. What is the maximum number of pieces you can get?
Note: You can observe that you may not want to cut the string at
all, therefore the number of pieces is 1. Hence, the answer always
exists

*/
public class temp {
    public static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    public static int checkMax(String str){
        int max=0;
        int charac[] = new int[26];
        // freq. count
        for (int i = 0; i < str.length(); i++) {
            charac[str.charAt(i)-'a']++;
        }
        for (int i = 0; i < charac.length; i++) {
            if(charac[i]>0){
                if(max==0){
                    max = charac[i];
                }else{
                    max = gcd(max,charac[i]);
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String str = "abccdcabacda";
        checkMax(str);
    }
}
