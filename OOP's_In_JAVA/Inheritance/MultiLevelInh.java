// Derive classes has its own sub derive classes..
public class MultiLevelInh {
    public static void main(String[] args) {
        Shark oggy = new Shark();
        oggy.canEat();
        oggy.breathe();
        oggy.Finn();
        oggy.Teeth();
    }
}


// Base Class
class Animal
{
    void canEat()
    {
        System.out.println("Can Eat");
    }
    void breathe()
    {
        System.out.println("Can Breathe");
    }
}

// Derive Class
class Fish extends Animal
{
    void Finn()
    {
        System.out.println("Fishes have finns");
    }
}

// Sub derive class..
class Shark extends Fish
{
    void Teeth()
    {
        System.out.println("Has largest no. of teeth!");
    }
}