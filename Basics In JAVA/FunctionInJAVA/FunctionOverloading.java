// Function overloading....
public class FunctionOverloading {
    public static void multiple(int a,int b)
    {
        System.out.println(a*b);
    }
    public static void multiple(float a,float b)
    {
        System.out.println(a*b);
    }
    public static int multiple(int a,int b,int c)
    {
        return (a*b);
    }
    public static void main(String[] args) {
        multiple(4,5);
        multiple(4.4f,5.5f);
        // int m=multiple(8, 8); this will give error cuz JAVA doesnt depend on the return type.
        int m=multiple(8, 8,5);
        System.out.println(m);
    }
}
