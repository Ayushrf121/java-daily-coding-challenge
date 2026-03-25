// Hybrid Inh. allows to have all type of inheritance in java except Multiple inheritance(One child class inherits from more than one parent class).

// 📌 Interview-friendly short answer
// Multiple inheritance is not supported in Java using classes because it leads to ambiguity like the Diamond Problem. Java avoids this complexity and instead provides multiple inheritance through interfaces.
// 💎 Diamond Problem
//       A
//      / \
//     B   C
//      \ /
//       D


// If A has a method:

// void show()


// Both B and C inherit it.
// Now D inherits from both B and C.

public class HybridInh {
    public static void main(String[] args) {
        
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
    void finn()
    {
        System.out.println("Fishes have finns");
    }
}
class Shark extends Fish
{
    void teeth()
    {
        System.out.println("Have large teeth");
    }
}
class Mammals extends Animal
{
    void canWalk()
    {
        System.out.println("Mammals can walk");
    }
}
class Dog extends Mammals
{
    void bark()
    {
        System.out.println("Dog can barks");
    }
}
class Pitbull extends Dog
{
    void danger()
    {
        System.out.println("One of the dangerous Dog!");
    }
} 