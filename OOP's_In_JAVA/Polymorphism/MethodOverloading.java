// OK so in method overloading um it works on a compile time polymorphism means that in a compile time yeah jo hai um compile time mahi sari functions to call karde Chai fir similar function and then ye jo hai hamar ko result written karta hai in at the last of the after the compilation the all the function
public class MethodOverloading{
    public static void main(String [] args)
    {
        Calculator cal = new Calculator();
        System.out.println(cal.sum(4, 5));
        System.out.println(cal.sum(4, 5,9));
        System.out.println(cal.sum((float)4.5,(float)3.2));
    }
}
class Calculator
{
    int sum(int a,int b)
    {
        return a+b;
    }
    float sum(float x,float y){
        return x+y;
    }
    int sum(int a,int b,int c)
    {
        return a+b+c;
    }
    // error because method overloading does not depend on the return type of function.
    // void sum(int a,int b)
    // {
    //     System.out.println(a+b);
    // }
}