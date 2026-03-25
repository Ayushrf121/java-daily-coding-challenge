public class FindSubsets
{
    public static void printSubset(String str , String ans , int i)
    {
        // base case.
        if(i==str.length())
        {
            if(ans.length()==0)
            {
                System.out.println("null");
            }
            System.out.println(ans);
            return;
        }
        // choices y/n
        // Yes
        printSubset(str, ans+str.charAt(i), i+1);
        // No
        printSubset(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        printSubset(str, "", 0);
    }
}