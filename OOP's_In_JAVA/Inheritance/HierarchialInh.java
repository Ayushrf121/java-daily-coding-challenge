// Hierarchial Inh. has one Base class and multiple derive classes. 
public class HierarchialInh {
    public static void main(String[] args) {
        Dog pitbull = new Dog();
        Fish shark = new Fish();
        Bird parrot = new Bird();
        pitbull.bark();
        pitbull.breathe();
        parrot.Fly();
        parrot.breathe();
        shark.Finn();
        shark.breathe();
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

class Fish extends Animal
{
    void Finn()
    {
        System.out.println("Fishes have Finn");
    }
}

class Bird extends Animal
{
    void Fly()
    {
        System.out.println("Birds can Fly");
    }
}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog can bark");
    }
}