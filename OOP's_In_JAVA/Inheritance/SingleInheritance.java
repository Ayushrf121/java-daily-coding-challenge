// Single level Inheritance has only one Base Class and One Derive class..
public class SingleInheritance
{

    public static void main(String [] args)
    {
       Dog pitbul = new Dog();
       pitbul.canEat();
       pitbul.breathe();
       pitbul.legs();
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
class Dog extends Animal
{
    void legs()
    {
        System.out.println("Dogs have 4 legs");
    }
}