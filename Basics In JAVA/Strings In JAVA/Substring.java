public class Substring {
    public static String subString(String str,int st,int end)
    {
        String sub = "";
        for (int i = st; i < end; i++) {
            sub+=str.charAt(i);
        }
        return sub;
    }
    public static void main(String[] args) {
        String str = "Ayush Rawat";
        
        System.out.println(subString(str,1,7));
    }
}
