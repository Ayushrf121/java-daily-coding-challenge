public class Interface {
    public static void main(String []args)
    {
        Tata t1 = new Tata();
        t1.wheels();
        Ktm k1 = new Ktm();
        k1.wheels();
    }
}

// interface define using implements
interface Vehicle
{
    // default modifier here public and abstract 
    void wheels();
}
class Tata implements Vehicle
{
    // default modifier is Default
    public void wheels()
    {
        System.out.println("This car has 4 wheels");
    }
}
class Ktm implements Vehicle
{
    public void wheels()
    {
        System.out.println("Our Bike has 2 wheels");
    }
} 

class Avon implements Vehicle
{
    public void wheels()
    {
        System.out.println("Bicycle has 2 wheels");
    }
}