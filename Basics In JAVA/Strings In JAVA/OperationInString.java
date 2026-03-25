public class OperationInString {
    public static void main(String[] args) {
        String str = "Ayush";
        String str2 = "Rawat";
        String str3 = new String("Ayush");
        // concatination
        System.out.println(str+" "+str2);
        // .charAt(i)
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
        // .substring(start,end-1);
        System.out.println(str.substring(0, 2));
        // .toLowerCase()
        System.out.println(str.toLowerCase());
        // .toUpperCase()
        System.out.println(str.toUpperCase());
         // .isEmpty()
        System.out.println(str.isEmpty());
         // .toLowerCase()
        System.out.println(str.indexOf('u'));
        
        // to compare the strings.
        if(str.equals(str3))
        {
            System.out.println("Yes they are equal!");
        }
        else
        {
            System.out.println("No");
        }
        
    }
}
