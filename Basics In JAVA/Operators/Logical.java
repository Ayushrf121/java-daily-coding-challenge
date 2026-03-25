package Operators;

public class Logical {
    public static void main(String[] args) {
        boolean x=true;
        boolean y=false;
        // Logical AND
        if(x&&y)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        // Logical OR
        if(x||y)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        // Logical Not
        if(!x)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
