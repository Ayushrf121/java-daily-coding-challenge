// Largest String
public class LargestString {
    public static void main(String[] args) {
        String str[] = {"apple","mango","banana"};
        String temp = str[0];
        // TC : O(x*n) x:total character it traverse and n total array traverse...  
        for (int i = 1; i < str.length; i++) {
            
            if (temp.compareToIgnoreCase(str[i])<0) {
                temp = str[i];
            }
        }
        System.out.println(temp);
        /*String str[] = {"apple","banana","mango"};
      String r = str[0];
      for (int i = 1; i < str.length; i++) {
        if(r.compareTo(str[i])<0)
        {
            r=str[i];
        }
      }
      System.out.println(r); */
    }
}
