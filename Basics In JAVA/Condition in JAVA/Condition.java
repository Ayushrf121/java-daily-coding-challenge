public class Condition {
    public static void main(String[] args) {
        int age=16;
        if(age>=18)
        {
            System.out.println("Ye i am Adult");
        }
        else
        {
            System.out.println("No i am not");
        }
        // eg.
        int x=12,y=24;
        if(x>y)
        {
            System.err.println("X is greater "+x);
        }
        else
        {
            System.err.println("Y is greater "+y);
        }
        // eg.
        if(x%2==0)
        {
            System.out.println(x+" is an even");
        }
        else
        {
            System.out.println(x+" is odd");
        }

        // else if(){//code}
        int z=41;
        if(z<45)
        {
            System.out.println("Not good");
        }
        else if(z<62)
        {
            System.out.println("Must be better");
        }
        else
        {
            System.out.println("Good");
        }
    }
}
