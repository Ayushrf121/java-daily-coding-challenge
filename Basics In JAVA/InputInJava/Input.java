package InputInJava;
// Its a package that we imported for all classes eg. for input Scanner
import java.util.*;

public class Input {
 public static void main(String[] args) {
    // To take input from the user.
    Scanner sc = new Scanner(System.in);
    // .next() to read input without and further white space and .nextLine() it read entire input even the whitespaces.
    // String str = sc.next();
    String ptr = sc.nextLine();
    // System.out.println(str);
    System.out.println(ptr);
    // to take no. input
    int num = sc.nextInt();
    System.out.println(num);
    float f = sc.nextFloat();
    System.out.println(f);

    System.out.println("Hello Double:"+sc.nextDouble());

    sc.close();
 }   
}
