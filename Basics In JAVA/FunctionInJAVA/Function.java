public class Function{
    public static int Sum(int a,int b)
    {
        return a+b;
    }
    public static void printHello()
    {
        System.out.println("Hello World!");
        return ; // optional
    }
    public static void main(String [] args)
    {
        printHello();
        printHello();
        printHello();
        printHello();
        int sum = Sum(4,5);
        System.out.println(sum);
    }
}