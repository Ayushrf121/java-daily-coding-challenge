public class StringBuilderBasic {
    public static void main(String[] args) {
       StringBuilder sb = new StringBuilder("");
       for(char i ='a' ;i<='z';i++)
       {
        sb.append(i);
       }
    //OK so the time complexity of string builder is O(26) and the Time complexity of the string is O(26*n^2) because string builder use append function over here that means that each character will be added to the last position while in a string it will always calculate the position from the starting till the end so for which the clamp complexity is O(26*n^2);
       System.out.println(sb.length()+" "+sb.charAt(2)+" "+sb.indexOf("d"));
       System.out.println(sb);
    }
}
