public class Permutation {
    public static void findPermutation(String str,String ans)
    {
        // base case
        if(str.length()==0)
        {   
            System.out.println(ans);
            return;
        }
        char ch;
        String newStr;
        for(int i=0;i<str.length();i++)
        {
            ch = str.charAt(i);
            newStr = str.substring(0, i) + str.substring(i+1);
            findPermutation(newStr, ans+ch);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str,"");        
    }
}
