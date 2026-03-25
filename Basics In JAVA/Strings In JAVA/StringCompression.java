public class StringCompression {
    public static String Compression(String str)
    {   
        StringBuilder sb = new StringBuilder("");
        
        int t=1;
        for(int i=0;i<str.length();i++)
        {
            if(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                t++;
            }
            else
            {
                sb.append(str.charAt(i));
                if(t!=1)
                {
                    sb.append(t);
                    t=1;
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aaabbcdddde";
        System.out.println(Compression(str));
    }
}
