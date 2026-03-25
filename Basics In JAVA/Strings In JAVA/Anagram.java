import java.util.Arrays;

public class Anagram {
    public static boolean checkAnagram(String str1 ,String str2)
    {
        boolean r = false;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length() == str2.length())
        {
            char s1[] = str1.toCharArray(); 
            char s2[] = str2.toCharArray(); 
            // This class contains various methods for manipulating arrays (such as sorting and searching). 
            Arrays.sort(s1);
            Arrays.sort(s2);
            r = Arrays.equals(s1,s2);
        }
        return r;
    }

    public static void main(String [] args)

    {
        String str1 = "race";
        String str2 = "care";
        System.out.println(checkAnagram(str1,str2));
    }
}

