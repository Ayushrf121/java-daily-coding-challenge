public class RemoveDuplicate
{
    public static String rD(String str,boolean a[])
    {
        StringBuilder s = new StringBuilder();
        a[0]= true;
        s.append(str.charAt(0));
        for(int i=1;i<str.length();i++)
        {
            int idx = str.charAt(i) - 'a';
            if(a[idx]!=true)
            {
                a[idx] = true;
                s.append(str.charAt(i));
            }
        }
        return s.toString();
    }
    // Recursive Approach......
    public static void recursiveRD(String str,int i,boolean a[],StringBuilder newStr)
    {
        if(i==str.length())
        {
            System.out.println(newStr);
            return;
        }
        char ch = str.charAt(i);
        if(a[ch-'a']==true)
        {
            recursiveRD(str, i+1, a, newStr);
        }else
        {
            a[ch-'a'] = true;
            recursiveRD(str, i+1, a, newStr.append(str.charAt(i))); 
        }
    }
    public static void main(String[] args) {
        boolean a[] = new boolean[26];
        String str = "appnnacollege";
        StringBuilder s = new StringBuilder();
        // System.out.println(rD(str,a));
        recursiveRD(str,0,a,s);
    }
}