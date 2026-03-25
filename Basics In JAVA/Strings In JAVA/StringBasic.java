import java.util.*;
public class StringBasic{
    public static void main(String[] args) {
        // Strings in JAVA are IMMUTABLE ie once the string is declared then we cant make any changes.
        String str = "Ayush Rawat";
        System.out.println(str);
        String str2 = new String("Mahesh Prasad");
        System.out.println(str2);

        // User Input
        // Scanner sc = new Scanner(System.in);
        // String name ;
        // // name = sc.next();
        // // System.out.println(name);
        // // since it will transfer the data of .next() after the space we had given to .nextLine() therefore we need to use
        // int x = 45;
        // String name2 ;
        // System.out.println(x);
        // name2 = sc.nextLine();
        // System.out.println(name2);

        // to find the length of the string..
        System.out.println(str.length());

    }
}