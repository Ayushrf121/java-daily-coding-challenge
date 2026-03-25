public class temp {
    final static char[][] L = { {}, {}, { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' },
            { 'j', 'k', 'l' }, { 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' },
            { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };
    
    public static void letterComb(String data)
    {
        if(data.length() == 0)
        {
            System.out.println("");
            return;
        }
        createComb(0,data.length(),data,new StringBuilder());
    }
    public static void createComb(int pos,int len,String data,StringBuilder sb)
    {
        if (pos == len) {
            System.out.println(sb.toString());
            return;
        } else {
            char [] l = L[Character.getNumericValue(data.charAt(pos))];
            for (int i = 0; i < l.length; i++) {
                createComb(pos+1, len, data, new StringBuilder(sb).append(l[i]));
            }
        }
    }
    public static void main(String[] args) {
         letterComb("23");
    }
}
